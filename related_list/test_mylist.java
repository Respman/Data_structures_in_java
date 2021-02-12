class test_mylist {
	public static void main (String[] args) throws mylistError{
		mylist<String> list = new mylist<String>();
		list.AddToHead("hello");
		list.AddToTail("World");
		System.out.println(list.CountOfElements());
		
		mylist<String> list1 = new mylist<String>(list);
		System.out.println(list1.CountOfElements());
		try{
			list1.RemoveFromHead();
		}catch (mylistError e){
			System.out.println(e);
		}
		
		mylist<String> list2 = new mylist<String>();
		System.out.println(list2.CountOfElements());
		try{
			list2.RemoveFromHead();
		}catch (mylistError e){
			System.out.println(e);
		}

		try{
			element<String> elem = list.GetElementByValue("hello");
			System.out.println(elem);
		}catch (mylistError e){
			System.out.println(e);
		}

		try{
			element<String> elem = list1.GetElementByValue("hello");
			System.out.println(elem);
		}catch (mylistError e){
			System.out.println(e);
		}

		try{
			list2.RemoveElementByValue("hello");
		}catch (mylistError e){
			System.out.println(e);
		}

		System.out.println(list.CountOfElements());
		try{
			list.RemoveElementByValue("hello");
		}catch (mylistError e){
			System.out.println(e);
		}
		System.out.println(list.CountOfElements());

		list2.ClearAll();
		System.out.println(list2.CountOfElements());



	}
}


