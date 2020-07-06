package jpay.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class TestData
{


    private String browser;

    private String username;

    private String pincode;

    private String password;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }
    
    
    public String getUserName ()
    {
        return username;
    }

    public void setUserName (String username) {
        this.username = username;
    }

    public String getPinCode () {
        return pincode;
    }

    public void setPinCode (String pincode) {
        this.pincode = pincode;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "TestData [Username = "+username+", PinCode = "+pincode+", Password = "+password+", Browser = " + browser+ "]";
    }
    
    
    @DataProvider(name="testData")
    public Object[][] getData() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("C:/Users/niperez/intellij-workspace/automation/DataSource/FacilityLoginJSON.json"));
        JsonElement dataSet = jsonData.getAsJsonObject().get("TestData");
        List<TestData> testData = new Gson().fromJson(dataSet, new TypeToken<List<TestData>>() {
        }.getType());
        Object[][] returnValue = new Object[testData.size()][1];
        int index = 0;
        for (Object[] each : returnValue) {
            each[0] = testData.get(index++);
        }
        return returnValue;
    }


}