package jail;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Database {
    // Define file scanners
    private Scanner prisonersFile = null;
    private Scanner officersFile = null;
    private Scanner visitorsFile = null;
    private Scanner visitationsFile = null;
    private Scanner cellsFile = null;
    private Scanner medicalRecordsFile = null;
    
    // Define static ArrayLists
    private static final ArrayList<Prisoner> prisoners = new ArrayList();
    private static final ArrayList<Officer> officers = new ArrayList();
    private static final ArrayList<Visitor> visitors = new ArrayList();
    private static final ArrayList<Visitation> visitations = new ArrayList();
    private static final ArrayList<Cell> cells = new ArrayList();
    private static final ArrayList<Clinic> medicalRecords = new ArrayList();
    
    // Backup existing data in case of FileWrite errors
    private static String prisonersBackup;
    private static String officersBackup;
    private static String visitorsBackup;
    private static String visitationsBackup;
    private static String cellsBackup;
    private static String medicalRecordsBackup;

    // Constructors
    
    public Database() {
        // Check for previous data to prevent duplicate entries in re-initializations
        if (prisoners.size() + officers.size() + visitors.size() + visitations.size() + cells.size() + medicalRecords.size() == 0) {
            
            /* 
            
            Here we read the files for the following classes and append the data to the arraylists
            
            ";" in files separates between different objects
            "," separates the object's data
            "-" separates the date's numbers
            
            New objects are automatically added to the Database in their respective constructors, hence they are ignored when reading from files
            
            There is an example line below each line splitter for reference, as well as a specific constructor's attributes below each new object made
            
            In case any file is not found, an exception will be thrown with the Class name whose file was not found
            */
            
            //<editor-fold defaultstate="collapsed" desc=" Prisoner Reader ">
            try {
                prisonersFile = new Scanner(new File("src/files/Prisoners.txt"));   // Set the file to the scanner
                
                prisonersBackup = (new Scanner(new File("src/files/Prisoners.txt")).useDelimiter("\\Z").next());
                while(prisonersFile.hasNextLine()) {
                    String[] line = prisonersFile.nextLine().split(",");
                    /*[Jake,18-4-1996,M,785-3248743,0058,Theft,5,2-6-2018,0008] (Example of a line) */
                    
                    // Create Date objects from the string
                    String[] DOBStr = line[1].split("-");
                    Date DOB = new Date(Integer.parseInt(DOBStr[0]), Integer.parseInt(DOBStr[1]), Integer.parseInt(DOBStr[2]));
                    String[] CrimeStr = line[7].split("-");
                    Date crimeDate = new Date(Integer.parseInt(CrimeStr[0]), Integer.parseInt(CrimeStr[1]), Integer.parseInt(CrimeStr[2]));
                    
                    new Prisoner(line[0], DOB, line[2].charAt(0), line[3], line[5], Integer.parseInt(line[6]), crimeDate, line[4], Integer.parseInt(line[8]));
                    // String name, Date DOB, char gender, String ID, String offense, int duration, Date entry, String inmateID, int cellNumber
                }
                prisonersFile.close();
            } catch(Exception ex) {
                System.out.println("Prisoner Reader encountered an error");
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc=" Officer Reader ">
            try {
                officersFile = new Scanner(new File("src/files/Officers.txt"));
                
                officersBackup = (new Scanner(new File("src/files/Officers.txt")).useDelimiter("\\Z").next());
                while(officersFile.hasNextLine()) {
                    String[] line = officersFile.nextLine().split(",");
                    /*[Josh,4-8-1997,M,785-8465910,SN-845931562,Officer]*/
                    
                    // Create Date objects from the string
                    String[] DOBStr = line[1].split("-");
                    Date DOB = new Date(Integer.parseInt(DOBStr[0]), Integer.parseInt(DOBStr[1]), Integer.parseInt(DOBStr[2]));
                    
                    new Officer(line[0], DOB, line[2].charAt(0), line[3], line[4], line[5]);
                    // String name, Date dob, char gender, String id, String badgenumber, String rank
                }
                officersFile.close();
            } catch(Exception ex) {
                System.out.println("Officers Reader encountered an error");
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc=" Cell Reader ">
            try {
                cellsFile = new Scanner(new File("src/files/Cells.txt"));
                
                cellsBackup = (new Scanner(new File("src/files/Cells.txt")).useDelimiter("\\Z").next());
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
                cellsFile.close();
            } catch(Exception ex) {
                System.out.println("Cells Reader encountered an error");
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc=" Medical Records ">
            try {
                medicalRecordsFile = new Scanner(new File("src/files/MedicalRecords.txt"));
                
                medicalRecordsBackup = (new Scanner(new File("src/files/MedicalRecords.txt")).useDelimiter("\\Z").next());
                while(medicalRecordsFile.hasNextLine()) {
                    String[] line = medicalRecordsFile.nextLine().split(";");
                    /*[541684;0058;18-4-1996;12-9-2022;Cancer;Public execution]*/
                    /*recordID;InmateID;DOB;date;diagnosis;treatment*/
                    
                    // Get prisoner
                    Prisoner prisoner = Database.getPrisonerByInmateID(line[1]);
                    
                    // Create Date objects from the string
                    String[] DOBStr = line[2].split("-");
                    Date DOB = new Date(Integer.parseInt(DOBStr[0]), Integer.parseInt(DOBStr[1]), Integer.parseInt(DOBStr[2]));
                    String[] DateStr = line[3].split("-");
                    Date date = new Date(Integer.parseInt(DateStr[0]), Integer.parseInt(DateStr[1]), Integer.parseInt(DateStr[2]));
                    
                    new Clinic(prisoner, date, line[0], line[4], line[5]);
                    // Prisoner prisoner, Date date, String recordID, String diagnosis, String treatment
                }
                medicalRecordsFile.close();
            } catch(Exception ex) {
                System.out.println("MedicalRecords Reader encountered an error");
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc=" Visitors Reader ">
            try {
                visitorsFile = new Scanner(new File("src/files/Visitors.txt"));
                
                visitorsBackup = (new Scanner(new File("src/files/Visitors.txt")).useDelimiter("\\Z").next());
                while(visitorsFile.hasNextLine()) {
                    String[] line = visitorsFile.nextLine().split(",");
                    /*[John,12-5-1997,M,785-573257,0005]*/
                    
                    // Create Date objects from the string
                    String[] DOBStr = line[1].split("-");
                    Date DOB = new Date(Integer.parseInt(DOBStr[0]), Integer.parseInt(DOBStr[1]), Integer.parseInt(DOBStr[2]));
                    
                    new Visitor(line[0], DOB, line[2].charAt(0), line[3], line[4]);
                    // String name, Date DOB, char gender, String personID, String visitorID
                }
                visitorsFile.close();
            } catch(Exception ex) {
                System.out.println("Visitors Reader encountered an error");
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc=" Visitations Reader ">
            try {
                visitationsFile = new Scanner(new File("src/files/Visitations.txt"));
                
                visitationsBackup = (new Scanner(new File("src/files/Visitations.txt")).useDelimiter("\\Z").next());
                while(visitationsFile.hasNextLine()) {
                    String[] line = visitationsFile.nextLine().split(";");
                    /* [Visit-5921;Vs-0005;0058;16-4-2023;5pm]*/
                    // visitationID + ";" + visitorId + ";" + prisonerId + ";" + dateOfVisit + ";" + time
                    
                    // Create Date objects from the string
                    String[] dateStr = line[3].split("-");
                    Date DOV = new Date(Integer.parseInt(dateStr[0]), Integer.parseInt(dateStr[1]), Integer.parseInt(dateStr[2]));
                    
                    new Visitation(line[0], DOV, line[4], line[2], line[1]);
                    // String visitationID, Date dateOfVisit, String time, String prisonerID, String visitorID
                }
                visitationsFile.close();
            } catch(Exception ex) {
                System.out.println("Visitation Reader encountered an error");
            }
            //</editor-fold>
            
        } else {
            // In case a database was re-initialized by mistake, the following will be printed and no changes will take effect.
            System.out.println("ATTEMPTED DATABASE RE-INITIALIZATION. NO CHANGES MADE.");
        }
    }
    
    // File writer. ONLY CALL THIS WHEN THE PROGRAM IS CLOSED!!!
    
    public static void save() {
        // Check if there's anything to write. We don't want to clear our data.
        if (prisoners.size() + officers.size() + visitors.size() + visitations.size() + cells.size() + medicalRecords.size() > 0) {
            /*
            
            We start each writer by defining the FileWriter as null in order to make sure it's closed while catching any exceptions.
            Each writer will append its objects to an empty string, then overwrite the file mentioned.
            
            */
            
            //<editor-fold defaultstate="collapsed" desc=" Prisoner Writer ">
            FileWriter prisonerWriter = null;
            try {
                prisonerWriter = new FileWriter("src/files/Prisoners.txt");
                String data = "";
                for (Prisoner prisoner : prisoners) {
                    data += prisoner + "\n";
                }
                prisonerWriter.write(data);
                prisonerWriter.close();
            } catch(Exception ex) {
                System.out.println("Prisoners Writer encountered an error");
                try {
                    prisonerWriter.write(prisonersBackup);
                } catch(Exception backupEx) {
                    System.out.println("Prisoners Backup Writer encountered an error");
                }
            } finally {
                try {
                    prisonerWriter.close();
                } catch(Exception ex) {
                System.out.println("Prisoners Writer encountered an error");
                }
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc=" Officer Writer ">
            FileWriter officerWriter = null;
            try {
                officerWriter = new FileWriter("src/files/Officers.txt");
                String data = "";
                for (Officer officer : officers) {
                    data += officer + "\n";
                }
                officerWriter.write(data);
                officerWriter.close();
            } catch(Exception ex) {
                System.out.println("Officers Writer encountered an error");
                try {
                    officerWriter.write(officersBackup);
                } catch(Exception backupEx) {
                    System.out.println("Officers Backup Writer encountered an error");
                }
            } finally {
                try {
                    officerWriter.close();
                } catch(Exception ex) {
                System.out.println("Officers Writer encountered an error");
                }
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc=" Cells Writer ">
            FileWriter cellsWriter = null;
            try {
                cellsWriter = new FileWriter("src/files/Cells.txt");
                String data = "";
                for (Cell cell : cells) {
                    data += cell + "\n";
                }
                cellsWriter.write(data);
                cellsWriter.close();
            } catch(Exception ex) {
                System.out.println("Cells Writer encountered an error");
                try {
                    cellsWriter.write(cellsBackup);
                } catch(Exception backupEx) {
                    System.out.println("Cells Backup Writer encountered an error");
                }
            } finally {
                try {
                    cellsWriter.close();
                } catch(Exception ex) {
                System.out.println("Cells Writer encountered an error");
                }
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc=" Medical Record Writer ">
            FileWriter medicalRecordsWriter = null;
            try {
                medicalRecordsWriter = new FileWriter("src/files/MedicalRecords.txt");
                String data = "";
                for (Clinic medicalRecord : medicalRecords) {
                    data += medicalRecord + "\n";
                }
                medicalRecordsWriter.write(data);
                medicalRecordsWriter.close();
            } catch(Exception ex) {
                System.out.println("MedicalRecords Writer encountered an error");
                try {
                    medicalRecordsWriter.write(medicalRecordsBackup);
                } catch(Exception backupEx) {
                    System.out.println("MedicalRecords Backup Writer encountered an error");
                }
            } finally {
                try {
                    medicalRecordsWriter.close();
                } catch(Exception ex) {
                System.out.println("MedicalRecords Writer encountered an error");
                }
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc=" Visitor Writer ">
            FileWriter visitorWriter = null;
            try {
                visitorWriter = new FileWriter("src/files/Visitors.txt");
                String data = "";
                for (Visitor visitor : visitors) {
                    data += visitor + "\n";
                }
                visitorWriter.write(data);
                visitorWriter.close();
            } catch(Exception ex) {
                System.out.println("Visitors Writer encountered an error");
                try {
                    visitorWriter.write(visitorsBackup);
                } catch(Exception backupEx) {
                    System.out.println("Visitors Backup Writer encountered an error");
                }
            } finally {
                try {
                    visitorWriter.close();
                } catch(Exception ex) {
                System.out.println("Visitors Writer encountered an error");
                }
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc=" Visitation Writer ">
            FileWriter visitationWriter = null;
            try {
                visitationWriter = new FileWriter("src/files/Visitations.txt");
                String data = "";
                for (Visitation visit : visitations) {
                    data += visit + "\n";
                }
                visitationWriter.write(data);
                visitationWriter.close();
            } catch(Exception ex) {
                System.out.println("Visitations Writer encountered an error");
                try {
                    visitationWriter.write(visitationsBackup);
                } catch(Exception backupEx) {
                    System.out.println("Visitations Backup Writer encountered an error");
                }
            } finally {
                try {
                    visitationWriter.close();
                } catch(Exception ex) {
                System.out.println("Visitations Writer encountered an error");
                }
            }
            //</editor-fold>
        }
    }

    // Getters and Adders (Setters are unneeded, replaced with Adders instead)

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

    public static ArrayList<Clinic> getMedicalRecords() {
        return medicalRecords;
    }

    public static void addMedicalRecord(Clinic medicalRecord) {
        medicalRecords.add(medicalRecord);
    }
    
        
    public static Clinic getMedicalRecord(String medicalRecordID) {
        for (Clinic medicalRecord : medicalRecords) {
            if (medicalRecord.getRecordID().equals(medicalRecordID)) {
                return medicalRecord;
            }
        }
        return null;
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
    
    // Public methods (Mostly getting Objects by their Unique IDs)
    
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
    
    public static Prisoner getPrisonerByName(String name) {
        for (Prisoner prisoner : prisoners) {
            if (prisoner.getName().toLowerCase().equals(name.toLowerCase())) {
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
    
    public static Officer getOfficerByName(String name) {
        for (Officer officer : officers) {
            if (officer.getName().toLowerCase().equals(name.toLowerCase())) {
                return officer;
            }
        }
        return null;
    }
    
    public static Officer getOfficerByID(String ID) {
        for (Officer officer : officers) {
            if (officer.getID().equals(ID)) {
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
