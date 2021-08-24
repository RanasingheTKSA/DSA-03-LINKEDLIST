package LabQuestions;

public class LinkMain {
	public static void main(String[] args) {
		LinkList myLink = new LinkList();
		myLink.insertFirst("Nipuna", 13.9);		
		myLink.insertFirst("Aravinda", 34.9);		
		myLink.insertFirst("Prashani", 67.6);		
		
		myLink.displayList();
		
		/*while(!LinkList.isEmpty()) {
			LinkList LL = LinkList.deleteFirst();
			LL.displayList();
		}*/
		
		myLink.deleteLink("Aravinda");
		myLink.displayList();
	}
}
