package project.leetcode.code.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedList {

	private Node head;

	public LinkedList() {
		this.head = null;
	}

//Insert node in the list 	
	public Node insertAtHead(int data) {

		Node temp = new Node(data);
		if (head == null) {
			head = temp;
		} else {

			temp.next = head;

			head = temp;
		}
		return head;
	}

//Print list
	public void print() {

		Node temp = head;

		StringBuilder sbd = new StringBuilder();
		while (temp != null) {
			sbd.append(temp.data + ", ");

			temp = temp.next;
		}
		System.out.println((sbd.toString().substring(0, sbd.length() - 2)));
	}

	// Print list1
	public void print(Node head) {

		Node temp = head;

		StringBuilder sbd = new StringBuilder();
		while (temp != null) {
			sbd.append(temp.data + ", ");

			temp = temp.next;
		}
		System.out.println((sbd.toString().substring(0, sbd.length() - 2)));
	}

//Find middle of the list
	public void findMiddle() {
		Node temp = head;
		Node temp1 = head;
		int count = 1;
		Node prev = null;
		while (temp1 != null && temp1.next != null) {
			count++;
			prev = temp;
			temp = temp.next;
			temp1 = temp1.next.next;
		}

		System.out.println("Your midle element : " + temp.data);
		prev.next = temp.next;

//		int middle= count/2;
//		Node temp1 = head;
//		 count=1;
//		while(temp1!=null) {
//			
//			if(count==middle) {
//				System.out.println("Your midle element : "+temp1.data);
//			}
//			count++;
//			temp1=temp1.next;
//		}

	}

//Sort the list
	public void sortLinedList() {

		Node i = head;

		for (; i != null; i = i.next) {

			for (Node j = i.next; j != null; j = j.next) {

				if (i.data > j.data) {
					int data = i.data;
					i.data = j.data;
					j.data = data;
				}

			}
		}

	}

//find the nth Node form linkedlist

	public void findNthNodeFromLinkedList() {

		Node i = head;

		Node j = i;

		int n = 4;
		int count = 1;
		while (count <= n - 1) {

			j = j.next;
			count++;
		}

		while (j.next != null) {

			j = j.next;
			i = i.next;
		}

		System.out.println(i.data);
	}

//Check if there is a cycle or not in LinkedList

	public void checkCycle() {

		Node i = head;
		Node j = i;
		while (j.next.next != null) {

			if (i == j) {
				System.out.println("There is a loop");
				break;
			}
			j = j.next.next;
			i = i.next;
		}

	}

	// Reverse a LinkedList
	public Node reverseLinkedList() {
		Node currentNode = head, nextNode = head;

		Node prev = null;

		while (nextNode.next != null) {
			nextNode = nextNode.next;

			currentNode.next = prev;

			prev = currentNode;

			currentNode = nextNode;

		}
		currentNode.next = prev;

		return currentNode;
	}

	// Merge 2 sorted lists
	public static Node MergeSortedLists(LinkedList list, LinkedList list2) {

		Node p = list.head;
		Node q = list2.head;

		Node sortedHead = null;
		Node sorted = null;
		if (p.data < q.data) {
			sorted = p;
			p = p.next;
		} else {
			sorted = q;
			q = q.next;
		}

		sortedHead = sorted;

		while (p != null && q != null) {

			if (p.data < q.data) {

				sorted.next = p;
				sorted = p;
				p = p.next;
			} else {
				sorted.next = q;
				sorted = q;
				q = q.next;
			}
		}

		if (p == null) {
			sorted.next = q;
		}

		if (q == null) {
			sorted.next = p;
		}
		return sortedHead;

	}

// Find sum of all elements in linkedList
	public void sumOflinkedList(LinkedList list) {
		int sum = findSum(list.head);
		System.out.println("LinkedList sum is : " + sum);
	}

	// Recursive find sum of all elements
	public int findSum(Node node) {

		if (node == null)
			return 0;

		return node.data + findSum(node.next);
	}

	// recursive element search in list

	public void recursiveSearch(int value) {

		Node temp = head;

		Node n = recursiveSearch1(temp, value);

		if (n == null) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found : " + n.data);
		}
	}

	public Node recursiveSearch1(Node node, int value) {

		if (node == null)
			return null;

		if (node.data == value)
			return node;

		return recursiveSearch1(node.next, value);
	}

	// Check if list is palindrome or not

	public boolean palindromeCheck() {

		Node temp = head;

		// 1. split the list
		Node p = temp;
		Node q = temp;

		Node secondListStart = null;
		while (true) {
			p = p.next.next;

			if (p.next == null) {
				secondListStart = q.next.next;
				break;
			}

			if (p == null) {
				secondListStart = q.next;
				break;
			}
			q = q.next;

		}

		q.next = null;

		// 2. reverse second list

		Node currentNode = secondListStart, nextNode = secondListStart;

		Node prev = null;

		while (nextNode.next != null) {
			nextNode = nextNode.next;

			currentNode.next = prev;

			prev = currentNode;

			currentNode = nextNode;

		}
		currentNode.next = prev;

		// 3. Now start comparing element of both the list from start
		boolean isPalindrome = true;
		temp = head;
		Node secondReversed = currentNode;
		while (temp != null) {

			if (!(temp.data == secondReversed.data)) {
				isPalindrome = false;
			}

			temp = temp.next;
			secondReversed = secondReversed.next;

		}

		return isPalindrome;
	}

	// remove all element who match given value

	public void removeAllmaching(int value) {

		Node temp = head;

		Node prev = null;
		while (temp != null) {

			if (temp.data == value && temp == head) {
				head = temp.next;
				temp = temp.next;
				continue;
			}
			if (temp.data == value) {

				prev.next = temp.next;
				temp = temp.next;
				continue;
			}
			prev = temp;
			temp = temp.next;
		}

	}

	// find the greatest element for each element in the linkedlist
	public void getGreaterNodeInLinkedList() {

		Node temp = head;

		ArrayList<Integer> data = new ArrayList<>();

		int k = 0;
		for (Node i = temp; i.next != null; i = i.next) {

			int value = 0;
			for (Node j = i.next; j != null; j = j.next) {

				if (j.data > i.data) {
					value = j.data;
					break;
				}
			}
			data.add(value);
		}

		data.add(data.size(), 0);
		int[] ints = data.stream().mapToInt(Integer::intValue).toArray();

		System.out.println(Arrays.toString(ints));
	}

	public int findLenght(LinkedList list) {

		Node temp = list.head;

		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;

	}

	// Intersection of two linkedlist
	public void findInteresectionElementInList(LinkedList list1, LinkedList list2) {

		int l1 = findLenght(list1);
		int l2 = findLenght(list2);
		int diff = 0;
		Node temp = list1.head;
		Node temp2 = list2.head;
		int count = 1;
		if (l1 > l2) {
			diff = l1 - l2;
			while (temp != null && count <= diff) {
				count++;
				temp = temp.next;
			}
		} else {
			diff = l2 - l1;
			while (temp2 != null && count <= diff) {
				count++;
				temp2 = temp2.next;
			}
		}

		while (temp2 != null) {

			if (temp2 == temp) {

			}
			temp2 = temp2.next;
			temp = temp.next;
		}

	}

	// Swapping Nodes in a Linked List
	public void swapNodeDataInList(int k) {
		Node temp = head;
		Node slow = head;

		Node starting = null;
		int count = 1;
		while (count <= k - 1) {
			temp = temp.next;
			count++;

		}
		starting = temp;

		while (temp.next != null) {
			temp = temp.next;
			slow = slow.next;
		}

		int val = slow.data;
		slow.data = starting.data;
		starting.data = val;
		System.out.println(slow.data + " " + starting.data);

	}

	// Remove the nth node from linkedlist
	public void removeNthNodeFromLinkedList(int n) {
		Node i = head;

		Node j = i;

		int count = 1;
		while (count <= n - 1) {

			j = j.next;
			count++;
		}

		Node prev = null;
		if (j.next == null) {
			i.next = null;
			return;
		}
		while (j.next != null) {

			prev = i;

			j = j.next;
			i = i.next;
		}
		prev.next = i.next;
	}

	// Remove duplicate from sorteed lsit
	public void removeDuplicate() {
		Node p = head;

		Node q = null;

		while (p != null && p.next != null) {
			if (p.data == p.next.data) {

				q = p.next.next;

				if (q == null) {
					p.next = null;
					break;
				}
				p.next = q;

			}

			if (p.data != p.next.data) {
				p = p.next;

			}
		}

	}

	// Reverse a LinkedList WithPosition
	public Node reverseLinkedList(int left, int right) {

		Node temp = head;

		// 1. Find the nodes
		int count = 1;

		Node prev = null;
		Node before = null;
		Node after = null;
		while (temp != null) {

			if (count == left) {
				before = prev;
//					System.out.println(before.data);
			}

			if (count == right) {
				after = temp.next;
//					System.out.println(after.data);
				break;
			}
			count++;
			prev = temp;
			temp = temp.next;
		}
		temp.next = null;

		// 2. Reverse the list between the identified nodes.

		Node TempHead = before.next;
//			System.out.println(TempHead.data);

		Node currentNode = TempHead, nextNode = TempHead;

		prev = null;

		while (nextNode.next != null) {
			nextNode = nextNode.next;

			currentNode.next = prev;

			prev = currentNode;

			currentNode = nextNode;

		}
		currentNode.next = prev;

		// 3/ change the node pointers
		before.next = currentNode;
		TempHead.next = after;

		return head;

	}

	// Swap list elements in pairs, swapping values
	public void swapInpairs() {

		Node temp = head;
		while (temp.next != null) {

			int n = temp.data;

			temp.data = temp.next.data;

			temp.next.data = n;

			if (temp.next.next == null) {
				break;
			} else {
				temp = temp.next.next;
			}

		}
	}

	public Node swapPairsWithActualNodes() {

		Node p = head;

		Node newHead = p.next;

		Node q = null;
		Node temp = null;

		while (true) {

			q = p.next;
			temp = q.next;

			q.next = p;

			if (temp == null || temp.next == null) {
				p.next = temp;
				break;
			}

			p.next = temp.next;

			p = temp;
		}
		return newHead;
	}

	// Merge In Between Linked Lists

	public void mergeBetweenList(int a, int b, Node list2) {
		Node temp = head;

		// 1. Find the nodes
		int count = 0;

		Node prev = null;
		Node before = null;
		Node after = null;
		while (temp != null) {

			if (count == a) {
				before = prev;
//				System.out.println(before.data);
			}

			if (count == b) {
				after = temp.next;
//				System.out.println(after.data);
				break;
			}
			count++;
			prev = temp;
			temp = temp.next;
		}

		before.next = list2;

		while (list2.next != null) {
			list2 = list2.next;
		}

		list2.next = after;

	}

	// Reverse Nodes in k-Group

	public Node reverseInKGroups() {

		Node start = head;
		Node p = head;
		Node q = head;
		int k = 3;

		Node newHead = null;
		Node lstPrev = start;
		while (true) {

			// 1. fin the sublist
			int count = 1;
			while (count < k && p != null) {

				count++;
				p = p.next;
			}
			// return if there are no more elements or remaining elements are not equal to K
			if (p == null) {
				lstPrev.next = q;
				break;
			}
			
			//for temorarily assign sublist next pointer to null 
			q = p.next;

			p.next = null;

			// 2. reverse the sublist

			Node currentNode = start, nextNode = start;

			Node prev = null;

			while (nextNode.next != null) {
				nextNode = nextNode.next;

				currentNode.next = prev;

				prev = currentNode;

				currentNode = nextNode;

			}
			currentNode.next = prev;
			
			//Correct the pointers
			if (newHead == null) {
				newHead = currentNode;
				lstPrev = start;
			} else {
				lstPrev.next = currentNode;
				lstPrev = start;
			}


			start = q;
			p = q;

		}
		return newHead;

	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insertAtHead(7);
		list.insertAtHead(6);
		list.insertAtHead(5);
		list.insertAtHead(4);
		list.insertAtHead(3);
		list.insertAtHead(2);
		list.insertAtHead(1);
		list.insertAtHead(0);

//		LinkedList list2 = new LinkedList();
//		
//
//		list2.insertAtHead(1000002);
//		list2.insertAtHead(1000001);
//		list2.insertAtHead(1000000);

		System.out.println("-----------------Inupt-----------------------");
		list.print();

//		System.out.println();
//		boolean isPalindrome =  list.palindromeCheck();
//
//		System.out.println("isPalindrome : "+isPalindrome);

//		list2.print();
//		
//		System.out.println("-----------------Output----------------------");
//		
//		Node newList = MergeSortedLists(list,list2);
////		Node newList = list.reverseLinkedList();
//		list.print(newList);

//		list.mergeBetweenList( 3,4,  list2.head);
//		list.print();
//		;
		list.print(list.reverseInKGroups());

	}

}
