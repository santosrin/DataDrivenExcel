package Java8_2;

import java.time.*;
import java.util.Set;

public class DateTimeDemo {

    public static void main(String[] args) {
//        LocalDate d = LocalDate.now();
        //LocalDate d = LocalDate.of(2030, Month.APRIL,20);
//        LocalTime d = LocalTime.now();
        //LocalTime d = LocalTime.of(12,35,10,999);
        LocalTime d = LocalTime.now(ZoneId.of("Asia/Kuwait"));
        System.out.println(d);

        Instant i = Instant.now();
        System.out.println(i);

        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld);
//        for(String s : ZoneId.getAvailableZoneIds()) {
//            System.out.println(s);
//        }

    }
}
