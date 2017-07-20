package com.datastructure.compare;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRollNumber().compareTo(o2.getRollNumber());
	}

}
