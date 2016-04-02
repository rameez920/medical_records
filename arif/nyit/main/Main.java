package arif.nyit.main;

import java.util.Scanner;

import arif.nyit.List.List;
import arif.nyit.List.PatientNode;
import arif.nyit.patientData.Date;
import arif.nyit.patientData.Patient;

public class Main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		List list = new List(new Patient("rameez", "123", "address", 76, 145, new Date(2, 14, 1992), new Date(3, 12, 1995), new Date(5, 21, 2011)));
		
		
		int selection = 0;
		
		while (selection != 8) {	
			userMenu();
			selection = kb.nextInt();
			
			if (selection == 1)
				displayList(list);
			else if (selection == 2)
				addPatient(kb, list);
			else if (selection == 3)
				showPatientData(kb, list);
			else if (selection == 4) 
				deletePatient(kb, list);
			else if (selection == 5)
				getAvgAge(list);
			else if (selection == 6)
				getYoungestPatient(list);
			else if (selection == 7)
				printOverDuePatients(list);
		}
		
		
			
		
	}
	
	private static void userMenu() {
		System.out.println("Select an option from the menu by entering the number for the option");
		System.out.println("1: Display List");
		System.out.println("2: Add new patient");
		System.out.println("3: Show information for patient");
		System.out.println("4: Delete a patient");
		System.out.println("5: Show average patient age");
		System.out.println("6: Show information for youngest Patient");
		System.out.println("7: Show notification list");
		System.out.println("8: Quit");
		
	}
	
	private static void displayList(List list) {
		list.print();
	}
	
	
	//TODO: need to check if id already exists
	private static void addPatient(Scanner kb, List list) {
		System.out.println("Enter a ID# for the patient");
		String id = kb.next();
		
		while (list.contains(id)) {
			System.out.println("That id already exists, enter a new ID");
			id = kb.next();
		} 
		
		System.out.println("Enter a name for the patient");
		String name = kb.next();
		
		System.out.println("Enter the patient's address");
		String address = kb.next();
		
		System.out.println("Enter the patient's height in inches");
		int height = kb.nextInt();
		
		System.out.println("Enter the patient's weight");
		double weight = kb.nextDouble();
		
		Date birthDate = addBirthDate(kb);
		
		Patient patient = new Patient(name, id, address, height, weight, birthDate, new Date(), new Date());
		
		list.add(patient);
		
	}	
	
	private static Date addBirthDate(Scanner kb) {
		System.out.println("Enter birth month");
		int month = kb.nextInt();
		System.out.println("Enter birth day");
		int day = kb.nextInt();
		System.out.println("Enter year");
		int year = kb.nextInt();
		
		return new Date(month, day , year);
	}
	
	private static void showPatientData(Scanner kb, List list) {
		System.out.println("Enter patient's ID#");
		String patientID = kb.next();
		
		if (list.contains(patientID)) 
			list.get(patientID).printInfo();
		else
			System.out.println("Patient ID not found");
	}
	
	private static void deletePatient(Scanner kb, List list) {
		System.out.println("Enter patient's ID#");
		String patientID = kb.next();
		
		if (list.contains(patientID)) 
			list.remove(patientID);
		else
			System.out.println("Patient ID not found");
	}
	
	private static Double getAvgAge(List list) {
		double avgAge = 0;
		PatientNode current = list.getHeadNode();
		
		while (current != null) {
		
			avgAge += current.getInfo().getAge();
			current = current.getNext();
		
		} 
		
		return avgAge / list.size();
	}
	
	
	private static Patient getYoungestPatient(List list) {
		PatientNode current = list.getHeadNode();
		Patient youngestPatient = current.getInfo();
		
		while (current != null) {
	
			if (current.getInfo().getAge() < youngestPatient.getAge())
				youngestPatient = current.getInfo();
			
			current = current.getNext();
		
		} 
		
		return youngestPatient;
	}
	
	public static void printOverDuePatients(List list) {
		PatientNode current =list.getHeadNode();
		
		while (current != null) {
			
			if (current.getInfo().isOverDue())
				System.out.println(current.getInfo().toString());
			current = current.getNext();
		}
		
	}
	
	private static void exitProtocol(List list) {
		
	}
	
	
		
	}
	
	

