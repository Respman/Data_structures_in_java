public class test_tree {
	public static void main(String[] args){
		Person p1 = new Person("Tom", 20);
		Person p2 = new Person("Vasya", 30);
		Person p3 = new Person("Adam", 5);
		Person p4= new Person("Eva", 45);

		binarytree<Person> br = new binarytree();
		binarytree<Person> br1 = new binarytree();
		br.add(p1);
		br.add(p2);
		br.add(p3);
		br.add(p4);
		br1.copy(br);
		br.print();
		br1.print();
		if (br.find(p1)){
			System.out.println(p1+" in this tree");
		}else{
			System.out.println(p1+" not in this tree");
		}
		binarytree<Person> br2 = new binarytree();
		br2.add(p1);
		br2.add(p2);
		br2.add(p3);
		if (br2.find(p4)){
			System.out.println(p4+" in this tree");
		}else{
			System.out.println(p4+" not in this tree");
		}
	}
}

