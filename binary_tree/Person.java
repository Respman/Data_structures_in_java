public class Person implements Comparable<Person> {
	int age;
	String name;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public int compareTo(Person p){
		return(this.age - p.age);
	}

	public String toString(){
		return("Person name: " + this.name + " age " + this.age);
	}
}
