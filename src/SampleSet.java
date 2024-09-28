import java.util.HashSet;

public class SampleSet {
public static void main(String[] args) {
  HashSet<String> musicCategories = new HashSet<String>();
  HashSet<Integer> numbers = new HashSet<Integer>();
  
  
  musicCategories.add("Rock");
  musicCategories.add("Country");
  musicCategories.add("Pop");
  
  for(String category: musicCategories) {
    System.out.println(category);
  }
}
}
