package HospitalPatientManagementPackage;

// Main class for demonstration
public class HospitalManagement {
    public static void main(String[] args) {
        // Create instances of InPatient and OutPatient
        InPatient inPatient = new InPatient(1, "Alice", 30, 2000, 5, 15000);
        OutPatient outPatient = new OutPatient(2, "Bob", 25, 500, 2000);

        // Create a PatientRecord for InPatient
        PatientRecord inPatientRecord = new PatientRecord();
        inPatientRecord.addRecord("Surgery", "No prior history");

        // Create a PatientRecord for OutPatient
        PatientRecord outPatientRecord = new PatientRecord();
        outPatientRecord.addRecord("Fever", "Allergy to penicillin");

        // Display details and bills
        System.out.println(inPatient.getPatientDetails());
        System.out.println("Bill: $" + inPatient.calculateBill());
        System.out.println("Medical Records: " + inPatientRecord.viewRecords());

        System.out.println("\n" + outPatient.getPatientDetails());
        System.out.println("Bill: $" + outPatient.calculateBill());
        System.out.println("Medical Records: " + outPatientRecord.viewRecords());
    }
}
