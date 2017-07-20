package com.datastructure.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializeMain {
	public static void main(String[] args) {

		List<Employee> empList = null;
		try
		{
			FileInputStream fileIn = new FileInputStream("C:\\Users\\U6021183\\Desktop\\emp.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			empList = (List<Employee>) in.readObject();
			in.close();
			fileIn.close();
		}
		catch (IOException i)
		{
			i.printStackTrace();
			return;
		}
		catch (ClassNotFoundException c)
		{
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee...");
		for (Employee employee : empList) {
			System.out.println("Emp id: " + employee.getEmployeeId());
			System.out.println("Name: " + employee.getEmployeeName());
			System.out.println("Department: " + employee.getDepartment());
			if(employee.getAddress()!=null){
				System.out.println("Address Street: " +employee.getAddress().getStreet());
			}
			String test = employee.getAddress()!=null ? employee.getAddress().getStreet() : "Address is not serialzed !!";
			System.out.println("Address: " +test );
			
		}
	}

}
