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
 * 用户登录
 * @author Administrator
 *
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public login() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String newname = new String(name.getBytes("ISo8859-1"), "UTF-8");
		String password=request.getParameter("password");
		String SQL ="select userName,password from user where userName=? and password=? and isManager=1 ";
		Connection conn = null;
		PreparedStatement prs = null;
		try {
			conn =DbUtil.getconn();
			prs = conn.prepareStatement(SQL);
			prs.setString(1, newname);
			prs.setString(2, password);
			System.out.println(">>>>>>>>>>>>>>" + newname + SQL);
			ResultSet rs=prs.executeQuery();
			if(rs.next()){
				if(rs.getString("userName").equals(newname)&&rs.getString("password").equals(password)){
					request.getSession().setAttribute("name",newname);
				request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);
				}else{
					System.out.println("登录失败");
				}
			}else{
				request.getRequestDispatcher("/error.jsp").forward(request,response);
			}
			
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

		
	}

}
