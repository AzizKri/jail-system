package jail;

public class Visitation {
    private String visitationID;    // Unique ID
    private Visitor visitor;         // Person visiting
    private Prisoner prisoner;        // Prisoner being visited
    private Date dateOfVisit;       // Date of the visit
    private String time;            // Time of the visit

    // Constructors
    
    public Visitation() {
        this("null", new Date(), "12AM", "0000", "0000");
    }
    
    public Visitation(String visitationID, Date dateOfVisit, String time, String prisonerID, String visitorID) { // Create a new visitation with one prisoner and one visitor
        this.visitationID = visitationID;
        this.dateOfVisit = dateOfVisit;
        this.time = time;
        this.prisoner = Database.getPrisonerByInmateID(prisonerID);
        this.visitor = Database.getVisitor(visitorID);
        Database.addVisitation(this);
    }
    
    public Visitation(Visitation visit) {                   // Copy constructor
        this.visitationID = visit.visitationID + "COPY";
        this.dateOfVisit = visit.dateOfVisit;
        this.time = visit.time;
        this.visitor = visit.visitor;
        this.prisoner = visit.prisoner;
        Database.addVisitation(this);
    }

    // Setters and getters
    
    public String getVisitationID() {
        return visitationID;
    }
    
    public void setVisitationID(String visitationID) {
        this.visitationID = visitationID;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public String getVisitorId() {
        return visitor.getVisitorID();
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public void setVisitor(String visitorID) {
        this.visitor = Database.getVisitor(visitorID);
    }

    public Prisoner getPrisoner() {
        return prisoner;
    }

    public String getPrisonerId() {
        return prisoner.getInmateID();
    }

    public void setPrisoner(Prisoner prisoner) {
        this.prisoner = prisoner;
    }

    public void setPrisoner(String prisonerID) {        // Set prisoner by InmateID
        this.prisoner = Database.getPrisonerByInmateID(prisonerID);
    }
    
    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    // Public methods
    
    public String display() {
        return "Visitation: " + visitationID +
                "\n----\nVisitor " + visitor.display() +
                "\n----\nPrisoner " + prisoner.display() + 
                "\n----\nDate of Visit: " + dateOfVisit +
                "\n----\nTime of Visit: " + time;
    }
    
    // toString

    @Override
    public String toString() {
        return visitationID + ";" + visitor.getVisitorID() + ";" + prisoner.getInmateID() + ";" + dateOfVisit + ";" + time;
    }
}
