package com.ats.rusasoftapi.graph.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GetTotStudentPassedAndAppearInFinYr {
	
	@Id
	private int studPerformId;
	
	private int noStudAppear;
	
	private int noStudPass;
	
	private String nameOfProgram;
	
	private String programName;

	public int getStudPerformId() {
		return studPerformId;
	}

	public void setStudPerformId(int studPerformId) {
		this.studPerformId = studPerformId;
	}

	public int getNoStudAppear() {
		return noStudAppear;
	}

	public void setNoStudAppear(int noStudAppear) {
		this.noStudAppear = noStudAppear;
	}

	public int getNoStudPass() {
		return noStudPass;
	}

	public void setNoStudPass(int noStudPass) {
		this.noStudPass = noStudPass;
	}

	 
	public String getNameOfProgram() {
		return nameOfProgram;
	}

	public void setNameOfProgram(String nameOfProgram) {
		this.nameOfProgram = nameOfProgram;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	@Override
	public String toString() {
		return "GetTotStudentPassedAndAppearInFinYr [studPerformId=" + studPerformId + ", noStudAppear=" + noStudAppear
				+ ", noStudPass=" + noStudPass + ", nameOfProgram=" + nameOfProgram + ", programName=" + programName
				+ ", getStudPerformId()=" + getStudPerformId() + ", getNoStudAppear()=" + getNoStudAppear()
				+ ", getNoStudPass()=" + getNoStudPass() + ", getNameOfProgram()=" + getNameOfProgram()
				+ ", getProgramName()=" + getProgramName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	

}
