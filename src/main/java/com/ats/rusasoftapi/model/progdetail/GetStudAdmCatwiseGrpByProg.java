package com.ats.rusasoftapi.model.progdetail;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GetStudAdmCatwiseGrpByProg {
	
	@Id
	private int programId;
	
	private int maleStudent;
	private int femaleStudent;
	private int transStudent;
	private int totStudent;
	
	private String progType;
	private String progName;
	private int exInt1;
	
	public int getExInt1() {
		return exInt1;
	}
	public void setExInt1(int exInt1) {
		this.exInt1 = exInt1;
	}
	public int getProgramId() {
		return programId;
	}
	public void setProgramId(int programId) {
		this.programId = programId;
	}
	public int getMaleStudent() {
		return maleStudent;
	}
	public void setMaleStudent(int maleStudent) {
		this.maleStudent = maleStudent;
	}
	public int getFemaleStudent() {
		return femaleStudent;
	}
	public void setFemaleStudent(int femaleStudent) {
		this.femaleStudent = femaleStudent;
	}
	public int getTransStudent() {
		return transStudent;
	}
	public void setTransStudent(int transStudent) {
		this.transStudent = transStudent;
	}
	
	public int getTotStudent() {
		return totStudent;
	}
	public void setTotStudent(int totStudent) {
		this.totStudent = totStudent;
	}
	public String getProgType() {
		return progType;
	}
	public void setProgType(String progType) {
		this.progType = progType;
	}
	public String getProgName() {
		return progName;
	}
	public void setProgName(String progName) {
		this.progName = progName;
	}
	@Override
	public String toString() {
		return "GetStudAdmCatwiseGrpByProg [programId=" + programId + ", maleStudent=" + maleStudent
				+ ", femaleStudent=" + femaleStudent + ", transStudent=" + transStudent + ", totStudent=" + totStudent
				+ ", progType=" + progType + ", progName=" + progName + ", exInt1=" + exInt1 + "]";
	}
	

	
}
