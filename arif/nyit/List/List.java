package arif.nyit.List;

import arif.nyit.patientData.Patient;

public class List {
	
	PatientNode tail;
	PatientNode head;
	PatientNode current;
	
	public List(Patient head, Patient tail) {
		this.tail = new PatientNode(tail, null);
		this.head = new PatientNode(head, this.tail); 
		current = this.head;
	}
	
	public void add(Patient newPatient) {
		PatientNode newNode = new PatientNode(newPatient, current.getNext());
		current = newNode;
	}
	
	public void remove() {
		
	}
	
	protected void find() {
		
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
		else 
			current = current.getNext();
		
		return current;
	}
	
	public void reset() {
		current = head;
	}

}
