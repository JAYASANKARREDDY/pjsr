package com.abc.app;
import java.sql.*;
public class JDBC3INSERT {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","jaya","jaya");
		Statement st=con.createStatement();
		st.executeUpdate("insert into room values(2,'jayasankar',5000)");
		System.out.println("row is inserted");
		con.close();

	}

}
