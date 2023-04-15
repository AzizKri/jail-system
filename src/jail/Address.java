package jail;

public class Address {
    private int homeNumber;
    private String street;
    private String city;
    
    public Address(){
        this(00, "", "");
    }

    public Address(int homeNumber, String street, String city) {
        this.homeNumber = homeNumber;
        this.street = street;
        this.city = city;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(int homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public String toString(){
        return "Home Number: " + homeNumber + "\nStreet: " + street + "\nCity: " + city + "\n";
    }
    
    
}
