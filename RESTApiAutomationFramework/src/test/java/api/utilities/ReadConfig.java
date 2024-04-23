package api.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("F://RESTApiAutomationDemo//RESTApiAutomationFramework//src//test//resources//config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getDomainData() {
		String domainData = pro.getProperty("domain");
		return domainData;
	}

	public String getStudyData() {
		String studyData = pro.getProperty("study");
		return studyData;
	}

	public String getSeriesData() {
		String seriesData = pro.getProperty("series");
		return seriesData;
	}

	public String getItemData() {
		String itemData = pro.getProperty("item");
		return itemData;
	}
}
