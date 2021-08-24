package Question01;

public class Link {
	public int iData;
	public Link next;
	
	public Link (int id) {
		iData = id;
		next = null;
	}
	
	// display the value
	public void displayLink () {
		System.out.println(iData);
	}	
}
