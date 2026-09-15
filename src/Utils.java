import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public final class Utils {

   public static String formatarDataBR(LocalDate data) {
       var formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

       return data.format(formatador);
   }

   public static String formatarMoedaBR(BigDecimal valor) {
       var formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

       return formatador.format(valor);
   }
}
