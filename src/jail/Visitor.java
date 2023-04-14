package jail;

import java.util.ArrayList;


public class Visitor extends Person {
    private String visitorID;
    private static ArrayList<Visitor> visitors = new ArrayList();

    public Visitor(String visitorID) { // Create a new visitor and new person with basic Person details
        this.visitorID = visitorID;
        visitors.add(this);
    }

    public Visitor(String visitorID, String name, Date DOB, char gender, String personID) { // Create a new visitor and new person
        super(name, DOB, gender, personID);
        this.visitorID = visitorID;
        visitors.add(this);
    }

    public Visitor(String visitorID, Person prs) { // Create a visitor with a copy of a person
        super(prs);
        this.visitorID = visitorID;
        visitors.add(this);
    }
    
    public Visitor(Visitor visitor) { // Copy a visitor
        super(visitor.getName(), visitor.getDOB(), visitor.getGender(), visitor.getID());
        this.visitorID = visitor.visitorID;
        visitors.add(this);
    }
    
    // Setters and getters
    
    public String getVisitorID() {
        return visitorID;
    }

    public void setVisitorID(String visitorID) {
        this.visitorID = visitorID;
    }

    public static ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public static void addVisitor(Visitor visitor) {
        Visitor.visitors.add(visitor);
    }
    
    // Public methods
    
    public static Visitor getVisitor(String visitorID) {
        for (Visitor visitor : visitors) {
            if (visitor.visitorID.equals(visitorID)) {
                return visitor;
            }
        }
        return null;
    }
    
    // toString
    
    @Override
    public String toString() {
        return super.toString() + "Visitor ID: " + visitorID + "\n";
    }
}
