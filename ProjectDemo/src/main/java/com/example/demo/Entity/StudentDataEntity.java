package com.example.demo.Entity;
import jakarta.persistence.*;

@Entity
public class StudentDataEntity {
	
    @Id
    private int studentId;
    private String studentName;
    private String studentaddress;
    private String course;
    private Double markCPA;
    
    public StudentDataEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDataEntity(int studentId, String studentName, String studentaddress, String course, Double markCPA) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentaddress = studentaddress;
		this.course = course;
		this.markCPA = markCPA;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Double getMarkCPA() {
		return markCPA;
	}
	public void setMarkCPA(Double markCPA) {
		this.markCPA = markCPA;
	}
    
 }
