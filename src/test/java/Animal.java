import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Animal {

    //hello
    JSONParser jsonParser = new JSONParser();


    @DataProvider(name = "AnimalDataProvider")
    public Object[][] getData() throws FileNotFoundException {
        try {
            Object obj = jsonParser.parse(new FileReader("src/test/java/data.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray list = (JSONArray) jsonObject.get("listAccount");
            Object[][] data = new Object[list.size()][3];
            for(int i=0;i < list.size();i++){
                String res = ((JSONObject) list.get(i)).toString();
                res = res.substring(1,res.length()-1).replace("\"","");
                Object[] list_param = res.split(",");
                for(int j=0;j< list_param.length;j++){
                    data[i][j] = list_param[j].toString().split(":")[1];
                }
            }

            return data;
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }

}
