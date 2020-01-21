package com.ats.rusasoftapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="institute_ivsr_gender_prog")
public class GenderEqalityPrg {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gprogId;
	private int instituteId;
	private int yearId;
	private String gprogName;
	private Date gprogFromdt;
	private Date gprogTodt;
	private int	gprogPcount;
	private int delStatus;
	private int isActive;
	private int makerUserId;
	private String makerDatetime;
	private int exInt1;
	private String exVar1;
	
	
	public int getGprogId() {
		return gprogId;
	}
	public void setGprogId(int gprogId) {
		this.gprogId = gprogId;
	}
	public String getGprogName() {
		return gprogName;
	}
	public void setGprogName(String gprogName) {
		this.gprogName = gprogName;
	}
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getGprogFromdt() {
		return gprogFromdt;
	}
	public void setGprogFromdt(Date gprogFromdt) {
		this.gprogFromdt = gprogFromdt;
	}
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getGprogTodt() {
		return gprogTodt;
	}
	public void setGprogTodt(Date gprogTodt) {
		this.gprogTodt = gprogTodt;
	}
	public int getGprogPcount() {
		return gprogPcount;
	}
	public void setGprogPcount(int gprogPcount) {
		this.gprogPcount = gprogPcount;
	}
	public int getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}
	public int getYearId() {
		return yearId;
	}
	public void setYearId(int yearId) {
		this.yearId = yearId;
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
	public int getMakerUserId() {
		return makerUserId;
	}
	public void setMakerUserId(int makerUserId) {
		this.makerUserId = makerUserId;
	}
	public String getMakerDatetime() {
		return makerDatetime;
	}
	public void setMakerDatetime(String makerDatetime) {
		this.makerDatetime = makerDatetime;
	}
	public int getExInt1() {
		return exInt1;
	}
	public void setExInt1(int exInt1) {
		this.exInt1 = exInt1;
	}
	public String getExVar1() {
		return exVar1;
	}
	public void setExVar1(String exVar1) {
		this.exVar1 = exVar1;
	}
	@Override
	public String toString() {
		return "GenderEqalityPrg [gprogId=" + gprogId + ", instituteId=" + instituteId + ", yearId=" + yearId
				+ ", gprogName=" + gprogName + ", gprogFromdt=" + gprogFromdt + ", gprogTodt=" + gprogTodt
				+ ", gprogPcount=" + gprogPcount + ", delStatus=" + delStatus + ", isActive=" + isActive
				+ ", makerUserId=" + makerUserId + ", makerDatetime=" + makerDatetime + ", exInt1=" + exInt1
				+ ", exVar1=" + exVar1 + "]";
	}
	

}
