package jail;

/**
 *
 * @author Hussain
 */
public class Meal {
    private String name;
    private String type;
    private String time;
    private Date date;

    public Meal(String name, String type, String time, Date date) {
        this.name = name;
        this.type = type;
        this.time = time;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
