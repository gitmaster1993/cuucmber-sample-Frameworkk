package generalFunction.CommonFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CommonFunctions {

    Select select;

    public static void function_DropdownValueSelectByText(WebElement ele, String text) {
        new Select(ele).selectByVisibleText(text);

    }

    public static void function_DropdownValueSelectByIndex(WebElement ele, int index) {
        new Select(ele).selectByIndex(index);

    }

    public static void function_DropdownValueSelectByValue(WebElement ele, String value) {
        new Select(ele).selectByValue(value);

    }

    public static String function_getText(WebElement ele) {
        return ele.getText();
    }

    // Assert Contains
    public static boolean function_AssertContains(String actual, String expected) throws InterruptedException {
        Thread.sleep(2000);
        boolean val = false;
        if (actual.contains(expected)) {
            return val = true;
        }
        return val;
    }

    // get sysdate
    public static String function_getSystemDateAndUpdatedDayHoursWRToServerTiming() {
        List<String> listDate= Arrays.asList(new SimpleDateFormat("yyyy:MM:dd:HH:mm:ss").format(new Date()).split(":"));
        int updatedDate=Integer.parseInt(listDate.get(2));
        //sub 2 hours
        int updatedhours=Integer.parseInt(listDate.get(3))-2;
        if(24<updatedhours) {
            updatedhours=updatedhours-24;
        }
        //adding 2 min
        int updatedmin=Integer.parseInt(listDate.get(4))+2;
        if(60<updatedmin) {
            updatedmin=updatedmin-60;
            updatedhours=updatedhours+1;
        }
        return ""+listDate.get(0)+"-"+listDate.get(1)+"-"+updatedDate+" "+updatedhours+":"+updatedmin+":"+listDate.get(5)+"";
    }
//    public static void main(String[]args) {
//        System.out.println(function_getSysDate());
//    }

    public static String splitAndReturnSpecificIndex(String shipmentId,int index) {
        return Arrays.asList(shipmentId.split("-")).get(index);
    }

    public static String function_getSysDate() {
        return new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
    }
}
