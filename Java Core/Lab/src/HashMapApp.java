import java.util.HashMap;

public class HashMapApp
{
    public static void main(String[] args)
    {
        Out.ln("This app tests HashMap capabilities");
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        Out.ln(capitalCities);
        Out.ln(capitalCities.get("England"));
        Out.ln(capitalCities.keySet());
        Out.ln(capitalCities.values());
        for ( var item : capitalCities.keySet())
        {
            Out.ln(item + ": " + capitalCities.get(item));
        }
        Out.ln(capitalCities.size());
    }
}
