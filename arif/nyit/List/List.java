package arif.nyit.List;

import arif.nyit.patientData.Patient;

public class List {
	
	protected PatientNode tail;
	protected PatientNode head;
	protected PatientNode current;
	protected PatientNode previous;
	protected boolean found;
	
	public List(Patient head, Patient tail) {
		this.tail = new PatientNode(tail, null);
		this.head = new PatientNode(head, this.tail); 
		current = this.head;
		previous = null;
	}
	
	public void add(Patient newPatient) {
		PatientNode newNode = new PatientNode(newPatient, current.getNext());
		previous = current;
		current = newNode;
	}
	
	public boolean contains(Patient patient) {
		find(patient);
		return found;
	}
	
	public Patient get(Patient patient) {
		find(patient);
		if (found)
			return current.getInfo();
		else
			return null;
	}
	
	public boolean remove(Patient patient) {
		find(patient);
		if (found) {
		
			if (current == head) 
				head = current.getNext();
			else
				previous.setNext(current.getNext());
		}
		
		return found;
	}
	
	protected void find(Patient patient) {
		current = this.head;
		found = false;
		
		while (current.next != null) {
			
			if (current.getInfo().equals(patient)) {
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
