package generalFunction.ExcelReader;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

public class ExcelReader{

    public static HashMap<String,String> dataRow;
    public static HashMap<String,String> data;

    public static HashMap<String, String> excelReader(String fileLocation,String sheetName,String rowName) throws Exception {
        data = new HashMap<String,String>();

        Workbook wb = WorkbookFactory.create(new FileInputStream(new File(fileLocation)));
        Sheet sheetname = wb.getSheet(sheetName);

        Row row1 = sheetname.getRow(0);
        int colcount = row1.getLastCellNum();
        int rowcount = sheetname.getLastRowNum();

        for(int r=1;r<=rowcount;r++) {
            String testname = sheetname.getRow(r).getCell(0).getStringCellValue();
            if(testname.equals(rowName)) {

                for(int c=0;c<colcount;c++) {

                    data.put(sheetname.getRow(0).getCell(c).getStringCellValue(),sheetname.getRow(r).getCell(c).getStringCellValue());
                }
                break;
            }
        }
        return data;
    }

    public static String getvalue(String fileLocation,String sheetName,String rowName,String key) throws Exception {
        return excelReader(fileLocation,sheetName,rowName).get(key);
    }

//    public static void main(String[]args) throws Exception {
//        String record= ExcelReader.getvalue("src/main/resources/TestData/TestData.Demo/TestData.Demo.xlsx","CnToIN","CTE9",
//                "DataRow");
//        /*Excel value read*/
//        System.out.println(record);
//    }


    // Executing select query for excel file 
    public static Recordset gettingRecordSetBasedOnExecutionSelectQuery(String filePath,String selectQuery,String Key) throws FilloException {
    	Connection con=(new Fillo()).getConnection(filePath);
    	return con.executeQuery(selectQuery);
    	
    }
    
    
 // Executing update query for excel file 
    public static String gettingRecordSetBasedOnExecutionUpdateQuery(String filePath,String updateQuery,String selectQuery,String key) throws FilloException {	
    	Connection con=(new Fillo()).getConnection(filePath);
    	 con.executeUpdate(updateQuery); //update value related query should be given here.
    	 Recordset recordset= con.executeQuery(selectQuery); // should only give select query to get result values
    	 return recordset.getField(key);
    }
 

    // Executing insert query for excel file. use insert query as optional basically where condition giving error 
    public static String gettingRecordSetBasedOnExecutionInsertQuery(String filePath,String updateQuery,String selectQuery,String key) throws FilloException {
    	
     Connection con=(new Fillo()).getConnection(filePath);
   	 con.executeUpdate(updateQuery); //update value related query should be given here.
   	Recordset recordset= con.executeQuery(selectQuery); // should only give select query to get result values
	 return recordset.getField(key);
    }


}
