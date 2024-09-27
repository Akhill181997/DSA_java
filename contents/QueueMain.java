package queue;

public class QueueMain {
	public static void main(String[] args) {
		QueueImplementation qu=new QueueImplementation();
	    qu.enqueue(5);	
	    qu.enqueue(12);
	    
	    qu.dequeue();
	    
	    qu.enqueue(10);
	    qu.enqueue(18);
	    qu.enqueue(6);
	    
	    qu.show();
	
	}

}
