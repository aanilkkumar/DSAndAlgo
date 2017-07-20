package com.datastructure.compare;

import java.util.Comparator;

public class Student {

	private final String name;
	private final Integer rollNumber;
	
	private static StudentNameComparator STUDENT_NAME_COMPARATOR;
	private static StudentRollNumberComparator studentRollNumberComparator;
	
	public Student(String name, Integer rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getRollNumber() {
		return rollNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
	}
	
	static class StudentNameComparator implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	
	static class StudentRollNumberComparator implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getRollNumber().compareTo(o2.getRollNumber());
		}
		
	}
	
}

// static class can only be inner.
//static class StudentNameComparator implements Comparator<Student>{
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		return o1.getName().compareTo(o2.getName());
//	}
//	
//}