package jail;


public class Prisoner extends Person{
    private String offense;
    private int duration;
    private Date entry;
    private String inmateID;
    private int cellNumber;

    
    public Prisoner() {  //Def. Constructor
        this(new Person(), "Null",0 ,  new Date(), "Null", 0);
        Database.addPrisoner(this);
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
    public Prisoner(String name, Date DOB, char gender, String ID, String offense, int duration, Date entry, String inmateID){
        super(name, DOB, gender, ID);
        this.offense = offense;
        this.duration = duration;
        this.entry = entry;
        this.inmateID = inmateID;
        Database.addPrisoner(this);
    }
    
    //Copy Constructor
    public Prisoner(Prisoner copy){
        copy.setName(this.getName());
        copy.setDOB(this.getDOB());
        copy.setGender(this.getGender());
        copy.setID(this.getID() + "COPY");
        this.offense = copy.offense;
        this.duration = copy.duration;
        this.entry = new Date(copy.entry);
        this.inmateID = copy.inmateID + "COPY";
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
        return super.toString() + "," + inmateID + "," + offense + "," + duration + "," + entry;
    }
}

