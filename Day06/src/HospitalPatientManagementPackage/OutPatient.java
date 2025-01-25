package HospitalPatientManagementPackage;

// Subclass OutPatient
class OutPatient extends Patient {
    private double consultationFee;
    private double testCost;

    public OutPatient(int patientId, String name, int age, double consultationFee, double testCost) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.testCost = testCost;
    }

    @Override
    public double calculateBill() {
        return consultationFee + testCost;
    }
}

