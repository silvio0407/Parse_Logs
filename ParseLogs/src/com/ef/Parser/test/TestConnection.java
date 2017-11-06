package com.ef.Parser.test;

import com.ef.Parser.database.DatabaseConnection;

public class TestConnection {

	public static void main(String[] args) {

		DatabaseConnection conn = DatabaseConnection.getInstance();
		
		conn.getConnection();
	}

}
