package HospitalPatientManagementPackage;

// Class PatientRecord implementing MedicalRecord
class PatientRecord implements MedicalRecord {
    private String diagnosis;
    private String medicalHistory;

    @Override
    public void addRecord(String diagnosis, String history) {
        this.diagnosis = diagnosis;
        this.medicalHistory = history;
    }

    @Override
    public String viewRecords() {
        return "Diagnosis: " + diagnosis + ", Medical History: " + medicalHistory;
    }
}

