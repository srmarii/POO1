import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ClimaService {
   public ClimaService() {
   }

   public String consultarClima(String var1) {
      try {
         var1 = var1.replace(" ", "%20");
         String var2 = "https://wttr.in/" + var1 + "?format=3";
         URL var3 = new URL(var2);
         BufferedReader var4 = new BufferedReader(new InputStreamReader(var3.openStream()));
         String var5 = var4.readLine();
         var4.close();
         return var5;
      } catch (Exception var6) {
         return "Erro ao consultar clima.";
      }
   }

   public double consultarTemperatura(String var1) {
      try {
         var1 = var1.replace(" ", "%20");
         String var2 = "https://wttr.in/" + var1 + "?format=%t";
         URL var3 = new URL(var2);
         BufferedReader var4 = new BufferedReader(new InputStreamReader(var3.openStream()));
         String var5 = var4.readLine();
         var4.close();
         var5 = var5.replace("+", "").replace("°C", "").trim();
         return Double.parseDouble(var5);
      } catch (Exception var6) {
         return 0.0;
      }
   }
}
