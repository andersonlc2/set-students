package com.model.entities;

import java.util.Set;
import java.util.TreeSet;

public class Course {

	private String nome;
	
	private Set<Student> students = new TreeSet<>();

	public Course(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
}
