package Collection;


import java.util.ArrayList;
import java.util.List;

public class Array1 {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Ravi");
    names.add("Prerna");
    names.add("Abba");
    names.add("Simba");
    names.add(2, "Timba");
    System.out.println(names);
    System.out.println(names.contains("Timba"));
    names.remove(2);
    System.out.println(names.contains("Timba"));
   
    System.out.println(names.size());
   
    System.out.println( names.isEmpty());
  }
}