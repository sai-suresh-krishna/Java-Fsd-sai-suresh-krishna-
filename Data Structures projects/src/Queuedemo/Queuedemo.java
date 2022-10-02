package Queuedemo;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;


public class Queuedemo {
	public static void main(String args[]) {
		Queue q1=new PriorityQueue();
        q1.add(2);
        q1.add(1);
        q1.add(5);
        q1.add(6);
        q1.add(4);
        System.out.println(q1);
        System.out.println(q1.poll());         // gives the first element of the list and removes it from the list
        System.out.println(q1);
        Queue q2 =new LinkedList();
        q2.add(2);
        q2.add(1);
        q2.add(5);
        q2.add(6);
        q2.add(4);
        System.out.println(q2);
        System.out.println(q2.poll());
        System.out.println(q2);
        
        
	}

}
