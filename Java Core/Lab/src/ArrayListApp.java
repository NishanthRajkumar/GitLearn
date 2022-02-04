import java.util.ArrayList;
import java.util.Collections;

// Testing array list class in java


// Objects of the Person class is used in ArrayList
class Person
{
  String name;
  int age;
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  void display()
  {
    Out.ln("Name: " + name);
    Out.ln("Age: " + age);
  }
  
  void display(String id, int n)
  {
    Out.ln(id + " " + n);
    Out.ln("Name: " + name);
    Out.ln("Age: " + age);
  }
}

public class ArrayListApp
{
  public static void main(String[] args)
  {
    Out.ln("This app tests Array list capabilities");
    var cars = new ArrayList<String>();
    var nos = new ArrayList<Integer>();
    var man = new ArrayList<Person>(); // ArrayList of custom class
    var dev = new ArrayList<Person>(); // ArrayList of custom class
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    nos.add(1200);
    nos.add(28);
    nos.add(146);
    System.out.printf("Cars: %s\nNos: %s\n", cars, nos);
    Out.ln(cars.get(2));
    cars.remove(3);
    var x = Integer.valueOf(28);
    nos.remove(x);
    Out.ln("cars: " + cars + "\nNos: " + nos);
    Out.ln("cars: " + cars.size() + " Nos:" + nos.size());
    // cars.clear();
    // Out.ln(cars.size() + " " + nos.size());
    for (var item : cars)
    {
      Out.ln(item);
    }
    man.add(new Person("Nish", 25));
    man.add(new Person("Jeffy", 22));
    cars.set(2, "Ferrari");
    Out.ln(man);
    Out.ln(cars);
    print(man);
    printWithIndex(man, "Man");
    dev.add(new Person("Linus Torvalds", 52));
    dev.add(new Person("Bill Gates", 52));
    dev.add(new Person("Mark Zuckerberg", 52));
    dev.add(new Person("Alan Turing", 52));
    Out.ln("No of devs: " + dev.size());
    print(dev);
    printWithIndex(dev, "Developer");
    Collections.sort(cars);
    Collections.sort(nos);
    // Collections.sort(man);
    // Collections.sort(List<T> dev);
    Out.ln("cars: " + cars + "\nNos: " + nos);
  }

  private static void print(ArrayList<Person> man)
  {
    for (var item : man)
    {
      item.display();
    }
    Out.ln("\n");
  }

  private static void printWithIndex(ArrayList<Person> man, String category)
  {
    for (int i = 0; i < man.size(); i++)
    {
      man.get(i).display(category, i+1);
    }
    Out.ln("\n");
  }
}