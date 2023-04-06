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
        Date d1 = new Date(6,4,2022);
        Date d2 = new Date(0, 9, 2);
        
        System.out.println(d1);
        System.out.println(d1.releaseDate(500));
        System.out.println(d2.toDays());
    }
    
}
