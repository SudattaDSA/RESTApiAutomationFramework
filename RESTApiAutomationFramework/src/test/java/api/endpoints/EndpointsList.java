package api.endpoints;

import api.utilities.ReadConfig;

public class EndpointsList {
	static ReadConfig readConfig = new ReadConfig();
	public static String base_url = "http://localhost:80/Rest";
	public static String domainData = readConfig.getDomainData();
	public static String studyData = readConfig.getStudyData();
	public static String seriesData = readConfig.getSeriesData();
	public static String itemsData = readConfig.getItemData();

	//public static String URL1 = base_url + "/domains/" + domainData + "/studies/" + studyData + "/series/" + seriesData
		//	+ "/" + itemsData;
	public static String URL1 = "https://google.com";
	public static String URL2 = "https://stackoverflow.com";
}
