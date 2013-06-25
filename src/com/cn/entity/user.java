package com.cn.entity;
/**
 * 用户实体类
 * @author Administrator
 *
 */
public class user {

	/**
	 * Id
	 */
	private int userid;
	
	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 是否是管理员，1表示普通会员。0表示管理员
	 */
	
	 private int isManager;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIsManager() {
		return isManager;
	}
	public void setIsManager(int isManager) {
		this.isManager = isManager;
	}
	@Override
	public String toString() {
		return "user [userid=" + userid + ", userName=" + userName
				+ ", password=" + password + ", isManager=" + isManager + "]";
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public user(int userid, String userName, String password, int isManager) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.password = password;
		this.isManager = isManager;
	}
	 
	 

	
	 
	 
}
