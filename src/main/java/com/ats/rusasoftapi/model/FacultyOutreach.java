package com.ats.rusasoftapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_faculty_outreach")
public class FacultyOutreach {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name=" 	outreach_id")
	private int outreachId;
	
	@Column(name="faculty_id ")
	private int facultyId ;
	
	@Column(name="year_id")
	private int yearId;
	
	@Column(name="outreach_type")
	private String outreachType;
	
	@Column(name="outreach_name")
	private String outreachName;
	
	@Column(name="outreach_level")
	private String outreachLevel;
	
	@Column(name="outreach_date")
	private String outreachDate;
	
	@Column(name="maker_user_id")
	private int makerUserId;
	
	@Column(name="maker_enter_datetime")
	private String makerEnterDatetime;
	
	@Column(name="del_status")
	private int delStatus;
	
	@Column(name="is_active ")
	private int isActive ;
	
	@Column(name="ex_int1")
	private int exInt1;
	
	@Column(name="ex_int2")
	private int exInt2;
	
	@Column(name="ex_var1")
	private String exVar1;
	
	@Column(name="ex_var2")
	private String exVar2;
	
	@Column(name="institute_id")
	private int instituteId;
	
	

	public int getOutreachId() {
		return outreachId;
	}

	public void setOutreachId(int outreachId) {
		this.outreachId = outreachId;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public int getYearId() {
		return yearId;
	}

	public void setYearId(int yearId) {
		this.yearId = yearId;
	}

	public String getOutreachType() {
		return outreachType;
	}

	public void setOutreachType(String outreachType) {
		this.outreachType = outreachType;
	}

	public String getOutreachName() {
		return outreachName;
	}

	public void setOutreachName(String outreachName) {
		this.outreachName = outreachName;
	}

	public String getOutreachLevel() {
		return outreachLevel;
	}

	public void setOutreachLevel(String outreachLevel) {
		this.outreachLevel = outreachLevel;
	}

	public String getOutreachDate() {
		return outreachDate;
	}

	public void setOutreachDate(String outreachDate) {
		this.outreachDate = outreachDate;
	}

	public int getMakerUserId() {
		return makerUserId;
	}

	public void setMakerUserId(int makerUserId) {
		this.makerUserId = makerUserId;
	}

	public String getMakerEnterDatetime() {
		return makerEnterDatetime;
	}

	public void setMakerEnterDatetime(String makerEnterDatetime) {
		this.makerEnterDatetime = makerEnterDatetime;
	}

	public int getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
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

	public String getExVar1() {
		return exVar1;
	}

	public void setExVar1(String exVar1) {
		this.exVar1 = exVar1;
	}

	public String getExVar2() {
		return exVar2;
	}

	public void setExVar2(String exVar2) {
		this.exVar2 = exVar2;
	}
	
	

	public int getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}

	@Override
	public String toString() {
		return "FacultyOutreach [outreachId=" + outreachId + ", facultyId=" + facultyId + ", yearId=" + yearId
				+ ", outreachType=" + outreachType + ", outreachName=" + outreachName + ", outreachLevel="
				+ outreachLevel + ", outreachDate=" + outreachDate + ", makerUserId=" + makerUserId
				+ ", makerEnterDatetime=" + makerEnterDatetime + ", delStatus=" + delStatus + ", isActive=" + isActive
				+ ", exInt1=" + exInt1 + ", exInt2=" + exInt2 + ", exVar1=" + exVar1 + ", exVar2=" + exVar2
				+ ", instituteId=" + instituteId + "]";
	}

	
}
