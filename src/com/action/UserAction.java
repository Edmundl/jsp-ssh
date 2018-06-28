package com.action;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.UserDao;
import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	public String login()throws Exception{
		//�õ�context
		ActionContext context=ActionContext.getContext();
		HttpServletRequest request=ServletActionContext.getRequest();
		//ȡ���û���
		String username=request.getParameter("username");
		//��¼����
		String password=request.getParameter("password");
		//��¼���
		String identity=request.getParameter("iden");
		//�Ƿ�Ϊ��
		if(username.isEmpty()||password.isEmpty()||identity.isEmpty())
		{
			return ERROR;
		}else {
			//�������ݿ�
			User user=UserDao.isLogin(username,password,identity);
			if(user==null)
			{
				return ERROR;
			}else if(identity.equals("����Ա")){
				return "admin";
			}else if(identity.equals("��ѧ����")){
				return "assistant";
			}else{
				return SUCCESS;
			}
		}		
	}
	public String delUser()throws Exception{
		ActionContext context=ActionContext.getContext();
		HttpServletRequest request=ServletActionContext.getRequest();
		String username=request.getParameter("username");
		UserDao.deleteUser(username);
		List<User> userList=UserDao.getAlluser();
		context.put("userlist", userList);
		
		return "user";
		
	}
	public String toAddUser()throws Exception{
		return "toAddUser";
	}
	public String addUser()throws Exception{
		//�õ�context
		ActionContext context=ActionContext.getContext();
		HttpServletRequest request=ServletActionContext.getRequest();
		String username=request.getParameter("username");
		String pwd=request.getParameter("pwd");
		String identity=request.getParameter("identity");
		String teanum=request.getParameter("teanum");
//		System.out.println(username);
//		System.out.println(pwd);
//		System.out.println(identity);
//		System.out.println(teanum);
		UserDao.addUser(username, pwd,identity, teanum);
		return "user";
	}
	
	public String toupdateUser()throws Exception{
		return "toupdateUser";
	}
	
	public String updateUser()throws Exception{
		//	FileUtils.copyFile(srcFile, destFile)
			ActionContext context=ActionContext.getContext();
			HttpServletRequest request=ServletActionContext.getRequest();
			String username=request.getParameter("username");
			
			
			User user=UserDao.getUser(username);
			context.put("user", user);
			return "gotouserM";
		}
	
	
	public String showUserList()throws Exception{
		ActionContext context=ActionContext.getContext();
	
		List<User> userList=UserDao.getAlluser();
		context.put("userlist", userList);

		return "user";
	}

}
