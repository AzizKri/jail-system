package jail;

import java.util.ArrayList;

public class Database {
    private static final ArrayList<Visitor> visitors = new ArrayList();

    // Setters and getters
    
    public static ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public static void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }
    
    // Public methods
    
    public static Visitor getVisitor(String visitorID) {
        for (Visitor visitor : visitors) {
            if (visitor.getID().equals(visitorID)) {
                return visitor;
            }
        }
        return null;
    }
}
