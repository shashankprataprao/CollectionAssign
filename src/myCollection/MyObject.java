package myCollection;

public final class MyObject {
final String name;
int age;
int sal;
String add;


public MyObject() {
	this.name = "";
	this.age = 0;
	this.sal = 0;
	this.add = "";
}

public MyObject(String name, int age, int sal, String add) {
	super();
	this.name = name;
	this.age = age;
	this.sal = sal;
	this.add = add;
}

public int getAge() {
	return age;
}


public int getSal() {
	return sal;
}



public String getAdd() {
	return add;
}



public String getName() {
	return name;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
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
	MyObject other = (MyObject) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

@Override
public String toString() {
	return "MyObject [name=" + name + ", age=" + age + ", sal=" + sal + ", add=" + add + "]";
}







}
