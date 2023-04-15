package jail;


public class Prisoner extends Person{
    private String offense;
    private int duration;
    private Date entry;
    private String inmateID;

    public Prisoner() {
    }

    public Prisoner(String a, int b, char c, String d, String e, int f, int g, int h, int i){
        
    }
    
    public Prisoner(String a, int b, char c, String d, String e, int f, Date g){
        
    }
    
    public Prisoner(Person p, String str, int i, Date d){
        
    }
    
    public Prisoner(Prisoner copy){
        this.offense = copy.offense;
        this.duration = copy.duration;
        this.entry = new Date(copy.entry);
        this.inmateID = copy.inmateID + "COPY";
    }
    
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
    
    @Override
    public String toString(){
        return "";
    }

    
    
    
}

