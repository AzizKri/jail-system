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
    
    private static final ArrayList<Prisoner> prisoners = new ArrayList();
    private static final ArrayList<Officer> officers = new ArrayList();
    private static final ArrayList<Visitor> visitors = new ArrayList();
    private static final ArrayList<Visitation> visitations = new ArrayList();
    private static final ArrayList<Cell> cells = new ArrayList();
    private static final ArrayList<MedicalRecord> medicalRecords = new ArrayList();

    // Constructors
    
    public Database() {
        if (prisoners.size() + officers.size() + visitors.size() + visitations.size() + cells.size() + medicalRecords.size() == 0) {
            // Prisoner
            try {
                prisonersFile = new Scanner(new File("src/files/Prisoners.txt"));
                while(prisonersFile.hasNextLine()) {
                    String[] line = prisonersFile.nextLine().split(",");
                    /*[Jake,18-4-1996,M,785-3248743,0058,Theft,5,2-6-2018,0008]*/
                    String[] DOBStr = line[1].split("-");
                    Date DOB = new Date(Integer.parseInt(DOBStr[0]), Integer.parseInt(DOBStr[1]), Integer.parseInt(DOBStr[2]));
                    String[] CrimeStr = line[7].split("-");
                    Date crimeDate = new Date(Integer.parseInt(CrimeStr[0]), Integer.parseInt(CrimeStr[1]), Integer.parseInt(CrimeStr[2]));
                    new Prisoner(line[0], DOB, line[2].charAt(0), line[3], line[5], Integer.parseInt(line[6]), crimeDate, line[4], Integer.parseInt(line[8]));
                    // String name, Date DOB, char gender, String ID, String offense, int duration, Date entry, String inmateID, int cellNumber
                }
            } catch(FileNotFoundException ex) {
                System.out.println("Prisoner File not found");
            }
            // Officers
            try {
                officersFile = new Scanner(new File("src/files/Officers.txt"));
                while(officersFile.hasNextLine()) {
                    String[] line = officersFile.nextLine().split(",");
                    /*[Josh,4-8-1997,M,785-8465910,SN-845931562,Officer]*/
                    String[] DOBStr = line[1].split("-");
                    Date DOB = new Date(Integer.parseInt(DOBStr[0]), Integer.parseInt(DOBStr[1]), Integer.parseInt(DOBStr[2]));
                    new Officer(line[0], DOB, line[2].charAt(0), line[3], line[4], line[5]);
                    // String name, Date dob, char gender, String id, String badgenumber, String rank
                }
            } catch(FileNotFoundException ex) {
                System.out.println("Officers File not found");
            }
            // Cells
            try {
                cellsFile = new Scanner(new File("src/files/Cells.txt"));
                while(cellsFile.hasNextLine()) {
                    String[] line = cellsFile.nextLine().split(";");
                    /*[Ali,01-01-2000,M,12354,12345,Officer;5;Ali,01-01-2000,M,12354,12345,Murder,2,01-01-2018;Ahmed,01-01-2000,M,12354,12345,Murder,2,01-01-2018]*/
                    /*officer + ";" + cellNumber + prisoners*/
                    String[] officerData = line[0].split(",");
                    Officer officer = Database.getOfficer(officerData[4]);
                    ArrayList<Prisoner> cellPrisoners = new ArrayList();
                    for (int i = 2; i < line.length; i++) {
                        String[] data = line[i].split(",");
                        // Ali,01-01-2000,M,12354,12345,Murder,2,01-01-2018
                        cellPrisoners.add(Database.getPrisonerByInmateID(data[4]));
                    }
                    new Cell(officer, cellPrisoners, Integer.parseInt(line[1]));
                    // Officer officer, ArrayList<Prisoner> prisoners, int cellNumber
                }
            } catch(FileNotFoundException ex) {
                System.out.println("Cells File not found");
            }
            // Medical Records
            try {
                medicalRecordsFile = new Scanner(new File("src/files/MedicalRecords.txt"));
                while(medicalRecordsFile.hasNextLine()) {
                    String[] line = medicalRecordsFile.nextLine().split(";");
                    /*[541684;0058;18-4-1996;12-9-2022;Cancer;Public execution]*/
                    /*recordID;InmateID;DOB;date;diagnosis;treatment*/
                    Prisoner prisoner = Database.getPrisonerByInmateID(line[1]);
                    String[] DOBStr = line[2].split("-");
                    Date DOB = new Date(Integer.parseInt(DOBStr[0]), Integer.parseInt(DOBStr[1]), Integer.parseInt(DOBStr[2]));
                    String[] DateStr = line[3].split("-");
                    Date date = new Date(Integer.parseInt(DateStr[0]), Integer.parseInt(DateStr[1]), Integer.parseInt(DateStr[2]));
                    new MedicalRecord(prisoner, date, line[0], line[4], line[5]);
                    // Prisoner prisoner, Date date, String recordID, String diagnosis, String treatment
                }
            } catch(FileNotFoundException ex) {
                System.out.println("Cells File not found");
            }
            // Visitors
            try {
                visitorsFile = new Scanner(new File("src/files/Visitors.txt"));
                while(visitorsFile.hasNextLine()) {
                    String[] line = visitorsFile.nextLine().split(",");
                    /*[John,12-5-1997,M,785-573257,0005]*/
                    String[] DOBStr = line[1].split("-");
                    Date DOB = new Date(Integer.parseInt(DOBStr[0]), Integer.parseInt(DOBStr[1]), Integer.parseInt(DOBStr[2]));
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
                    String[] line = visitationsFile.nextLine().split(";");
                    /* [0001;John,12-5-1997,M,785-573257,0005;Jake,18-4-1996,M,785-3248743,0058,Theft,5,2-6-2018;16-4-2023;5pm]*/
                    // visitationID + ";" + visitor + ";" + prisoner + ";" + dateOfVisit + ";" + time
                    String visitorId = line[1].split(",")[4];
                    String prisonerId = line[2].split(",")[4];
                    String[] dateStr = line[3].split("-");
                    Date DOV = new Date(Integer.parseInt(dateStr[0]), Integer.parseInt(dateStr[1]), Integer.parseInt(dateStr[2]));
                    new Visitation(line[0], DOV, line[4], prisonerId, visitorId);
                    // String visitationID, Date dateOfVisit, String time, String prisonerID, String visitorID
                }
            } catch(FileNotFoundException ex) {
                System.out.println("Visitation File not found");
            }
        } else {
            System.out.println("ATTEMPTED DATABASE RE-INITIALIZATION. NO CHANGES MADE.");
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

    public static ArrayList<Cell> getCells() {
        return cells;
    }

    public static void addCell(Cell cell) {
        cells.add(cell);
    }

    public static ArrayList<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public static void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecords.add(medicalRecord);
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
    
    public static Prisoner getPrisonerByInmateID(String prisonerID) {
        for (Prisoner prisoner : prisoners) {
            if (prisoner.getInmateID().equals(prisonerID)) {
                return prisoner;
            }
        }
        return null;
    }
    
    public static Prisoner getPrisonerByID(String ID) {
        for (Prisoner prisoner : prisoners) {
            if (prisoner.getID().equals(ID)) {
                return prisoner;
            }
        }
        return null;
    }
    
    public static Officer getOfficer(String badgeNumber) {
        for (Officer officer : officers) {
            if (officer.getBadgeNumber().equals(badgeNumber)) {
                return officer;
            }
        }
        return null;
    }
    
    public static Visitation getVisitation(String visitationID) {
        for (Visitation visitation : visitations) {
            if (visitation.getVisitationID().equals(visitationID)) {
                return visitation;
            }
        }
        return null;
    }
    
    public static Visitor getVisitor(String visitorID) {
        for (Visitor visitor : visitors) {
            if (visitor.getVisitorID().equals(visitorID)) {
                return visitor;
            }
        }
        return null;
    }
    
    public static Visitor getVisitorByNID(String visitorIdNumber) {
        for (Visitor visitor : visitors) {
            if (visitor.getID().equals(visitorIdNumber)) {
                return visitor;
            }
        }
        return null;
    }
}
