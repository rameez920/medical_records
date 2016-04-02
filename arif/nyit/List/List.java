package arif.nyit.List;

import arif.nyit.patientData.Patient;

public class List {
	
	protected PatientNode tail;
	protected PatientNode head;
	protected PatientNode current;
	protected PatientNode previous;
	protected boolean found;
	
	public List(Patient firstPatient) {
		PatientNode startNode = new PatientNode(firstPatient, null);
		head = startNode;
		tail = startNode;
		previous = null;
	}
	
	
	//adds a new node to the end of a list
	public void add(Patient newPatient) {
		PatientNode newNode = new PatientNode(newPatient, null);
		tail.setNext(newNode);
		tail = newNode;
	}
	
	public PatientNode getHeadNode() {
		return head;
	}
	
	
	public boolean contains(String patientID) {
		find(patientID);
		return found;
	}
	
	public Patient get(String patientID) {
		find(patientID);
		if (found)
			return current.getInfo();
		else
			return null;
	}
	
	public boolean remove(String patientID) {
		find(patientID);
		if (found) {
		
			if (current == head) 
				head = current.getNext();
			else
				previous.setNext(current.getNext());
		}
		
		return found;
	}
	
	protected void find(String patientID) {
		current = this.head;
		found = false;
		
		while (current.getNext() != null) {
			
			if (current.getInfo().equals(patientID)) {
				found = true;
				return;
			} 
			previous = current;	
			current = current.getNext();
		}
	}
	
	public void print() {
		PatientNode current = head;
		
		while (current != null) {
			System.out.println(current.getInfo().toString());
			current = current.getNext();
		}
	}
	
	
	public int size() {
		PatientNode current = head;
		int count = 0;
		
		while (current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}
	
	public PatientNode getNext() {
		if (current.getNext() == null)
			reset();
		else {
			previous = current;
			current = current.getNext();
		}
		
		return current;
	}
	
	
	public void reset() {
		current = head;
		previous = null;
	}
	
	

}
