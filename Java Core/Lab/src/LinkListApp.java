import java.util.LinkedList;

public class LinkListApp
{
    public static void main(String[] args)
    {
        Out.ln("This app tests linked lists capabilities");
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Out.ln(cars);
        Out.ln("Testing remove()");
        Out.ln(cars.remove() + " is removed");
        Out.ln(cars);
        Out.ln("Testing addFirst() & addLast()");
        cars.addFirst("Ferrari(First)");
        cars.addLast("Aston Martin(last)");
        Out.ln(cars);
        Out.ln("Testing removeFirst() & removeLast()");
        Out.ln(cars.removeFirst() + " is removed from first");
        Out.ln(cars.removeLast() + " is removed from last");
        Out.ln(cars);
    }
}
