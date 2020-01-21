package com.ats.rusasoftapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class LoginResponse {
	
	    @Id
	    private int userId;
		
		private int userType;
		
		private String userName;
		private String pass;
		private int isBlock;
		private int regPrimaryKey;
		private String roleId;
		private int exInt1;
		private int exInt2;
		
        @Transient
		GetUserDetail getData;
        
        @Transient
        Staff staff;
        

		public Staff getStaff() {
			return staff;
		}

		public void setStaff(Staff staff) {
			this.staff = staff;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public int getUserType() {
			return userType;
		}

		public void setUserType(int userType) {
			this.userType = userType;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}

		public int getIsBlock() {
			return isBlock;
		}

		public void setIsBlock(int isBlock) {
			this.isBlock = isBlock;
		}

		public int getRegPrimaryKey() {
			return regPrimaryKey;
		}

		public void setRegPrimaryKey(int regPrimaryKey) {
			this.regPrimaryKey = regPrimaryKey;
		}

		public String getRoleId() {
			return roleId;
		}

		public void setRoleId(String roleId) {
			this.roleId = roleId;
		}

		public GetUserDetail getGetData() {
			return getData;
		}

		public void setGetData(GetUserDetail getData) {
			this.getData = getData;
		}

		public int getExInt1() {
			return exInt1;
		}

		public void setExInt1(int exInt1) {
			this.exInt1 = exInt1;
		}

		public int getExInt2() {
			return exInt2;
		}

		public void setExInt2(int exInt2) {
			this.exInt2 = exInt2;
		}

		@Override
		public String toString() {
			return "LoginResponse [userId=" + userId + ", userType=" + userType + ", userName=" + userName + ", pass="
					+ pass + ", isBlock=" + isBlock + ", regPrimaryKey=" + regPrimaryKey + ", roleId=" + roleId
					+ ", exInt1=" + exInt1 + ", exInt2=" + exInt2 + ", getData=" + getData + ", staff=" + staff + "]";
		}

		
	
        
        
	
	
	

}
