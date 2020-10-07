package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1993, 11, 11);
        Person person = new Person("Marcos", date);
        System.out.println(person.getName() + " " + person.getAge());
    }
    
}
