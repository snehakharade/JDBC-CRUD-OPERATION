package com.jsp.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AllDeatails {


		public static void main(String[] args) {
			String url = "jdbc:mysql://localhost:3306/jspider";
			String username = "root";
			String password = "root";
			String sql = "SELECT * FROM student";

			try {
				// load register the driver
				Class.forName("com.mysql.cj.jdbc.Driver");

				try {
					Connection connection = DriverManager.getConnection(url, username, password);

					Statement statement = connection.createStatement();
					ResultSet resultset = statement.executeQuery(sql);

					while (resultset.next()) {
						System.out.println(resultset.getInt(1));
						System.out.println(resultset.getString(2));
						System.out.println(resultset.getString(3));
					}
					connection.close();
					System.out.println("all good");

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
				
			
		}

	}

		

	


