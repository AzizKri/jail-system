package jail;

public class Crime{
    private String offense;
    private int duration;
    
    public Crime(){
        this(null,0);
    }
    
    public Crime(String offense, int duration){
        this.offense = offense;
        this.duration = duration;
    }

    public String getOffense() {
        return offense;
    }

    public void setOffense(String offense) {
        this.offense = offense;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Crime Details: "
                + "\nOffense: " + offense + 
                "\nDuration: "+duration;
    }
    
    
}

