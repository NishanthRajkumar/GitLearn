public class TestScanApp
{
    public static void main(String[] args)
    {
        Out.ln("Testing the custom clas \"Scan\" ");
        Out.ln("Enter float: ");
        var f = Scan.Float();
        Out.ln("Enter Int: ");
        var i = Scan.Int();
        Out.ln("Enter String: ");
        var s = Scan.Line();
        Out.ln("Float: " + f + " Int: " + i + " String: " + s);
        Out.ln("Teting Scan methods with parameters");
        f = Scan.Float("Msg inside scan.Float(): ");
        i = Scan.Int("Msg inside scan.Int(): ");
        s = Scan.Line("Msg inside scan.Line(): ");
        Out.ln("Float: " + f + " Int: " + i + " String: " + s);
    }
}
