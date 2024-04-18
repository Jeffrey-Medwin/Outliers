package net.codejava;

import java.sql.*;

public class EncJDBC {
	private String URL = "jdbc:sqlserver://192.168.1.57;databasename=Training_JM";
	private String USER_NAME = "sa";
	private String PASSWORD = "Pointel14";
	private int id;
	private int numberOfLine;
	private String studentName;
	private Connection connect = null;
	private String query;
	
	//   constructor to establish the connection with the database
	public EncJDBC() {
		try {
			connect = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection done");
		} catch (Exception e) {
			e.printStackTrace();
		} 		
	}
	
	// method to set the roll number of the student
	public void setId(int id) {
		this.id = id;
	}

	// method to set the name of the student
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void closeConnection() {
		try {
			connect.close();
			System.out.println("Connection close");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//  method to Insert data onto table 
	public void insertIntoDB() {
		try {
			query = "INSERT INTO student VALUES (?, ?)";
			PreparedStatement preStmt = connect.prepareStatement(query);
			preStmt.setInt(1, id);
			preStmt.setString(2, studentName);
			numberOfLine =  preStmt.executeUpdate();
			System.out.println(numberOfLine + " line affected");
			preStmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// method to display the data from the table
	public void selectFromDB() {
		try {
			Statement smt = connect.createStatement();
			query = "Select * FROM student";
			ResultSet resultSet = smt.executeQuery(query);
			
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
			}
			resultSet.close();
			smt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// method to delete the record from the table
	public void deletFromDB() throws ClassNotFoundException {
		try {
			 query = "DELETE FROM student WHERE StudentName = ?"; // Replace "your_column_name" with the actual column for deletion
	         PreparedStatement deleteStmt = connect.prepareStatement(query);
	         deleteStmt.setString(1, studentName);
	         int rowsDeleted = deleteStmt.executeUpdate();

	         if (rowsDeleted > 0) {
	        	 System.out.println("Record deleted successfully!");
	         } else {
	             System.out.println("No record found with the specified value.");
	         }
		} catch (SQLException e) {
            System.out.println("Error: SQL Exception occurred.");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
			System.out.println("index out of bound");
		}
	}
}