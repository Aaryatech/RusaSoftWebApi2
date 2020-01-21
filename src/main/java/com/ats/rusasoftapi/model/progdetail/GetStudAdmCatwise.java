package com.ats.rusasoftapi.model.progdetail;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GetStudAdmCatwise {

	@Id
	private int studentCatId;
	private int maleStudent;
	private int femaleStudent;
	private int transStudent;
	private int catTotStudent;
	private int seats;
	private int castId;
	private String castName;
	

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getStudentCatId() {
		return studentCatId;
	}

	public void setStudentCatId(int studentCatId) {
		this.studentCatId = studentCatId;
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

	public int getCatTotStudent() {
		return catTotStudent;
	}

	public void setCatTotStudent(int catTotStudent) {
		this.catTotStudent = catTotStudent;
	}

	public String getCastName() {
		return castName;
	}

	public void setCastName(String castName) {
		this.castName = castName;
	}

	public int getCastId() {
		return castId;
	}

	public void setCastId(int castId) {
		this.castId = castId;
	}

	@Override
	public String toString() {
		return "GetStudAdmCatwise [studentCatId=" + studentCatId + ", maleStudent=" + maleStudent + ", femaleStudent="
				+ femaleStudent + ", transStudent=" + transStudent + ", catTotStudent=" + catTotStudent + ", seats="
				+ seats + ", castId=" + castId + ", castName=" + castName + "]";
	}

	
	
	
	/*
	SELECT t_program_student_category.student_cat_id, m_cast.cast_name,
t_program_student_category.male_student,t_program_student_category.female_student,t_program_student_category.trans_student,
t_program_student_category.cat_tot_student
FROM t_program_student_category
LEFT JOIN  m_cast
ON t_program_student_category.cast_id=m_cast.cast_id
WHERE t_program_student_category.is_active=1 AND t_program_student_category.del_status=1
AND t_program_student_category.year_id=1 AND t_program_student_category.institute_id=2
	 */
}
