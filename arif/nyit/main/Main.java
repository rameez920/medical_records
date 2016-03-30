package arif.nyit.main;

import arif.nyit.List.List;
import arif.nyit.List.PatientNode;
import arif.nyit.patientData.Date;
import arif.nyit.patientData.Patient;

public class Main {

	public static void main(String[] args) {
		Patient headPatient = new Patient("aaaa", "1111111" , "11 Maint St", 75, 150, 
				new Date(1, 1, 1111), new Date(1, 1, 1111),new Date(1, 1, 1111));
		
		Patient tailPatient = new Patient("zzzzzz", "0000000" , "00 Maint St", 75, 150, 
				new Date(0, 0, 0000), new Date(0, 0, 0000),new Date(0, 00, 0000));
		
		
		PatientNode tail = new PatientNode(tailPatient, null);
		PatientNode head = new PatientNode(headPatient, tail); 
		
		List list = new List(headPatient, tailPatient);
		
		list.print();
		
	
		}
	
	
		
	}
	
	

