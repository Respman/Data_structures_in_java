public class test_dz {
	public static void main (String[] args){
		binarytree<Integer> br = new binarytree();
		Integer i1 = 10;
		Integer i2 = 8;
		Integer i3 = 20;
		Integer i4 = 15;
		Integer i5 = 13;
		Integer i6 = 17;
		Integer i7 = 25;

		br.add(i1);
		br.add(i2);
		br.add(i3);
		br.add(i4);
		br.add(i5);
		br.add(i6);
		br.add(i7);

		for (int i = 0; i < 4; i++){
			System.out.println(br.printLev(i));
		}
	}
}
