package jpay.utilities;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class StagingData {


    private String lookCellPhone;

    private String lookPhoneNumber;

    private String lookState;

    private String lookPaymentRefNum;

    private String halfAccount;

    private String lookEmailAddress;

    private String lookBatchName;

    private String lookLastName;

    private String senderFirstName;

    private String lookCity;

    private String lookZipCode;

    private String inmateFirstName;

    private String lookAccountNumber;

    private String lookFullname;

    private String password;

    private String inmateID;

    private String lookBatchID;

    private String lookFirstName;

    private String inmateLastName;

    private String senderLastName;

    private String username;

    private String lookTransferID;

    public String getLookCellPhone ()
    {
        return lookCellPhone;
    }

    public void setLookCellPhone (String lookCellPhone)
    {
        this.lookCellPhone = lookCellPhone;
    }

    public String getLookPhoneNumber ()
    {
        return lookPhoneNumber;
    }

    public void setLookPhoneNumber (String lookPhoneNumber)
    {
        this.lookPhoneNumber = lookPhoneNumber;
    }

    public String getLookState ()
    {
        return lookState;
    }

    public void setLookState (String lookState)
    {
        this.lookState = lookState;
    }

    public String getLookPaymentRefNum ()
    {
        return lookPaymentRefNum;
    }

    public void setLookPaymentRefNum (String lookPaymentRefNum)
    {
        this.lookPaymentRefNum = lookPaymentRefNum;
    }

    public String getHalfAccount ()
    {
        return halfAccount;
    }

    public void setHalfAccount (String halfAccount)
    {
        this.halfAccount = halfAccount;
    }

    public String getLookEmailAddress ()
    {
        return lookEmailAddress;
    }

    public void setLookEmailAddress (String lookEmailAddress)
    {
        this.lookEmailAddress = lookEmailAddress;
    }

    public String getLookBatchName ()
    {
        return lookBatchName;
    }

    public void setLookBatchName (String lookBatchName)
    {
        this.lookBatchName = lookBatchName;
    }

    public String getLookLastName ()
    {
        return lookLastName;
    }

    public void setLookLastName (String lookLastName)
    {
        this.lookLastName = lookLastName;
    }

    public String getSenderFirstName ()
    {
        return senderFirstName;
    }

    public void setSenderFirstName (String senderFirstName)
    {
        this.senderFirstName = senderFirstName;
    }

    public String getLookCity ()
    {
        return lookCity;
    }

    public void setLookCity (String lookCity)
    {
        this.lookCity = lookCity;
    }

    public String getLookZipCode ()
    {
        return lookZipCode;
    }

    public void setLookZipCode (String lookZipCode)
    {
        this.lookZipCode = lookZipCode;
    }

    public String getInmateFirstName ()
    {
        return inmateFirstName;
    }

    public void setInmateFirstName (String inmateFirstName)
    {
        this.inmateFirstName = inmateFirstName;
    }

    public String getLookAccountNumber ()
    {
        return lookAccountNumber;
    }

    public void setLookAccountNumber (String lookAccountNumber)
    {
        this.lookAccountNumber = lookAccountNumber;
    }

    public String getLookFullname ()
    {
        return lookFullname;
    }

    public void setLookFullname (String lookFullname)
    {
        this.lookFullname = lookFullname;
    }

    public String getPassword ()
    {
        return password;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }

    public String getInmateID ()
    {
        return inmateID;
    }

    public void setInmateID (String inmateID)
    {
        this.inmateID = inmateID;
    }

    public String getLookBatchID ()
    {
        return lookBatchID;
    }

    public void setLookBatchID (String lookBatchID)
    {
        this.lookBatchID = lookBatchID;
    }

    public String getLookFirstName ()
    {
        return lookFirstName;
    }

    public void setLookFirstName (String lookFirstName)
    {
        this.lookFirstName = lookFirstName;
    }

    public String getInmateLastName ()
    {
        return inmateLastName;
    }

    public void setInmateLastName (String inmateLastName)
    {
        this.inmateLastName = inmateLastName;
    }

    public String getSenderLastName ()
    {
        return senderLastName;
    }

    public void setSenderLastName (String senderLastName)
    {
        this.senderLastName = senderLastName;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getLookTransferID ()
    {
        return lookTransferID;
    }

    public void setLookTransferID (String lookTransferID)
    {
        this.lookTransferID = lookTransferID;
    }

    @Override
    public String toString()
    {
        return "StagingData [lookCellPhone = "+lookCellPhone+", lookPhoneNumber = "+lookPhoneNumber+", lookState = "+lookState+", lookPaymentRefNum = "+lookPaymentRefNum+", halfAccount = "+halfAccount+", lookEmailAddress = "+lookEmailAddress+", lookBatchName = "+lookBatchName+", lookLastName = "+lookLastName+", senderFirstName = "+senderFirstName+", lookCity = "+lookCity+", lookZipCode = "+lookZipCode+", inmateFirstName = "+inmateFirstName+", lookAccountNumber = "+lookAccountNumber+", lookFullname = "+lookFullname+", password = "+password+", inmateID = "+inmateID+", lookBatchID = "+lookBatchID+", lookFirstName = "+lookFirstName+", inmateLastName = "+inmateLastName+", senderLastName = "+senderLastName+", username = "+username+", lookTransferID = "+lookTransferID+"]";
    }


    @DataProvider(name="StagingData")
    public Object[][] getStagingData() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("C:/Users/niperez/intellij-workspace/automation/DataSource/StagingData.json"));
        JsonElement dataSet = jsonData.getAsJsonObject().get("StagingData");
        List<StagingData> testData = new Gson().fromJson(dataSet, new TypeToken<List<StagingData>>() {
        }.getType());
        Object[][] returnValue = new Object[testData.size()][1];
        int index = 0;
        for (Object[] each : returnValue) {
            each[0] = testData.get(index++);
        }
        return returnValue;
    }


}