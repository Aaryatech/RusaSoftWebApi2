package com.ats.rusasoftapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mi_institute_linkage_master")
public class LinkageMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int linknameId;

	private int instituteId;

	private String linknameText;

	private String linknameRemarks;

	private int delStatus;

	private int isActive;

	private int makerUserId;

	private String makerDatetime;

	public int getLinknameId() {
		return linknameId;
	}

	public void setLinknameId(int linknameId) {
		this.linknameId = linknameId;
	}

	public int getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}

	public String getLinknameText() {
		return linknameText;
	}

	public void setLinknameText(String linknameText) {
		this.linknameText = linknameText;
	}

	public String getLinknameRemarks() {
		return linknameRemarks;
	}

	public void setLinknameRemarks(String linknameRemarks) {
		this.linknameRemarks = linknameRemarks;
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

	@Override
	public String toString() {
		return "LinkageMaster [linknameId=" + linknameId + ", instituteId=" + instituteId + ", linknameText="
				+ linknameText + ", linknameRemarks=" + linknameRemarks + ", delStatus=" + delStatus + ", isActive="
				+ isActive + ", makerUserId=" + makerUserId + ", makerDatetime=" + makerDatetime + "]";
	}

}
