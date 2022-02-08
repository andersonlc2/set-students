package com.application;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.model.entities.Course;
import com.model.entities.Student;
import com.model.enums.Courses;
import com.model.services.CalcNumberStudents;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Course courseA = null;
		Course courseB = null;
		Course courseC = null;
		
		System.out.print("How many students for course A: ");
		int numbersA = sc.nextInt();
		courseA = new Course(Courses.A.toString());
		for (int i=0; i<numbersA; i++) {
			courseA.addStudent(new Student(sc.nextInt()));
		}
		
		System.out.print("How many students for course B: ");
		int numbersB = sc.nextInt();
		courseB = new Course(Courses.B.toString());
		for (int i=0; i<numbersB; i++) {
			courseB.addStudent(new Student(sc.nextInt()));
		}
		
		System.out.print("How many students for course C: ");
		int numbersC = sc.nextInt();
		courseC = new Course(Courses.C.toString());
		for (int i=0; i<numbersC; i++) {
			courseC.addStudent(new Student(sc.nextInt()));
		}
		
		Set<Student> result = new TreeSet<>(); 
		result = CalcNumberStudents.calc(courseA.getStudents(), courseB.getStudents());
		result = CalcNumberStudents.calc(result, courseC.getStudents());

		System.out.println("Total students: "+result.size());
		
		sc.close();
	}

}
