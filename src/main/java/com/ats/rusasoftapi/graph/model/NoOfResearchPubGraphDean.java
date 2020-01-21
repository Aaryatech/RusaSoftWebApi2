package com.ats.rusasoftapi.graph.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NoOfResearchPubGraphDean {
	
	@Id
	private int yearId;
	
	private String academicYear;
	
	private int noOfPublication;

	public int getYearId() {
		return yearId;
	}

	public void setYearId(int yearId) {
		this.yearId = yearId;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public int getNoOfPublication() {
		return noOfPublication;
	}

	public void setNoOfPublication(int noOfPublication) {
		this.noOfPublication = noOfPublication;
	}

	@Override
	public String toString() {
		return "NoOfResearchPubGraphDean [yearId=" + yearId + ", academicYear=" + academicYear + ", noOfPublication="
				+ noOfPublication + ", getYearId()=" + getYearId() + ", getAcademicYear()=" + getAcademicYear()
				+ ", getNoOfPublication()=" + getNoOfPublication() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
