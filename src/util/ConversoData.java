
package util;
import java.time.LocalDate;
import java.util.Date;
import java.time.ZoneId;

public class ConversoData {
    
    public static LocalDate converterDateParaLocalDate(Date dataUtil){
        if (dataUtil == null){
            return null;
        }
        return dataUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
     }
    
    public static Date converterLocalDateParaDate(LocalDate localDate){
        if (localDate == null) {
            return null;
        }
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
}
