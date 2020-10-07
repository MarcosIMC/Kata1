package kata1;

import java.time.LocalDate;
import java.time.Month;
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
        LocalDate date = LocalDate.of(1993, Month.NOVEMBER, 11);
        Person person = new Person("Marcos", date);
        System.out.println(person.getName() + " " + person.getAge());
    }
    
}
