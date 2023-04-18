package jail;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Database {
    private Scanner prisonersFile = null;
    private Scanner officersFile = null;
    private Scanner visitorsFile = null;
    private Scanner visitationsFile = null;
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
        // Prisoner
        try {
            prisonersFile = new Scanner(new File("src/files/Prisoners.txt"));
            while(prisonersFile.hasNextLine()) {
                String[] line = prisonersFile.nextLine().split(",");
                /*[Jake,18;4;1996,M,785-3248743,0058,Theft,5,2;6;2018]*/
                String[] DOBStr = line[1].split(";");
                Date DOB = new Date(Integer.parseInt(DOBStr[2]), Integer.parseInt(DOBStr[1]), Integer.parseInt(DOBStr[0]));
                String[] CrimeStr = line[7].split(";");
                Date crimeDate = new Date(Integer.parseInt(CrimeStr[2]), Integer.parseInt(CrimeStr[1]), Integer.parseInt(CrimeStr[0]));
                new Prisoner(line[0], DOB, line[2].charAt(0), line[3], line[5], Integer.parseInt(line[6]), crimeDate, line[4]);
                // String name, Date DOB, char gender, String ID, String offense, int duration, Date entry, String inmateID
            }
        } catch(FileNotFoundException ex) {
            System.out.println("Prisoner File not found");
        }
        // Officers
        try {
            officersFile = new Scanner(new File("src/files/Officers.txt"));
            while(officersFile.hasNextLine()) {
                String[] line = officersFile.nextLine().split(",");
                /*[Josh,4;8;1997,M,785-8465910,SN-845931562,Officer]*/
                String[] DOBStr = line[1].split(";");
                Date DOB = new Date(Integer.parseInt(DOBStr[2]), Integer.parseInt(DOBStr[1]), Integer.parseInt(DOBStr[0]));
                new Officer(line[0], DOB, line[2].charAt(0), line[3], line[4], line[5]);
                // String name, Date dob, char gender, String id, String badgenumber, String rank
            }
        } catch(FileNotFoundException ex) {
            System.out.println("Officers File not found");
        }
        // Visitors
        try {
            visitorsFile = new Scanner(new File("src/files/Visitors.txt"));
            while(visitorsFile.hasNextLine()) {
                String[] line = visitorsFile.nextLine().split(",");
                /*[John,12;5;1997,M,785-573257,0005]*/
                String[] DOBStr = line[1].split(";");
                Date DOB = new Date(Integer.parseInt(DOBStr[2]), Integer.parseInt(DOBStr[1]), Integer.parseInt(DOBStr[0]));
                new Visitor(line[0], DOB, line[2].charAt(0), line[3], line[4]);
                // String name, Date DOB, char gender, String personID, String visitorID
            }
        } catch(FileNotFoundException ex) {
            System.out.println("Visitors File not found");
        }
        // Visitations
        try {
            visitationsFile = new Scanner(new File("src/files/Visitations.txt"));
            while(visitationsFile.hasNextLine()) {
                String[] line = visitationsFile.nextLine().split(",");
                /*[0001,John,12;5;1997,M,785-573257,0005,Jake,18;4;1996,M,785-3248743,0058,Theft,5,2;6;2018,16;4;2023,5pm]*/
                String[] dateStr = line[14].split(";");
                new Visitation(line[0], new Date(Integer.parseInt(dateStr[2]), Integer.parseInt(dateStr[1]), Integer.parseInt(dateStr[0])), line[15], line[10], line[5]);
                // String visitationID, Date dateOfVisit, String time, String prisonerID, String visitorID
            }
        } catch(FileNotFoundException ex) {
            System.out.println("Visitation File not found");
        }
    }

    // Getters and Adders

    public static ArrayList<Prisoner> getPrisoners() {
        return prisoners;
    }

    public static void addPrisoner(Prisoner prisoner) {
        prisoners.add(prisoner);
    }

    public static ArrayList<Officer> getOfficers() {
        return officers;
    }

    public static void addOfficer(Officer officer) {
        officers.add(officer);
    }
    
    public static ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public static void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }
    
    public static ArrayList<Visitation> getVisitations() {
        return visitations;
    }

    public static void addVisitation(Visitation visit) {
        visitations.add(visit);
    }
    
    // Public methods
    
    public static Visitor getVisitor(String visitorID) {
        for (Visitor visitor : visitors) {
            if (visitor.getVisitorID().equals(visitorID)) {
                return visitor;
            }
        }
        return null;
    }
    
    public static Prisoner getPrisoner(String prisonerID) {
        for (Prisoner prisoner : prisoners) {
            if (prisoner.getInmateID().equals(prisonerID)) {
                return prisoner;
            }
        }
        return null;
    }
}
