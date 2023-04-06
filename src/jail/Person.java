package jail;

public class Person {
    private String name;
    private int age;
    private char gender;
    private String ID;

    public Person() {
    }

    public Person(String name, int age, char gender, String ID) {
        this.name = name;
        this.age = (age >= 0) ? age : 0;
        this.setGender(gender);
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age >= 0) ? age : 0;
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
                "\nAge: " + age + 
                "\nGender: " + gender + 
                "\nID: " + ID + "\n";
    }
}
