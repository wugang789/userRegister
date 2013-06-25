package com.cn.control;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.util.DbUtil;

/**
 * 用户注册
 * 
 * @author Administrator
 * 
 */
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public register() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String newname = new String(username.getBytes("ISo8859-1"), "UTF-8");
		int isManager = Integer.valueOf(request.getParameter("ismanager"));
		
		String password = request.getParameter("password");
		String surePassword=request.getParameter("password2");
		System.out.println(surePassword);
		String SQL = "insert into user values("+null+","+"'"+newname+"'"+","+isManager+","+"'"+password+"'"+")";
		if(password.equals(surePassword)){
			Connection conn = null;
			PreparedStatement prs = null;
			try {
				conn = DbUtil.getconn();
				prs = conn.prepareStatement(SQL);
				System.out.println(">>>>>>>>>>>>>>" + newname + SQL);
				prs.execute();
				response.sendRedirect("/userRegister/success.jsp");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}else{
			response.sendRedirect("/userRegister/Register.jsp");
		}
		
		

	}

}
