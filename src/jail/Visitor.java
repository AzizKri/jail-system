package jail;

public class Visitor extends Person {
    private String visitorID;

    public Visitor(String visitorID) { // Create a new visitor and new person with basic Person details
        this.visitorID = visitorID;
        Database.addVisitor(this);
    }

    public Visitor(String name, Date DOB, char gender, String personID, String visitorID) { // Create a new visitor and new person
        super(name, DOB, gender, personID);
        this.visitorID = visitorID;
        Database.addVisitor(this);
    }

    public Visitor(String visitorID, Person prs) { // Create a visitor with a copy of a person
        super(prs);
        this.visitorID = visitorID;
        Database.addVisitor(this);
    }
    
    public Visitor(Visitor visitor) { // Copy a visitor
        super(visitor.getName(), visitor.getDOB(), visitor.getGender(), visitor.getID());
        this.visitorID = visitor.visitorID;
        Database.addVisitor(this);
    }
    
    // Setters and getters
    
    public String getVisitorID() {
        return visitorID;
    }

    public void setVisitorID(String visitorID) {
        this.visitorID = visitorID;
    }
    
    // toString
    
    @Override
    public String toString() {
        return super.toString() + "," + visitorID;
    }
}
