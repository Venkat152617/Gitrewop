package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reports {

public static void cucumberReport(String json) {
	File f= new File ("C:\\Users\\ELCOT\\workspace\\CucumberPrj\\target");
    Configuration con = new Configuration(f,"CucumberPrj");
    con.addClassifications("Sprint number", "7");
    con.addClassifications("Prj name", "Welecome to Sel Auto");
    con.addClassifications("Browser", "cross browser");
    con.addClassifications("Client", "Abc pvt ltd");
    con.addClassifications("Total no.of test case", "234");
    con.addClassifications("No.of test case passed", "234");
    con.addClassifications("Status", "Sprint is sucessful");
    
    List<String> l = new ArrayList<>();
    l.add(json);
    ReportBuilder r = new ReportBuilder(l,con);
    r.generateReports();
    
    
    }	
	
	
}
