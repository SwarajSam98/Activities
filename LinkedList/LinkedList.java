package com.LinkedList;

import java.util.NoSuchElementException;

class Node{
	 int value;
	 Node next;
	public Node(int value) {
		this.value= value;
	}
	
}
class Linked{
	private Node first;
	private Node last;
	public void addLast(int item) {
		Node node = new Node(item);
		if(isEmpty()) {
			first = last = node;
		} else {
			last.next= node;
			last= node;
		}
		
	}
	public void addFirst(int item) {
		var node =  new Node(item);
		if(isEmpty()) {
			first = last= node;
		}else {
			last.next = node;
			last = node;
		}
	}
	
	public int indexOf(int item) {
		int index= 0;
		var current = first;
		while (current != null){
			if(current.value==item)
				return index;
			current= current.next;
			index++;
		}
		return -1;
	}
	public boolean contains(int item) {
		return indexOf(item)!= -1;
	}
	
	public void removeFirst() {
		if(isEmpty())
			throw new NoSuchElementException();
		if(first==last)
			first = last = null;
		var second = first.next;
		first.next= null;
		first = second;
	}
	public void removeLast() {
		var previous= getPrevious(last);
		last = previous;
		last.next = null;
		
	}
	private Node getPrevious(Node node) {
		var current =first;
		while(current != null) {
			if(current.next == node)
				return current;
			current = current.next;
		}
		return null;
	}
	void printMiddle() 
    { 
        Node slow_ptr = first; 
        Node fast_ptr = first; 
        if (first != null) 
        { 
            while (fast_ptr != null && fast_ptr.next != null) 
            { 
                fast_ptr = fast_ptr.next.next; 
                slow_ptr = slow_ptr.next; 
            } 
            System.out.println("The middle element is [" + 
                                slow_ptr.value + "] \n"); 
        }
        else
        	throw new IllegalStateException();
    } 
	private boolean isEmpty() {
		return first == null;
	}
}
public class LinkedList {

	public static void main(String[] args) {
		Linked list = new Linked();
		list.addLast(100);
		list.addLast(200);
		list.addLast(300);
		list.addFirst(500);
		list.addLast(600);
		System.out.println(("Index Of:" + list.indexOf(200)));
		System.out.println("Element Contains:"+ list.contains(100));
		list.printMiddle();
		
		
	}

}
