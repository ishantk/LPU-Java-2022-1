package com.auribises.lpu.collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		//Queue<Integer> queue = new PriorityQueue<Integer>();			// Polymorphic Statement
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();	// Direct Object Construction
		
		//queue.add(10);
		//queue.add(9);
		
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
		
		// Queue:  [Head] 10 9 8 7 6 5 4 3 2 1 [Tail]
		System.out.println("queue is: ");
		System.out.println(queue); // output is unordered and not sorted
		
		// It sorts the data internally, for the Queue Processing
		// Queue:  [Head] 1 2 3 4 5 6 7 8 9 10 [Tail]
		
		// Queue Processing : peek and poll
		// peek: get the head of queue
		// poll: remove and get the head of queue
		
//		int head = queue.peek(); // just fetches the head
//		System.out.println("Head is: "+head); // 1
//		System.out.println("Size of Queue is: "+queue.size());

		/*int head = queue.poll(); // removes the head also
		System.out.println("Head is: "+head); // 1
		System.out.println("Size of Queue is: "+queue.size());*/
		
		System.out.println("Processing Queue");
		int size = queue.size();
		for(int i=0;i<size;i++) {
			int head = queue.poll(); // polling means removing the head and hence, size will decrease
			System.out.println(head);
		}

		System.out.println("Queue is: "+queue);
		
	}

}
