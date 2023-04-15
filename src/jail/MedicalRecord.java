package jail;

public class MedicalRecord {
    private Prisoner prisoner;
    private Date date;
    private String recordID;
    private String diagnosis;
    private String treatment;
    
    public MedicalRecord(){
        this()
    }

    public MedicalRecord(Prisoner prisoner, Date date, String recordID, String diagnosis, String treatment) {
        this.prisoner = prisoner;
        this.date = date;
        this.recordID = recordID;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    public Prisoner getPrisoner() {
        return prisoner;
    }

    public void setPrisoner(Prisoner prisoner) {
        this.prisoner = prisoner;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    
    @Override
    public String toString(){
        return "Medical Record: \n" +
               "Record ID: " + recordID + "\n" + 
               "Prisoner ID: " + prisoner.getInmateID() + "\n" + 
               "DOB: " + prisoner.getDOB() + "\n" + 
               "Date of Diagnosis: " + date + "\n" + 
               "Diagnosis: " + diagnosis + "\n" + 
               "Treatment: " + treatment;
    }
    
}
