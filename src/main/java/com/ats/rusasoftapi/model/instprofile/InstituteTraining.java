package com.ats.rusasoftapi.model.instprofile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_institute_training")
public class InstituteTraining {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int trainingId;
	
	private int instituteId;
	
	private int yearId;
	
	private int trainingType;
	private String trainingTitle;
	
	private String trainingFromdt;
	private String trainingTodt;
	
	private int trainingPcount;
	
	private int delStatus;
	private int isActive;
	
	private int makerUserId;
	private String makerDatetime;
	
	
	private int exInt1;
	private int exInt2;
	private String exVar1;
	private String exVar2;
	
	public int getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
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
	public int getTrainingType() {
		return trainingType;
	}
	public void setTrainingType(int trainingType) {
		this.trainingType = trainingType;
	}
	public String getTrainingTitle() {
		return trainingTitle;
	}
	public void setTrainingTitle(String trainingTitle) {
		this.trainingTitle = trainingTitle;
	}
	public String getTrainingFromdt() {
		return trainingFromdt;
	}
	public void setTrainingFromdt(String trainingFromdt) {
		this.trainingFromdt = trainingFromdt;
	}
	public String getTrainingTodt() {
		return trainingTodt;
	}
	public void setTrainingTodt(String trainingTodt) {
		this.trainingTodt = trainingTodt;
	}
	public int getTrainingPcount() {
		return trainingPcount;
	}
	public void setTrainingPcount(int trainingPcount) {
		this.trainingPcount = trainingPcount;
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
		return "InstituteTraining [trainingId=" + trainingId + ", instituteId=" + instituteId + ", yearId=" + yearId
				+ ", trainingType=" + trainingType + ", trainingTitle=" + trainingTitle + ", trainingFromdt="
				+ trainingFromdt + ", trainingTodt=" + trainingTodt + ", trainingPcount=" + trainingPcount
				+ ", delStatus=" + delStatus + ", isActive=" + isActive + ", makerUserId=" + makerUserId
				+ ", makerDatetime=" + makerDatetime + ", exInt1=" + exInt1 + ", exInt2=" + exInt2 + ", exVar1="
				+ exVar1 + ", exVar2=" + exVar2 + "]";
	}

}
