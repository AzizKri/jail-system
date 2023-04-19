package jail;

import java.util.Random;


public class Prisoner extends Person{
    private String offense;
    private int duration;
    private Date entry;
    private String inmateID;
    private int cellNumber;

    
    public Prisoner() {  //Def. Constructor
        this(new Person(), "Null",0 ,  new Date(), "Null", 0);
    }
  
    //Initializing constructor using the super class and Prisoner attributes
    public Prisoner(Person p, String offense, int duration, Date entry, String inmateID, int cellNumber){
        this.setName(p.getName());
        this.setDOB(p.getDOB());
        this.setGender(p.getGender());
        this.setID(p.getID());
        this.offense = offense;
        this.duration = duration;
        this.entry = entry;
        this.inmateID = inmateID;
        this.cellNumber = cellNumber;
        Database.addPrisoner(this);
    }
    
    //Initializing concstructor using all attributes (including super class)
    public Prisoner(String name, Date DOB, char gender, String ID, String offense, int duration, Date entry, String inmateID, int cellNumber){
        super(name, DOB, gender, ID);
        this.offense = offense;
        this.duration = duration;
        this.entry = entry;
        this.inmateID = inmateID;
        this.cellNumber = cellNumber;
        Database.addPrisoner(this);
    }
    
    public Prisoner(String name, Date DOB, char gender, String ID, String offense, int duration, Date entry, int cellNumber){
        super(name, DOB, gender, ID);
        int checker = 1;
        Random random = new Random();
        this.offense = offense;
        this.duration = duration;
        this.entry = entry;
        this.inmateID = Integer.toString(random.nextInt(9999));
        do {
        for (int i = 0; i < Database.getPrisoners().size(); i++) {
                if(Database.getPrisoners().get(i).inmateID.equals( this.inmateID)){
                    this.inmateID = Integer.toString(random.nextInt(9999));
                    checker = 0;
                    break;
                }}}while(checker == 0);
        
        this.cellNumber = cellNumber;
        Database.addPrisoner(this);
    }
    
    //Copy Constructor
    public Prisoner(Prisoner copy){
        this.setName(copy.getName());
        this.setDOB(copy.getDOB());
        this.setGender(copy.getGender());
        this.setID(copy.getID());
        this.offense = copy.offense;
        this.duration = copy.duration;
        this.entry = new Date(copy.entry);
        this.inmateID = copy.inmateID;
        this.cellNumber = copy.cellNumber;
        Database.addPrisoner(this);
    }
    
    //Setters
    public void setOffense(String offense) {
        this.offense = offense;
    }
    
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setEntry(Date entry) {
        this.entry = entry;
    }

    public void setInmateID(String inmateID) {
        this.inmateID = inmateID;
    }
    
    //Getters
    public String getOffense() {
        return offense;
    }
    
    public int getDuration() {
        return duration;
    }

    public Date getEntry() {
        return entry;
    }

    public String getInmateID() {
        return inmateID;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }
    
    public String toFile(){
        return inmateID + "," + offense + "," + duration + "," + entry;
    } 
    
    @Override
    public String toString(){
        return super.toString() + "," + inmateID + "," + offense + "," + duration + "," + entry + "," + cellNumber;
    }
    
    public String display(){
        return super.display() + "\nInmateID: " + inmateID + "\nOffense: " + offense + "\nDuration: " + duration + "\nEntry: " + entry + "\nCell Number: " + cellNumber;
    }
}

