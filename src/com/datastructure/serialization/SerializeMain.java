package com.datastructure.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeMain {

	 public static void main(String[] args) {  
		  
		  Employee emp = new Employee();  
		  emp.setEmployeeId(101);  
		  emp.setEmployeeName("Arpit");  
		  emp.setDepartment("CS");
		  Address address=new Address(88,"MG road","Pune");  
		  emp.setAddress(address);  
		  
		  Employee emp2 = new Employee();  
		  emp2.setEmployeeId(101);  
		  emp2.setEmployeeName("Atibhav");  
		  emp2.setDepartment("CS");
		  Address address2=new Address(88,"MG road","Pune");  
		  emp2.setAddress(address2);  
		  
		  List<Employee> empList = new ArrayList<>();
		  empList.add(emp);
		  empList.add(emp2);
		  
		  try  
		  {  
		   FileOutputStream fileOut = new FileOutputStream("C:\\Users\\U6021183\\Desktop\\emp.txt");  
		   ObjectOutputStream outStream = new ObjectOutputStream(fileOut);  
		   outStream.writeObject(empList);  
		   outStream.close();  
		   fileOut.close();  
		  }catch(IOException i)  
		  {  
		   i.printStackTrace();  
		  }  
		 }  

}
