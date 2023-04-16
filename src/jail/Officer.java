package jail;

public class Officer extends Person{
    private String badgeNumber;
    private String rank;
    
    public Officer(){
        this.badgeNumber=null;
        this.rank = null;
    }
    
    public Officer(String name, Date dob, char gender, String id, String badgenumber, String rank ){
        super(name, dob, gender, id);
        this.badgeNumber=badgenumber;
        this.rank = rank;
    }
    
    public Officer (Person per, String badgenumber, String rank){
        super(per);
        this.badgeNumber=badgenumber;
        this.rank = rank;
    }
    
    public Officer (Officer offi){
        super(offi.getName(), offi.getDOB(), offi.getGender(), offi.getID());
        this.badgeNumber = offi.badgeNumber;
        this.rank = offi.rank;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return  "Name:" + getName() +
                "\nDOB: " + getDOB() + 
                "\nGender: " + getGender() + 
                "\nID: " + getID() +
                "\nBadge Number: " + this.badgeNumber +
                "\nRank: " + this.rank;
    }
    
    
}
