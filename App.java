import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("How many hours did you spend coding yesterday?");
    String stringYesterdayHrs = console.readLine();
    int yesterdayHrs = Integer.parseInt(stringYesterdayHrs);

    System.out.println("How many hours did you spend the day before that?");
    String string2AgoHrs = console.readLine();
    int twoAgoHrs = Integer.parseInt(string2AgoHrs);

    System.out.println("How many days did you spend the day before THAT?");
    String string3AgoHrs = console.readLine();
    int threeAgoHrs = Integer.parseInt(string3AgoHrs);

    int totalHours = yesterdayHrs + twoAgoHrs + threeAgoHrs;

    if (totalHours >= 20){
      System.out.println("You spent " + totalHours + " hours coding in the last three days. Great Job!");
    } else if (totalHours < 20 && totalHours >= 5) {
      System.out.println("You spent " + totalHours + " hours coding in the last three days. Pretty Good!");
    } else {
      System.out.println("You spent " + totalHours + " hours coding in the last three days. You should probably be doing more work...");
    }
  }
}
