package jail;

public class Session {
    private String sessionName;
    private int sessionYear;

    public Session() {
    }

    public Session(String sessionName, int sessionYear) {
        this.sessionName = sessionName;
        this.sessionYear = sessionYear;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public int getSessionYear() {
        return sessionYear;
    }

    public void setSessionYear(int sessionYear) {
        this.sessionYear = sessionYear;
    }
    
    public String toString(){
        return "Session: " + sessionName + sessionYear + "\n";
    }
    
}
