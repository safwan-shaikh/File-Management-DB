package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DBload {
	public static Connection connect(String url) {
		Connection conn = null;  
        try {  
            						  
            conn = DriverManager.getConnection(url);  
              
            System.out.println("Connection to SQLite has been established.");  
            
            String createTable = "CREATE TABLE IF NOT EXISTS dob (sr_no INTEGER, date VARCHAR(10),PRIMARY KEY(\"sr_no\" AUTOINCREMENT));";
            Statement statement = conn.createStatement();
            statement.execute(createTable);
            System.out.println("Table Created successfully");

            
            
            
        }
        catch (SQLException e) {
			
            System.out.println(e.getMessage());  
		}
      
		return conn;  
    
        
	}
	
	 public static void insert(String url,List<String> date) {
	       

	        try  {
	        	String u = url;
	        	//"jdbc:sqlite:/home/safi/eclipse-workspace/FileManagementDB/src/laptopsdb.sqlite"
	        	Connection conn = connect(u);
	        	Statement s=conn.createStatement();
	 
	        	
	        	for(int i=0;i<date.size();i++) 
	        	{
	        		String string="insert into dob (date) values ('"+date.get(i)+"');";
	        		s.execute(string);
	           
	           }
	        	
	        	
	        
	        	
	        	} catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
