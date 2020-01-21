package com.ats.rusasoftapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GetFacultyConsultancy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int consId;

	private int facultyId;

	private int yearId;

	private String consNature;

	private String consSponsor;

	private float consAmount;

	private String consPeriod;

	private int isConsCompleted;

	private int isActive;

	private int delStatus;

	private String makerDatetime;

	private int makerUserId;

	private int exInt1;

	private int exInt2;

	private String exVar1;

	private String exVar2;

	private String deptName;
	private String facultyFirstName;

	public int getConsId() {
		return consId;
	}

	public void setConsId(int consId) {
		this.consId = consId;
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

	public String getConsNature() {
		return consNature;
	}

	public void setConsNature(String consNature) {
		this.consNature = consNature;
	}

	public String getConsSponsor() {
		return consSponsor;
	}

	public void setConsSponsor(String consSponsor) {
		this.consSponsor = consSponsor;
	}

	public float getConsAmount() {
		return consAmount;
	}

	public void setConsAmount(float consAmount) {
		this.consAmount = consAmount;
	}

	public String getConsPeriod() {
		return consPeriod;
	}

	public void setConsPeriod(String consPeriod) {
		this.consPeriod = consPeriod;
	}

	public int getIsConsCompleted() {
		return isConsCompleted;
	}

	public void setIsConsCompleted(int isConsCompleted) {
		this.isConsCompleted = isConsCompleted;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	public String getMakerDatetime() {
		return makerDatetime;
	}

	public void setMakerDatetime(String makerDatetime) {
		this.makerDatetime = makerDatetime;
	}

	public int getMakerUserId() {
		return makerUserId;
	}

	public void setMakerUserId(int makerUserId) {
		this.makerUserId = makerUserId;
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

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getFacultyFirstName() {
		return facultyFirstName;
	}

	public void setFacultyFirstName(String facultyFirstName) {
		this.facultyFirstName = facultyFirstName;
	}

	@Override
	public String toString() {
		return "GetFacultyConsultancy [consId=" + consId + ", facultyId=" + facultyId + ", yearId=" + yearId
				+ ", consNature=" + consNature + ", consSponsor=" + consSponsor + ", consAmount=" + consAmount
				+ ", consPeriod=" + consPeriod + ", isConsCompleted=" + isConsCompleted + ", isActive=" + isActive
				+ ", delStatus=" + delStatus + ", makerDatetime=" + makerDatetime + ", makerUserId=" + makerUserId
				+ ", exInt1=" + exInt1 + ", exInt2=" + exInt2 + ", exVar1=" + exVar1 + ", exVar2=" + exVar2
				+ ", deptName=" + deptName + ", facultyFirstName=" + facultyFirstName + "]";
	}

}
