package collection3;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	final String name;
	final String phonenumber;
	final List<String> myList = new ArrayList<>();

	public Demo2(String name, String phonenumber) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		myList.add(phonenumber);

	}

	public List<String> getMyList() {
		List<String> newList = new ArrayList<>();
		newList.addAll(myList);
		return myList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phonenumber == null) ? 0 : phonenumber.hashCode());
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
		Demo2 other = (Demo2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phonenumber == null) {
			if (other.phonenumber != null)
				return false;
		} else if (!phonenumber.equals(other.phonenumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Demo2 [name=" + name + ", phonenumber=" + phonenumber + ", myList=" + myList + "]";
	}

	public String getName() {
		return name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public static void main(String[] args) {

		Demo2 d = new Demo2("Shashank", "9876543210");
		System.out.println(d.getMyList());
		Demo2 e = new Demo2("shruti", "398647838746");
		System.out.println(d.getMyList());
		e.myList.add("872386327");

	}

}
