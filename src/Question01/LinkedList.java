package Question01;

public class LinkedList {
	private Link first;
	
	public void LinkList() {
		first = null;
	}
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void displayList() {
		Link current =  first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
	}
	
	// find the values of the list
	public boolean find (int id) {
		Link current = first;
		while (current != null) {
			if (current.iData == id)
				return true;
			else
				current =current.next;
		}
		return false;
	}
	
	// insert first values
	public void insertFirst (int id) {
		Link newLink = new Link(id);
		newLink.next = first;
		first =  newLink;
	}
	
	// insert value to Middle
	public void insertMiddle (int key, int id) {
		Link newLink = new Link(id);
		Link current = first;
		
		while (current != null) {
			if (current.iData ==  key) {
				newLink.next = current.next;
				current.next =  newLink;
			}
			else
				current = current.next;
		}
	}
	
	
	//delete first
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	//delete values from the middle
	public Link deleteMiddle(int id) {
		Link current = first;
		Link previous = first;
		
		while (current != null) {
			if (current.iData == id) {
				if (current == first) {
					first = current.next;
					return current;
				}
				else {
					previous.next = current.next;
					return current;
				}
			}
			else {
				previous = current;
				current= current.next;
			}
			
		}
		return current;
	}	
}
