package com.ats.rusasoftapi.model.budget;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GetLibraryBudget {

	@Id
	private int libBudgetId;
	
	private int finYearId;
	private int acYearId;
	private int instituteId;
	
	private String libBudgetTitle;
	
	private int budgetAllocated;
	private int budgetUtilized; 
	
	private String academicYear;
	private String finYear;
	private String exVar1;
	private int exInt1;
	private String exVar2 ;
	
	public int getExInt1() {
		return exInt1;
	}
	public void setExInt1(int exInt1) {
		this.exInt1 = exInt1;
	}
	public String getExVar1() {
		return exVar1;
	}
	
	public String getExVar2() {
		return exVar2;
	}
	public void setExVar2(String exVar2) {
		this.exVar2 = exVar2;
	}
	public void setExVar1(String exVar1) {
		this.exVar1 = exVar1;
	}
	public int getLibBudgetId() {
		return libBudgetId;
	}
	public void setLibBudgetId(int libBudgetId) {
		this.libBudgetId = libBudgetId;
	}
	public int getFinYearId() {
		return finYearId;
	}
	public void setFinYearId(int finYearId) {
		this.finYearId = finYearId;
	}
	public int getAcYearId() {
		return acYearId;
	}
	public void setAcYearId(int acYearId) {
		this.acYearId = acYearId;
	}
	public int getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}
	public String getLibBudgetTitle() {
		return libBudgetTitle;
	}
	public void setLibBudgetTitle(String libBudgetTitle) {
		this.libBudgetTitle = libBudgetTitle;
	}
	public int getBudgetAllocated() {
		return budgetAllocated;
	}
	public void setBudgetAllocated(int budgetAllocated) {
		this.budgetAllocated = budgetAllocated;
	}
	public int getBudgetUtilized() {
		return budgetUtilized;
	}
	public void setBudgetUtilized(int budgetUtilized) {
		this.budgetUtilized = budgetUtilized;
	}
	public String getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}
	public String getFinYear() {
		return finYear;
	}
	public void setFinYear(String finYear) {
		this.finYear = finYear;
	}
	@Override
	public String toString() {
		return "GetLibraryBudget [libBudgetId=" + libBudgetId + ", finYearId=" + finYearId + ", acYearId=" + acYearId
				+ ", instituteId=" + instituteId + ", libBudgetTitle=" + libBudgetTitle + ", budgetAllocated="
				+ budgetAllocated + ", budgetUtilized=" + budgetUtilized + ", academicYear=" + academicYear
				+ ", finYear=" + finYear + ", exVar1=" + exVar1 + ", exInt1=" + exInt1 + ", exVar2=" + exVar2 + "]";
	}
	
}
