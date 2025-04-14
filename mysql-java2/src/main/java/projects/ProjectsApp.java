package projects;

import projects.exception.DbException;

import java.sql.Connection;

import projects.dao.DbConnection;
/**
*
*@author Promineo
*/

public class ProjectsApp {
/**
*@param args
*/
	
public static void main(String[] args) {
	   
    try {
               Connection conn = DbConnection.getConnection();
        
       
        System.out.println("Connection established successfully in ProjectsApp.");
        
     
        if (conn != null) {
            conn.close();
        }
    } catch (DbException e) {
      
        System.out.println("Error: " + e.getMessage());
    } catch (Exception e) {
       
        System.out.println("An unexpected error occurred: " + e.getMessage());
    }
}

	
	
	
}
