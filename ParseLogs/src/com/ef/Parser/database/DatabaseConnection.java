package com.ef.Parser.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	 private static Connection connection;
	    
//	    private static String dsn = "jdbc:mysql://localhost:3306/agendaapp";
	   // private static String username = "root";
	   // private static String password = "root";
	 
	 	private static String jdbcUrl = "jdbc:postgresql://localhost:5432/hibernate";
	 	private static String user = "postgres";
	 	private static String pass = "postgres";
	 	private static String driver = "org.postgresql.Driver";
	 	
	 	private static DatabaseConnection instance;

	 	private DatabaseConnection(){
	 		try {
            	Class.forName(driver);
            }catch(Exception ex){
            	ex.getMessage();
            }
	 		 try {
	                connection = DriverManager.getConnection(jdbcUrl, user, pass);
	            } catch (SQLException ex) {
	                System.out.println("Houve um erro ao conectar com o Banco de Dados.");
	            } 
	 		
	 	}
	 	
	    public static DatabaseConnection getInstance() {
	        if (instance == null) {
	        	instance = new DatabaseConnection();
	        }
	        return instance;
	    }
	    
	    public Connection getConnection(){
	    	return connection;
	    }
}