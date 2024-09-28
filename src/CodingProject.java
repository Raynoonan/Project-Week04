import java.util.Arrays;

public class CodingProject {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // 1.
    int[] ages = new int[8];
    ages[0] = 3;
    ages[1] = 9;
    ages[2] = 23;
    ages[3] = 64;
    ages[4] = 2;
    ages[5] = 8;
    ages[6] = 28;
    ages[7] = 93;

    int result = ages[ages.length - 1] - ages[0];
    System.out.println(result);
    // the array length - 1 = 7 since the array always starts with a 0
    // and the length is 8


    int[] ages2 = new int[9];
    ages2[0] = 4;
    ages2[1] = 27;
    ages2[2] = 80;
    ages2[3] = 52;
    ages2[4] = 17;
    ages2[5] = 21;
    ages2[6] = 39;
    ages2[7] = 13;
    ages2[8] = 25;

    int result2 = ages2[ages2.length - 1] - ages2[0];
    System.out.println(result2);

    double sum = 0;
    for (int i = 0; i < ages.length; i++) {
      sum += ages[i];
    }
    System.out.println(sum / ages.length);
    // I used a for loop to go through all the elements to add them and create the sum. And then
    // divide them
    // all by the length.

    // 2.
    String[] names = new String[5];
    names[0] = "Tommy";
    names[1] = "Tim";
    names[2] = "Sally";
    names[3] = "Buck";
    names[4] = "Bob";

    int sumOfLetters = 0;
    for (String name : names) {
      sumOfLetters += names.length;
    }
    System.out.println(sumOfLetters / names.length);
    // I got 5 for the average number of letters by creating the variable sumOfLetters putting the
    // sum of letters
    // into that variable and dividing it by the names length.
    for (int i = 0; i < names.length; i++) {

    }
    System.out
        .println(names[0] + " " + names[1] + " " + names[2] + " " + names[3] + " " + names[4]);
    // I iterated through the names array by using a for loop and I printed each name by adding a
    // space with
    // quotes between them.

    // 3.
    System.out.println(names.length - 1);
    // You access the last element of any array regardless of its length by using the .length method
    // and
    // subtract by 1 since the first element is going to be 0.

    // 4.
    System.out.println(names[0]);
    // You access the first element of any array by using the array name and 0 since the arrays
    // always
    // start at 0.

    // 5.
    int[] nameLengths = new int[names.length];

    for (int i = 0; i < names.length; i++) {
      nameLengths[i] = names[i].length();
    }
    System.out.println(Arrays.toString(nameLengths));
    // I used the for loop to run through the names array again but added .length to just add the
    // lengths of the
    // names. Then I put the name lengths into the variable nameLengths. Then I used .toString
    // because I kept
    // getting errors if I just printed nameLengths.

    // 6.
    for (int nameslength : nameLengths) {
    }
    System.out.println(
        nameLengths[0] + nameLengths[1] + nameLengths[2] + nameLengths[3] + nameLengths[4]);


    // 7.
    int numTimes = 3;
    String userWord = "Hello";
    System.out.println(repeatWord(userWord, numTimes));
    // I put the method outside of the main method and did the for loop and put userWord into the
    // new variable
    // newString. Then I printed the userWord the numTimes.

    // 8.
    System.out.println(fullName("Ray", "Noonan"));
    // I made the method a string to return a string which is the full name. I named the two strings
    // first name
    // and last name. And returned both of them with a space in the middle.

    // 9.
    int[] ints = {3, 16, 68, 47};
    System.out.println(sumOfInts(true, false));
  }

  // 10.
  double[] doubles = {7.14, 8.9, 20.5, 10.15};System.out.println(averageNumber(doubles));
    
//11.
    double[] array1 = {1.2, 9.8, 20.4, 50.5};
    double [] array2 = {3.4, 5.6, 15.4, 30.6};
    
// 12. 
    
// Methods:
    
// 7. 
static String repeatWord(String userWord, int numTimes) {
  String newString = "";
  for( int i = 0; i < numTimes; i++) {
    newString += userWord;
}
  return newString;
}

  // 8.
  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  // 9.
  public static boolean sumOfInts(int[] ints) {
      for (int i = 0; i < ints.length;){
        if( ints[i] > 100) {
          
    return true;
          }
 
    } else {
      return false;
 // I tried to use a if statement to see if the sum of the array is greater than 100 but it doesn't work.
      }
    }

  // 10.
  public static double averageNumber(double[] array) {
    double sum = 0;
    for (double number : array) {
      sum += number;
    }
    return sum / array.length;

  }

  // 11.
  public static double averageOfArrays(double[] array, double[] array2) {
      double sum = 0;
      for(double number : array) {
        sum += number;
    }
}return sum/array.length;}

  double sum = 0;for(
  double number:array2)
  {
  sum += number;
}
  return sum / array2.length;
  }
  
//12.
   public static boolean isHotOutside(double moneyInPocket) {
     
     
     return true
  }


