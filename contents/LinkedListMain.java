package linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
	
	LinkedListImplementation lnk=new LinkedListImplementation();
	
	lnk.insert(2);
	lnk.insert(3);
	lnk.insertAtStart(1);
	lnk.insert(5);
	
	lnk.insertAt(3, 4);
	
	lnk.deleteAt(2);
	
	lnk.show();
	
	
	}
	

}
