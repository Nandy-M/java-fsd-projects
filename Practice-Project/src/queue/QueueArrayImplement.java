package queue;

public class QueueArrayImplement {
	 public static void main(String[] args) {     
	        QueueExample2 q = new QueueExample2(4);    // Create a queue of capacity 4  	     
	        System.out.println("Initial Queue:");  	        
	        q.queueDisplay();   // print Queue elements 
	        
	        // inserting elements in the queue   
	        q.queueEnqueue(10);   
	        q.queueEnqueue(30);   
	        q.queueEnqueue(50);   
	        q.queueEnqueue(70);    
	        
	        System.out.println("Queue after Enqueue Operation:");  
	        q.queueDisplay();   // print Queue elements    	          
	     
	        q.queueFront();    // print front of the queue	           	        
	        q.queueEnqueue(90);  // insert element in the queue    	           
	        q.queueDisplay(); // print Queue elements  
	     
	        q.queueDequeue();   
	        q.queueDequeue();   
	        System.out.printf("\nQueue after two dequeue operations:");   
	     
	        // print Queue elements   
	        q.queueDisplay();   
	     
	        // print front of the queue   
	        q.queueFront();   
	    }   

}
