public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Start with the empty list. */
		LinkedList list = new LinkedList();

		//
		// ******INSERTION******
		//

		// Insert the values
		list.insert(7);
		list.insert(7);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(3);
		list.insert(3);
		list.insert(6);
		list.insert(7);
		list.insert(3);
		list.insert(3);
		list.insert(7);
		list.insert(7);

		// Print the LinkedList
		System.out.println(list.toString());
		list.deleteLastItem();
		System.out.println(list.toString());
		list.deleteGreaterValue(3);
		System.out.println(list.toString());
	}

}
