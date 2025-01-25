package HospitalPatientManagementPackage;

// Subclass InPatient
class InPatient extends Patient {
    private double roomCharge;
    private int daysAdmitted;
    private double treatmentCost;

    public InPatient(int patientId, String name, int age, double roomCharge, int daysAdmitted, double treatmentCost) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.daysAdmitted = daysAdmitted;
        this.treatmentCost = treatmentCost;
    }

    @Override
    public double calculateBill() {
        return (roomCharge * daysAdmitted) + treatmentCost;
    }
}

