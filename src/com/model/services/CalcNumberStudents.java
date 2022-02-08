package com.model.services;

import java.util.Set;
import java.util.TreeSet;

import com.model.entities.Student;

public class CalcNumberStudents {

	public static Set<Student> calc(Set<Student> listOne, Set<Student> listTwo) {
		Set<Student> aux = new TreeSet<>(listOne);
		aux.addAll(listTwo);
		return aux;
	}
}
