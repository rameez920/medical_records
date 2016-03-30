package arif.nyit.patientData;

public class TestClass {

	public static void main(String[] args) {
		
		Patient patient = new Patient("jim", "555", "main st", 75, 150, new Date(2, 14, 1992), new Date(4, 20, 1996), new Date(3, 14, 2013));
		System.out.println(patient.toString());

	}

}
