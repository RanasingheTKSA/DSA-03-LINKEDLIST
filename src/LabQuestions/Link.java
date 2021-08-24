package LabQuestions;

public class Link {
	public String Name;
	public double Avarage;
	public Link next;
	
	public Link (String name, double avg) {
		this.Name = name;
		this.Avarage = avg;
		next = null;
	}
	
	public void displayLink () {
			System.out.println(Name + " " + Avarage);
	}
}
