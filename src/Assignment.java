import java.util.List;

public class Assignment {

  
  public static boolean greaterThan(ArrayList<Doubles> left, ArrayList<Doubles> right) {
    return false;
  }
  public static void main(String[] args) {
   
//11.Write a method that takes two arrays of double and returns true if the average of the elements
   // in the first array is greater than the average of the elements in the second array.
    
    ArrayList<Double> numbers1 = new ArrayList<Double>(
    List.of(10.1, 20.5, 84.34, 9.4, 1.0));
    
    ArrayList<Double> numbers2 = new  ArrayList<>(
        List.of(9.4, 34.0, 56.23, 101.8, 0.4));
    
    boolean numbers1IsGreaterThan = greaterThan(number1, number2);
    System.out.println("Numbers1 > Numbers2 =>" + numbers1IsGreaterThan);
  }
  
  

}
