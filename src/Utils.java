import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public final class Utils {

   public static String formatarDataDDMMYYYY(LocalDate data) {
       var regraFormatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

       return data.format(regraFormatoData);
   }

   public static String formatarDinheiroBR(BigDecimal valor) {
       var regraFormatoSalario = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

       return regraFormatoSalario.format(valor);
   }
}
