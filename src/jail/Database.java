package jail;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private Scanner prisonerFile = null;
    private Scanner officersFile = null;
    private Scanner visitationFile = null;
    private Scanner cellsFile = null;
    private Scanner medicalRecordsFile = null;
    
    private static ArrayList<Prisoner> prisoners = new ArrayList();
    private static ArrayList<Officer> officers = new ArrayList();
    private static ArrayList<Visitor> visitors = new ArrayList();
    private static ArrayList<Visitation> visitations = new ArrayList();
    private static ArrayList<Cell> cells = new ArrayList();
    private static ArrayList<MedicalRecord> medicalRecords = new ArrayList();

    // Constructors
    
    public Database() {
        
        try {
            visitationFile = new Scanner(new File("src/files/Visitations.txt"));
            while(visitationFile.hasNextLine()) {
                String[] line = visitationFile.nextLine().split("\n");
                for (String info : line) {
                    String[] items = info.split(",");
                    /*
                    0001,
                    John,
                    12;5;1997,
                    M,
                    785-573257,
                    0005,
                    Jake,
                    18;4;1996,
                    M,
                    785-3248743,
                    0058,
                    Theft,
                    5,
                    2;6;2018,
                    16;4;2023,
                    5pm
                    */
                    String[] dateStr = items[14].split(";");
                    visitations.add(new Visitation(items[0], new Date(Integer.parseInt(dateStr[2]), Integer.parseInt(dateStr[1]), Integer.parseInt(dateStr[0])), items[15], items[5], items[10]));
                }
                // visitationID, Date dateOfVisit, String time, String prisonerID, String visitorID
            }
        } catch(FileNotFoundException ex) {
            System.out.println("Visitation File not found");
        }
    }

    // Setters and getters
    
    public static ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public static void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public static ArrayList<Prisoner> getPrisoners() {
        return prisoners;
    }

    public static void addPrisoner(Prisoner prisoner) {
        prisoners.add(prisoner);
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
    
    public static Prisoner getPrisoner(String prisonerID) {
        for (Prisoner prisoner : prisoners) {
            if (prisoner.getID().equals(prisonerID)) {
                return prisoner;
            }
        }
        return null;
    }
}
