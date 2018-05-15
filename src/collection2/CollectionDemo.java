package collection2;

import java.util.HashMap;

public final class CollectionDemo {
	final String name;

	final int empId;
	String address;
	int Phone;

	public CollectionDemo(String name, int empId, String address, int phone) {
		super();
		this.name = name;
		this.empId = empId;
		this.address = address;
		Phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollectionDemo other = (CollectionDemo) obj;
		if (empId != other.empId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CollectionDemo [name=" + name + ", empId=" + empId + ", address=" + address + ", Phone=" + Phone + "]";
	}

	public static void main(String[] args) {

		HashMap<String, CollectionDemo> myMap = new HashMap<>();
		CollectionDemo emp = new CollectionDemo("Shashank", 23, "pune", 949389348);
		myMap.put(emp.name, emp);
		emp.Phone=928392738;
		myMap.put(emp.name, emp);
		System.out.println(myMap.get(emp.name));
		
		
		

	}

}
