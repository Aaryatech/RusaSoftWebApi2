package com.ats.rusasoftapi.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class MExtActList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int instExtensionActId;
	private int extensionActivityId;
	private int instId;
	private int acYearId;
	private String tActivityTitle;
	private int noOfStudParticipated;
	private int noOfStudInInst;
	private int noOfFacultyParticipated;
	private int noOfFacultyInInst;
	private int delStatus;
	private int isActive;
	private int makerUserId;
	private String makerDatetime;
	private int exInt1;
	private String exVar1;
	private int exInt2;
	private String exVar2;
	private Date fromDate;
	private Date toDate;

	// private String activityTitle;
	public int getInstExtensionActId() {
		return instExtensionActId;
	}

	public void setInstExtensionActId(int instExtensionActId) {
		this.instExtensionActId = instExtensionActId;
	}

	public int getExtensionActivityId() {
		return extensionActivityId;
	}

	public void setExtensionActivityId(int extensionActivityId) {
		this.extensionActivityId = extensionActivityId;
	}

	public int getInstId() {
		return instId;
	}

	public void setInstId(int instId) {
		this.instId = instId;
	}

	public int getAcYearId() {
		return acYearId;
	}

	public void setAcYearId(int acYearId) {
		this.acYearId = acYearId;
	}

	/*
	 * public String getActivityTitle() { return activityTitle; } public void
	 * setActivityTitle(String activityTitle) { this.activityTitle = activityTitle;
	 * }
	 */
	public int getNoOfStudParticipated() {
		return noOfStudParticipated;
	}

	public void setNoOfStudParticipated(int noOfStudParticipated) {
		this.noOfStudParticipated = noOfStudParticipated;
	}

	public int getNoOfStudInInst() {
		return noOfStudInInst;
	}

	public void setNoOfStudInInst(int noOfStudInInst) {
		this.noOfStudInInst = noOfStudInInst;
	}

	public int getNoOfFacultyParticipated() {
		return noOfFacultyParticipated;
	}

	public void setNoOfFacultyParticipated(int noOfFacultyParticipated) {
		this.noOfFacultyParticipated = noOfFacultyParticipated;
	}

	public int getNoOfFacultyInInst() {
		return noOfFacultyInInst;
	}

	public void setNoOfFacultyInInst(int noOfFacultyInInst) {
		this.noOfFacultyInInst = noOfFacultyInInst;
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

	public int getExInt2() {
		return exInt2;
	}

	public void setExInt2(int exInt2) {
		this.exInt2 = exInt2;
	}

	public String getExVar2() {
		return exVar2;
	}

	public void setExVar2(String exVar2) {
		this.exVar2 = exVar2;
	}

	public String gettActivityTitle() {
		return tActivityTitle;
	}

	public void settActivityTitle(String tActivityTitle) {
		this.tActivityTitle = tActivityTitle;
	}

	@JsonFormat(locale = "ENGLISH", timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	@JsonFormat(locale = "ENGLISH", timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "MExtActList [instExtensionActId=" + instExtensionActId + ", extensionActivityId=" + extensionActivityId
				+ ", instId=" + instId + ", acYearId=" + acYearId + ", tActivityTitle=" + tActivityTitle
				+ ", noOfStudParticipated=" + noOfStudParticipated + ", noOfStudInInst=" + noOfStudInInst
				+ ", noOfFacultyParticipated=" + noOfFacultyParticipated + ", noOfFacultyInInst=" + noOfFacultyInInst
				+ ", delStatus=" + delStatus + ", isActive=" + isActive + ", makerUserId=" + makerUserId
				+ ", makerDatetime=" + makerDatetime + ", exInt1=" + exInt1 + ", exVar1=" + exVar1 + ", exInt2="
				+ exInt2 + ", exVar2=" + exVar2 + ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}

}
