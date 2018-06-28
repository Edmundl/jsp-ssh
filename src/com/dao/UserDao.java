package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import com.model.HibernateSessionFactory;
import com.model.User;

public class UserDao {
	public static String i;
	public static User isLogin(String no,String pwd,String identity)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			if(identity.equals("管理员")){
				i="1";
			}else if(identity.equals("外聘教师")){
				i="2";
			}else if(identity.equals("教学助理")){
				i="3";
			}
			Criteria criteria=session.createCriteria(User.class);
			criteria.add(Restrictions.eq("username", no)).add(Restrictions.eq("password", pwd)).add(Restrictions.eq("identity", i));
			List<User> users=criteria.list();
			session.close();
			if(users.isEmpty())
			{
				return null;
			}else {
				return users.get(0);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	public static void deleteUser(String username)
	{
		System.out.println("2"+username);
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			User user=(User)session.get(User.class, username);
			session.delete(user);
			session.getTransaction().commit();
			session.clear();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static User  getUser(String username) {
		// TODO Auto-generated method stub
		
		Session session = HibernateSessionFactory.getSession();
		
		try {
			session.beginTransaction();
			User user=(User)session.get(User.class, username);
			session.getTransaction().commit();
			return user;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		
		} finally {
			session.close();
		}
		return null;
	}
	
	
	public static void addUser(String username,String password,String identity, String teanum)
	{
		Session session=HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setIdentity(identity);
		user.setTeanum(teanum);
		try {
			session.save(user);  //存入数据库
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public static List<User> getAlluser()
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			Criteria criteria=session.createCriteria(User.class);
			List<User> users=criteria.list();
		
			session.close();
			return users;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
