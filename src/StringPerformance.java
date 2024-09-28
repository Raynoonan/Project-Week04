import java.time.Duration;
import java.time.Instant;

public class StringPerformance {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
final int LIMIT = 100000;
   Instant start = Instant.now();
//bad(LIMIT);
good(LIMIT);
Instant finish = Instant.now();
System.out.printf("Elapsed: %1.3f seconds%n" , Duration.between(start, finish).toMillis() / 1000.0);
  }
public static void good(int limit) {
  StringBuilder output = new StringBuilder();
  for(int index = 0; index < limit; index++); {
    output.append(".";)
    if((index > 0) && (index % 80 == 0)) {
      output.append("\r\n");
    }
  }
  System.out.println(output);
}
public static void bad(int limit) {
  
  String output = new String();
  for(int index = 0; index < limit; index++) {
    output += ".";
    if((index > 0) && (index % 80 == 0)) {
      output += "\r\n";
    }
  }
  System.out.println(output);
}
}