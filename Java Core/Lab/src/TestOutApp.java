public class TestOutApp
{
    public static void main(String[] args)
    {
        Out.ln("This app tests the Custom class \"Out\"");
        Out.ln("testing ln()");
        Out stream = new Out();
        Out s1 = new Out("Initialized manually");
        int no = 1;
        Out.ln("testing add()");
        stream.add("1st Add no: " + no++);
        stream.add("2nd Add no: " + no++);
        Out.ln("Out all:");
        stream.out();
        Out.ln("testing addln()");
        stream.addln("3rd Addln no: " + no++);
        stream.addln("4th Addln no: " + no++);
        Out.ln("Out all:");
        stream.out();
        Out.ln("testing clear()");
        stream.clear();
        stream.addln("5th Addln no: " + no++);
        stream.addln("6th Addln no: " + no++);
        Out.ln("Out all:");
        stream.out();
        s1.add("add 1");
        s1.add("add 2");
        s1.addln("addln 3");
        s1.addln("addln 4");
        Out.ln("Displaying s1 contents:");
        s1.out();
        Out.ln("Displaying stream contents:");
        stream.out();
        Out.ln("\nTesting new line in ln()");
    }
}
