package com.ats.rusasoftapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_faculty_award")
public class FacultyAward {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="award_id")
	private int awardId;
	
	@Column(name="faculty_id ")
	private int facultyId ;
	
	@Column(name="year_id")
	private int yearId;
	
	@Column(name="award_name")
	private String awardName;
	
	@Column(name="award_authority")
	private String awardAuthority;
	
	@Column(name="award_nature")
	private String awardNature;
	
	@Column(name="award_date")
	private String awardDate;
	
	@Column(name="award_validity")
	private int awardValidity;	
	
	@Column(name="award_validity_from")
	private String awardValidityFrom;
	
	@Column(name="award_validity_to")
	private String awardValidityTo;
	
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

	public int getAwardId() {
		return awardId;
	}

	public void setAwardId(int awardId) {
		this.awardId = awardId;
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

	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public String getAwardAuthority() {
		return awardAuthority;
	}

	public void setAwardAuthority(String awardAuthority) {
		this.awardAuthority = awardAuthority;
	}

	public String getAwardNature() {
		return awardNature;
	}

	public void setAwardNature(String awardNature) {
		this.awardNature = awardNature;
	}

	public String getAwardDate() {
		return awardDate;
	}

	public void setAwardDate(String awardDate) {
		this.awardDate = awardDate;
	}

	public int getAwardValidity() {
		return awardValidity;
	}

	public void setAwardValidity(int awardValidity) {
		this.awardValidity = awardValidity;
	}

	public String getAwardValidityFrom() {
		return awardValidityFrom;
	}

	public void setAwardValidityFrom(String awardValidityFrom) {
		this.awardValidityFrom = awardValidityFrom;
	}

	public String getAwardValidityTo() {
		return awardValidityTo;
	}

	public void setAwardValidityTo(String awardValidityTo) {
		this.awardValidityTo = awardValidityTo;
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

	@Override
	public String toString() {
		return "FacultyAward [awardId=" + awardId + ", facultyId=" + facultyId + ", yearId=" + yearId + ", awardName="
				+ awardName + ", awardAuthority=" + awardAuthority + ", awardNature=" + awardNature + ", awardDate="
				+ awardDate + ", awardValidity=" + awardValidity + ", awardValidityFrom=" + awardValidityFrom
				+ ", awardValidityTo=" + awardValidityTo + ", makerUserId=" + makerUserId + ", makerEnterDatetime="
				+ makerEnterDatetime + ", delStatus=" + delStatus + ", isActive=" + isActive + ", exInt1=" + exInt1
				+ ", exInt2=" + exInt2 + ", exVar1=" + exVar1 + ", exVar2=" + exVar2 + "]";
	}
	
	
}
