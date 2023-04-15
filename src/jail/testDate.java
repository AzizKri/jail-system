package jail;

/**
 *
 * @author Hussain
 */
public class testDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d1 = new Date(2022,4,5);
        Date dob = new Date(1999, 9, 2);
        Date releaseDate = new Date(2025, 12, 12);
        
        System.out.println(d1.releaseDate(500));
        System.out.println(dob.getAge());
        System.out.println(releaseDate.remainingTime());
    }
}
