package jail;

public class MedicalRecord {
    private Prisoner prisoner;
    private Date date;
    private String recordID;
    private String diagnosis;
    private String treatment;
    
    public MedicalRecord(){ //Def. constructor
        this(new Prisoner(), new Date(), "No Record", "No Diagnosis", "No Treatment");
    }

    //Initializing constructor
    public MedicalRecord(Prisoner prisoner, Date date, String recordID, String diagnosis, String treatment) {
        this.prisoner = prisoner;
        this.date = date;
        this.recordID = recordID;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        Database.addMedicalRecord(this);
    }

    //Setters and Getters
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
        return recordID + ";" + prisoner.getInmateID() + ";" + prisoner.getDOB() + ";" + date + ";" + diagnosis + ";" + treatment;
    }
    
//    @Override
//    public String toString(){
//        return "Medical Record:" +
//               "\nRecord ID: " + recordID +  
//               "\nInmate ID: " + prisoner.getInmateID() + 
//               "\nDOB: " + prisoner.getDOB() +  
//               "\nDate of Diagnosis: " + date + 
//               "\nDiagnosis: " + diagnosis + 
//               "\nTreatment: " + treatment + "\n";
//    }
    
}
