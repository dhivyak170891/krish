package collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class q1 {

	public static void main(String[] args) {
		/*
		 * queue
		 * 
		 * add
		 * remove
		 * not indexed
		 * retrive only head of the queue
		 * iteration
		 * size limitation
		 * 
		 * ArrayBlockingQueue<Datatype> name= new ArrayBlockingQueue<>(size);
		 * 
		 * 
		 * */
		
		ArrayBlockingQueue<Double> n= new ArrayBlockingQueue<>(4);
		n.add(8.9);
		n.add(2.3);
		n.add(1.2);
		n.add(8.3);
		System.out.println(n);
		
		//remove: value
		n.remove(8.3);
		System.out.println(n);
		
		//retrive
		System.out.println(n.peek());
		
		for(double x:n)
		{
			System.out.println(x);
		}
	}
}
