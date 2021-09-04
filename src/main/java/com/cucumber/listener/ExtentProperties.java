/**
 * An enum which holds the properties to be set for extent reporter
 */

package com.cucumber.listener;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public enum ExtentProperties {
    INSTANCE;
    private String reportPath;
    private String extentXServerUrl;
    private String projectName;

//    ExtentProperties() {
//        this.reportPath = "output" + File.separator + "Run_" + System.currentTimeMillis() + File.separator
//                + "report.html";
//        this.projectName = "default";
//    }
    
    String timeStamp = new SimpleDateFormat("yyyy:MM:dd:HH:mm:ss").format(new Date());

    String userDir = System.getProperty("user.dir"); 

    ExtentProperties() {
        this.reportPath = "Automation_Reports" + File.separator +"AutomationReport"+ "_" + timeStamp.replace(":","_").replace(".","_")+".html";
//        this.reportPath = "CusisAutomation_Reports" + File.separator + "AutomationReport_" + timeStamp.replace(":","_").replace(".","_") + File.separator + "AutomationReport.html";
        this.projectName = "default";
    }

    /**
     * Gets the report path
     * @return The report path
     */
    public String getReportPath() {
        return reportPath;
    }

    /**
     * Sets the report path
     * @param reportPath The report path value
     */
    public void setReportPath(String reportPath) {
        this.reportPath = reportPath;
    }

    /**
     * Gets the ExtentX server URL
     * @return The ExtentX server URL
     */
    public String getExtentXServerUrl() {
        return extentXServerUrl;
    }

    /**
     * Sets the ExtentX server URL
     * @param extentXServerUrl The ExtentX server URL
     */
    public void setExtentXServerUrl(String extentXServerUrl) {
        this.extentXServerUrl = extentXServerUrl;
    }

    /**
     * Gets the project name
     * @return The project name
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Gets the project name
     * @param projectName The project name
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}


