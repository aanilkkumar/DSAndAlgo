package com.datastructure.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparatorTest {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();
		
		Student student1 = new Student("Atibhav", 10);
		Student student2 = new Student("Sinha", 1);
		Student student3 = new Student("KK", 9);
		Student student4 = new Student("Pandey", 3);
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		System.out.println("Before sorting");
		for (Student student : studentList) {
			System.out.println(student);
		}
		
		// Forgot the syntax!!
		// Arrays.sort : See what u are typing defining List sorting Arrays !!
		//Arrays.sort(studentList, new Comparator<Student>(){
		Collections.sort(studentList, new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		//Collections.sort(studentList, new StudentNameComparator());
		Collections.sort(studentList, new StudentIdComparator());
		
		System.out.println("After sorting");
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

}
