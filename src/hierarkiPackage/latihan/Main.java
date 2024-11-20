package hierarkiPackage.latihan;
import hierarkiPackage.latihan.terminal.Console;

// mengimpor static method dari console
import static hierarkiPackage.latihan.terminal.Console.log;

public class Main {
    public static void main(String[] args) {
      Player player = new Player("abel");
      player.show();

      Console.log("ini dari console = " + player.getName());
      System.out.println("==================================");
      log(player.getName());
    }
}










// ini tidak akan bisa, pengunaan provate tidak diperkenankan
// private class Test{

//}