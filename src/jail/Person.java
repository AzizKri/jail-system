package jail;

public class Person {
    private String name;
    private Date DOB;
    private char gender;
    private String ID;

    public Person() {
        this("", new Date(), '\u0000', "");
    }

    public Person(String name, Date DOB, char gender, String ID) {
        this.name = name;
        this.DOB = new Date(DOB);
        this.setGender(gender);
        this.ID = ID;
    }
    
    public Person(Person prs) {
        this.name = prs.name;
        this.DOB = new Date(prs.DOB);
        this.gender = prs.gender;
        this.ID = prs.ID + " COPY";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setAge(Date DOB) {
        this.DOB = new Date(DOB);
    }
    
    public void setAge(int day, int month, int year) {
        this.DOB = new Date(day, month, year);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = 
                Character.compare(Character.toUpperCase(gender), 'M') == 0 ||
                Character.compare(Character.toUpperCase(gender), 'F') == 0 ?
                gender : 'N';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "PERSON DETAILS: \nName:" + name +
                "\nDOB: " + DOB + 
                "\nGender: " + gender + 
                "\nID: " + ID + "\n";
    }
}
