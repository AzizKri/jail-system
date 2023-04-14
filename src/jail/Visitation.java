package jail;

import java.util.ArrayList;
import java.util.UUID;

public class Visitation {
    private String visitationID;                                // Unique ID
    private ArrayList<Visitor> visitors = new ArrayList();      // People visiting
    private ArrayList<Prisoner> prisoners = new ArrayList();    // Prisoners being visited
    private Date dateOfVisit;                                   // Date of the visit
    private String time;                                        // Time of the visit

    // Constructors
    
    public Visitation(Date dateOfVisit, String time, String prisonerID, String visitorID) { // Create a new visitation with one prisoner and one visitor
        this.visitationID = UUID.randomUUID().toString();
        this.dateOfVisit = dateOfVisit;
        this.time = time;
        this.visitors.add(Visitor.getVisitor(visitorID));
    }

    public Visitation(Date dateOfVisit, String time, ArrayList<Prisoner> prisoners, ArrayList<Visitor> visitors) { // Create a new visitation with multiple prisoners visitors
        this.visitationID = UUID.randomUUID().toString();
        this.dateOfVisit = dateOfVisit;
        this.time = time;
        this.visitors = visitors;
        this.prisoners = prisoners;
    }
    
    public Visitation(Visitation visit) {                   // Copy constructor
        this.visitationID = UUID.randomUUID().toString();
        this.dateOfVisit = visit.dateOfVisit;
        this.time = visit.time;
        this.visitors = visit.visitors;
        this.prisoners = visit.prisoners;
    }

    // Setters and getters
    
    public String getVisitationID() {
        return visitationID;
    }
    
    public void setVisitationID(String visitationID) {
        this.visitationID = visitationID;
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public ArrayList<Prisoner> getPrisoners() {
        return prisoners;
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
    
    public void addVisitors(ArrayList<Visitor> visitors) {  // Add multiple visitors
        this.visitors.addAll(visitors);
    }
    
    public void addVisitor(Visitor visitor) {               // Add a visitor by Object
        this.visitors.add(visitor);
    }
    
    public void addVisitor(String visitorID) {              // Add a visitor by ID
        this.visitors.add(Visitor.getVisitor(visitorID));
    }
    
    public void addPrisoners(ArrayList<Prisoner> prisoners) { // Add multiple prisoners
        this.prisoners.addAll(prisoners);
    }
    
    public void addPrisoner(Prisoner prisoner) {              // Add a prisoner by Object
        this.prisoners.add(prisoner);
    }
    
    public void addPrisoner(String prisonerID) {            // Add a prisoner by ID
        this.prisoners.add(Prisoner.getPrisoner(prisonerID));
    }
    
    // toString

    @Override
    public String toString() {
        return "VISIT:" + "visitors=" + visitors + ", prisoners=" + prisoners + ", dateOfVisit=" + dateOfVisit + ", time=" + time + '}';
    }
}
