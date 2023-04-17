import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static String readRawDataToString() throws Exception{
        ClassLoader classLoader = Main.class.getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }


    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        GroceryList groceryList = new GroceryList();
        List<String> groceries = new ArrayList<>();
        groceries = JerksonParser.getJerksonStrings(output);
        for(String s : groceries){
            groceryList.put(JerksonParser.createObjectFromString(s));
        }
        System.out.println(groceryList);
        groceryList.sortbyName();
        groceryList.getGroceryList();


    }
}



       // List<String> lines = Files.readAllLines(Paths.get("grocery_list.txt"));
    //    List<String> lines = Files.readAllLines(Paths.get("/path/to/grocery_list.txt"));

        // Define the regular expression pattern for each item
       // Pattern = Pattern.compile("naMe:(\\w+);\\s*price:([\\d.]+);\\s*type:(\\w+);\\s*expiration:(\\d{1,2}/\\d{1,2}/\\d{4})");


//        List<String> lines = Files.readAllLines(Paths.get("grocery_list.txt"));
        // Define the regular expression pattern for each item
     //   Pattern = Pattern.compile("([a-zA-Z]+):([^;!@%^*]+)");
       // Matcher m = pattern.matcher(output);
        //System.out.println(m.group(1));
//        System.out.printf(String.valueOf(output.("([Nn][Aa][Mm][Ee]):([Cc][0Oo]+[Kk][iI][eE3][sSs]);([Pp][rR][iI][cC][Ee3]):([0-9].[0-9]+)")));

      // String.format("");
     //   Pattern p = Pattern.compile("([a-zA-Z]+):([^;!@%^*]+)");
       //System.out.printf(String.valueOf(pattern));




//([Nn][Aa][Mm][Ee]):([Cc][0Oo]+[Kk][iI][eE3][sSs]);([Pp][rR][iI][cC][Ee3]):([0-9].[0-9]+)


