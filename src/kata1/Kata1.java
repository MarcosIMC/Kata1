package kata1;

import java.util.Date;

/**
 *
 * @author marke
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person("Marcos", new Date(93, 11, 11));
        System.out.println(person.getName() + " " + person.getAge());
    }
    
}
