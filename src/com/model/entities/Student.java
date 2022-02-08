package com.model.entities;

import java.util.Objects;

public class Student implements Comparable<Student>{

	private Integer Id;

	public Student(Integer id) {
		Id = id;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public int compareTo(Student other) {
		return Id.compareTo(other.getId());
	}
	
}
