package arif.nyit.List;

import arif.nyit.patientData.Patient;

public class PatientNode {
	Patient patient;
	PatientNode next;
	
	public PatientNode(Patient patient, PatientNode next) {
		this.patient = patient;
		this.next = next;
	}
	
	public Patient getInfo() {
		return patient;
	}
	
	public void setNext(PatientNode newNode) {
		this.next = newNode;
	}
	
	public PatientNode getNext() {
		return next;
	}
	
	public boolean equals(Patient target) {
		return this.patient.getPatientID().equals(target.getPatientID());
	}
	
}
