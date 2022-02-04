import java.util.Scanner;

public class Scan
{
    private static Scanner read = new Scanner(System.in);

    public static boolean Bool()
    {
        var val = read.nextBoolean();
        Line();
        return val;
    }

    public static byte Bytes()
    {
        var val = read.nextByte();
        Line();
        return val;
    }

    public static double Double()
    {
        var val = read.nextDouble();
        Line();
        return val;
    }

    public static float Float()
    {
        var val = read.nextFloat();
        Line();
        return val;
    }

    public static int Int()
    {
        var val = read.nextInt();
        Line();
        return val;
    }

    public static String Line()
    {
        var val = read.nextLine();
        return val;
    }

    public static long Long()
    {
        var val = read.nextLong();
        Line();
        return val;
    }

    public static short Short()
    {
        var val = read.nextShort();
        Line();
        return val;
    }

    public static boolean Bool(String msg)
    {
        Out.ln(msg);
        var val = read.nextBoolean();
        Line();
        return val;
    }

    public static byte Bytes(String msg)
    {
        Out.ln(msg);
        var val = read.nextByte();
        Line();
        return val;
    }

    public static double Double(String msg)
    {
        Out.ln(msg);
        var val = read.nextDouble();
        Line();
        return val;
    }

    public static float Float(String msg)
    {
        Out.ln(msg);
        var val = read.nextFloat();
        Line();
        return val;
    }

    public static int Int(String msg)
    {
        Out.ln(msg);
        var val = read.nextInt();
        Line();
        return val;
    }

    public static String Line(String msg)
    {
        Out.ln(msg);
        var val = read.nextLine();
        return val;
    }

    public static long Long(String msg)
    {
        Out.ln(msg);
        var val = read.nextLong();
        Line();
        return val;
    }

    public static short Short(String msg)
    {
        Out.ln(msg);
        var val = read.nextShort();
        Line();
        return val;
    }
}
