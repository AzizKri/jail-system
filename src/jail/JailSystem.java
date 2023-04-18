package jail;

import java.util.ArrayList;

public class JailSystem {

    public static void main(String[] args) {
        Date db = new Date(2000, 1, 1);
        Date entry = new Date(2018, 1, 1);
        Prisoner p1 = new Prisoner("Ali", db, 'M', "12354", "Murder", 2, entry, "12345", 0008);
        // "Ali", db, 'M', "12354", "Murder", 2, entry, "12345", 0008
        Prisoner p2 = new Prisoner(p1);
        p2.setName("Ahmed");
        Officer of = new Officer("Ali", db, 'M', "12354", "12345", "Officer");
        
        ArrayList<Prisoner> prisoners = new ArrayList<Prisoner>();
        prisoners.add(p1);
        prisoners.add(p2);
        
        Cell c1 = new Cell(of, prisoners, 5);
        System.out.println(c1);
        System.out.println("----------------------------------------------------------");
        String split1[] = c1.toString().split(";");
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
        }
        String ofDetails[] = split1[0].split(",");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < ofDetails.length; i++) {
            System.out.println(ofDetails[i]);
        }
    }
}
