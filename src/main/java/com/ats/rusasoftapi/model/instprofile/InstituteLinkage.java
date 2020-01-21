package com.ats.rusasoftapi.model.instprofile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_institute_linkage")
public class InstituteLinkage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int linkId;
	
	private int instituteId;
	
	private int yearId;
	
	private int linknameId ;
	private String linkAgency ;
	private String linkNature ;
	private String linkBeneficiary ;
 	private int linkBeneficiaryNos; 
	private int delStatus;
	private int isActive;
	
	private int makerUserId;
	private String makerDatetime;
	
	private int exInt1;
	private int exInt2;
	private String exVar1;
	private String exVar2;
	
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
	public int getLinknameId() {
		return linknameId;
	}
	public void setLinknameId(int linknameId) {
		this.linknameId = linknameId;
	}
	public String getLinkAgency() {
		return linkAgency;
	}
	public void setLinkAgency(String linkAgency) {
		this.linkAgency = linkAgency;
	}
	public String getLinkNature() {
		return linkNature;
	}
	public void setLinkNature(String linkNature) {
		this.linkNature = linkNature;
	}

	public int getLinkBeneficiaryNos() {
		return linkBeneficiaryNos;
	}
	public void setLinkBeneficiaryNos(int linkBeneficiaryNos) {
		this.linkBeneficiaryNos = linkBeneficiaryNos;
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
	public int getLinkId() {
		return linkId;
	}
	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}
	public String getLinkBeneficiary() {
		return linkBeneficiary;
	}
	public void setLinkBeneficiary(String linkBeneficiary) {
		this.linkBeneficiary = linkBeneficiary;
	}
	@Override
	public String toString() {
		return "InstituteLinkage [linkId=" + linkId + ", instituteId=" + instituteId + ", yearId=" + yearId
				+ ", linknameId=" + linknameId + ", linkAgency=" + linkAgency + ", linkNature=" + linkNature
				+ ", linkBeneficiary=" + linkBeneficiary + ", linkBeneficiaryNos=" + linkBeneficiaryNos + ", delStatus="
				+ delStatus + ", isActive=" + isActive + ", makerUserId=" + makerUserId + ", makerDatetime="
				+ makerDatetime + ", exInt1=" + exInt1 + ", exInt2=" + exInt2 + ", exVar1=" + exVar1 + ", exVar2="
				+ exVar2 + ", getInstituteId()=" + getInstituteId() + ", getYearId()=" + getYearId()
				+ ", getLinknameId()=" + getLinknameId() + ", getLinkAgency()=" + getLinkAgency() + ", getLinkNature()="
				+ getLinkNature() + ", getLinkBeneficiaryNos()=" + getLinkBeneficiaryNos() + ", getDelStatus()="
				+ getDelStatus() + ", getIsActive()=" + getIsActive() + ", getMakerUserId()=" + getMakerUserId()
				+ ", getMakerDatetime()=" + getMakerDatetime() + ", getExInt1()=" + getExInt1() + ", getExInt2()="
				+ getExInt2() + ", getExVar1()=" + getExVar1() + ", getExVar2()=" + getExVar2() + ", getLinkId()="
				+ getLinkId() + ", getLinkBeneficiary()=" + getLinkBeneficiary() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
