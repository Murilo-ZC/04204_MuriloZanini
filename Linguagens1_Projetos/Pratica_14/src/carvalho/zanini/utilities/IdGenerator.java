package carvalho.zanini.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IdGenerator {
    private static final int MAX_VALUE = 999999;
    private static final int MIN_VALUE = 100000;
    public static String generateId(){
//        return "" + (int)(Math.random()*(MAX_VALUE - MIN_VALUE) + MIN_VALUE);
        return "" + LocalDateTime.now().getYear() +
                LocalDateTime.now().getMonth().getValue() +
                LocalDateTime.now().getDayOfMonth()+
                LocalDateTime.now().getHour() +
                LocalDateTime.now().getMinute() +
                (int)(Math.random()*(MAX_VALUE - MIN_VALUE) + MIN_VALUE);

    }

    public static String generateIdFormatado(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        return LocalDateTime.now().format(dateTimeFormatter) + (int)(Math.random()*(MAX_VALUE - MIN_VALUE) + MIN_VALUE);
    }

}
