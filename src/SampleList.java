import java.util.ArrayList;

public class SampleList {
  
  public static void display(ArrayList<String> values) {
    for(String value : values) {
      System.out.println(value);
    }
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
ArrayList<String> names = new ArrayList<String>();
names.add("George");
names.add("Ray");
names.add("Kierra");
names.add("Jhomar");
display(names);

names.remove(3);
display(names);

names.add(1, "Ava");
display(names);

System.out.println(names.size());

for(int index = names.size() - 1; index >= 0; index--) {
  String name = names.get(index);
  System.out.println("[" + index + "]" + name);
}

  }

}
