package com.ats.rusasoftapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class GetHod {
	
	@Id
	private int hodId;
	private int instituteId;

	private String deptId;
	
 	
 	private String hodName;
 	private String contactNo;
	
 	private String email;
 	
	private String deptName;

	public int getHodId() {
		return hodId;
	}

	public void setHodId(int hodId) {
		this.hodId = hodId;
	}

	public int getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getHodName() {
		return hodName;
	}

	public void setHodName(String hodName) {
		this.hodName = hodName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "GetHod [hodId=" + hodId + ", instituteId=" + instituteId + ", deptId=" + deptId + ", hodName=" + hodName
				+ ", contactNo=" + contactNo + ", email=" + email + ", deptName=" + deptName + "]";
	}

	
	
}
