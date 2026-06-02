import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class CepService {
   public CepService() {
   }

   public String consultarCep(String var1) {
      try {
         var1 = var1.replace("-", "");
         var1 = var1.replace(".", "");
         var1 = var1.trim();
         if (var1.length() != 8) {
            return "CEP inválido. Digite exatamente 8 números.";
         } else {
            String var2 = "https://viacep.com.br/ws/" + var1 + "/json/";
            URI var3 = new URI(var2);
            URL var4 = var3.toURL();
            BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.openStream(), "UTF-8"));

            String var6;
            String var7;
            for (var7 = ""; (var6 = var5.readLine()) != null; var7 = var7 + var6 + "\n") {
            }

            var5.close();
            return var7;
         }
      } catch (Exception var8) {
         return "Erro ao consultar CEP.";
      }
   }
}
