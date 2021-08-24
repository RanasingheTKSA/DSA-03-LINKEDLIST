package LabQuestions;

public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	//is Empty method 
	public boolean isEmpty() {
		return (first == null);
	}
	
	//insert method
	public void insertFirst(String name, double avg) {
		Link newLink = new Link(name, avg);
		newLink.next = first;
		first = newLink;
	}
	
	//delete first method
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	//display method
	public void displayList() {
		System.out.println("Display the list");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
	}
	
	public Link deleteLink(String name) {
		Link current = first;
		Link previous =first;
		
		while (current.Name != name) {
			if(current.next == null) {
				return null;
			}
			else {
				previous = current;
				current = current.next;
			}
		}
		if (current == first) {
			first = first.next;
			
		}else {
			previous.next = current.next;
		}
		return current;
	}
	
}
