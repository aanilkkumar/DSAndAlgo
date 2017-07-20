package com.datastructure.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 2L;
	int employeeId;
	String employeeName;
	transient String department;
	transient Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	private void writeObject(ObjectOutputStream os) throws IOException, ClassNotFoundException
	{
		try {
			os.defaultWriteObject();
			os.writeInt(address.getHomeNo());
			os.writeObject(address.getStreet());
			os.writeObject(address.getCity());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException
	{
		try {
			is.defaultReadObject();
			int homeNo = is.readInt();
			String street = (String) is.readObject();
			String city = (String) is.readObject();
			address = new Address(homeNo, street, city);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}