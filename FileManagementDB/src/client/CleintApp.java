package client;

import java.util.List;

import utilities.DBload;
import utilities.DataLoadUtility; 

public class CleintApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//List<Date> dates = DataLoadUtility.dataload("./input.txt");
		
		List<String> dates = DataLoadUtility.dataload("./input.txt");
		//CreateFile.create(dates, "output");
		
		
		DBload.insert("jdbc:sqlite:/home/safi/eclipse-workspace/FileManagementDB/src/laptopsdb.sqlite",dates);
		
		  }
	}


