package jail;

public class Person {
    private String name;    // Person's name
    private Date DOB;       // Person's Date of Birth
    private char gender;    // Person's gender
    private String ID;      // Person's ID

    // Constructors
    
    public Person() {       // Default constructor. No name, DOB is 0/0/0. No gender. No ID
        this("", new Date(), '\u0000', "");
    }

    public Person(String name, Date DOB, char gender, String ID) {  // Initializing Constructor
        this.name = name;
        this.DOB = new Date(DOB);
        this.setGender(gender);
        this.ID = ID;
    }
    
    public Person(Person prs) {     // Copy constructor
        this.name = prs.name;
        this.DOB = new Date(prs.DOB);
        this.gender = prs.gender;
        this.ID = prs.ID + " COPY";
    }
    
    // Setters and getters
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = new Date(DOB);
    }
    
    public void setDOB(int day, int month, int year) {
        this.DOB = new Date(day, month, year);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    // toString
    
    @Override
    public String toString() {
        return name + "," + DOB + "," + gender + "," + ID;
    }
}
