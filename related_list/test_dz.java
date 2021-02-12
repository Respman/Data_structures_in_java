public class test_dz {
	public static void main(String[] args) throws mylistError{
		mylist<Integer> list = new mylist<Integer>();
		list.AddToHead(1);
		try{
			element<Integer> elem = list.GetElementByValue(1);
			System.out.println(elem);
		}catch (mylistError e){
			System.out.println(e);
		}

		try{
			element<Integer> elem = list.GetElementByValue(0);
			System.out.println(elem);
		}catch (mylistError e){
			System.out.println(e);
		}
	}
}
