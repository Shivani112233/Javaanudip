package july16;

import java.util.*;

public class LinkedListtt {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int da){
			this.data=da;
			next=null;
		}
	}
	
	
	public static LinkedListtt insert(LinkedListtt list,int data) {
		Node new_Node=new Node(data);
		if(list.head==null) {
			list.head=new_Node;
			
		}else {
			Node last =list.head;
			//12,14,15,13
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_Node;
			
		}
		return list;
		
	}
	
	public static void printlist(LinkedListtt list) {
		Node currentnode = list.head;
		System.out.println("linked list");
		
		while(currentnode !=null) {
			System.out.println(currentnode.data);
			currentnode = currentnode.next;}
		}
		
		public static void main(String[] args) {
			LinkedListtt list = new LinkedListtt();
			list.insert(list, 12);
			list.insert(list, 13);
			list.insert(list, 17);
			list.insert(list, 18);
			
			printlist(list);
		
			
			//LinkedList<String> al=new LinkedList<String>();
			//al.add("ravi");
			//al.add("vijay");
			//al.add("ravi");
			//al.add("ajay");
			//printlist(al);
			//iterator<String> iter=al.iterator();
			//
			
			
		}
		
	
			
			
			
		
		
		
		
	}

