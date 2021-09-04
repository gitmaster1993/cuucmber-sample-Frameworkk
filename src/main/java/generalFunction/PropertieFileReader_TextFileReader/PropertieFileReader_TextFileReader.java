package generalFunction.PropertieFileReader_TextFileReader;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class PropertieFileReader_TextFileReader {

    public static HashMap<String,String> cusisAutomationPropertieValues=new HashMap<String,String>(); // storing all key value pair from propertie file
    public static Properties properties=new Properties(); //build in java utils function helps to get the value using key
    static String env1=System.getProperty("env");

    public static HashMap<String,String> readAndStorePropetieFileValues(String path) throws IOException{

        FileInputStream environmentApiFileReader=new FileInputStream(new File(System.getProperty("user.dir")+"\\"+path+""));
        properties.load(environmentApiFileReader); //load the properties file
        Enumeration<?> keyvalue=properties.keys();
        while(keyvalue.hasMoreElements()) {
            String key=(String) keyvalue.nextElement(); //store the key value current element
            String value=properties.getProperty(key);
            cusisAutomationPropertieValues.put(key, value);
        }
        return cusisAutomationPropertieValues;
    }

    public static String readingUniqueValueUsingKey(String path,String key) throws IOException {
        return readAndStorePropetieFileValues(path).get(key);

    }

    public static String readingValueFromCusisDataBaseAutomationProperties(String key) throws IOException {
        return readAndStorePropetieFileValues("DataBase.properties").get(key);
    }


    public static String readingValueFromCusisAPIAutomationProperties(String key) throws IOException {
        return readAndStorePropetieFileValues("Api.properties").get(key);
    }


    public static String readingValueFromCuteAutomationProperties(String key) throws IOException {
        return readAndStorePropetieFileValues("CuteApp.properties").get(key);
    }


    public static String readingValueFromOracleEnterpriceManagerApplicationProperties(String key) throws IOException {
        return readAndStorePropetieFileValues("OEMApp.properties").get(key);
    }


    public static String readingValueFromIKEATransportManagementProperties(String key) throws IOException {
        return readAndStorePropetieFileValues("ITMApp.properties").get(key);
    }

    public static String readingValueFromCucumberProperties(String key) throws IOException {
        return readAndStorePropetieFileValues("Cucumber.properties").get(key);
    }
    
    public static void writeValueToTxtFile(String location, String Content) throws IOException {
        FileWriter fw=new FileWriter(location);
        fw.write(Content);
        fw.close();
    }

    @SuppressWarnings("resource")
    public static String getTextValueFromTxtFile(String location) throws Exception {
        // 	.\src\main\resources\TestData\MyTemplate\MyTemplate.txt
        return new BufferedReader(new FileReader(location)).readLine();
    }

}
