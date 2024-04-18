package net.codejava;

import java.sql.SQLException;
import java.util.Scanner;

@SuppressWarnings("unused")
public class JavaJDBC {

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner scanner = new Scanner(System.in);
		int id;
		String studentName;
		int choice;
		
		
		
		EncJDBC encJDBC = new EncJDBC();
		do {
			System.out.print("\n1) Insert\n2) Display\n3)Delete\nEnter your choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.print("Enter Student Id: ");
				id = scanner.nextInt();
					
				System.out.print("Enter student name: ");
				studentName = scanner.next();
					
				encJDBC.setId(id);
				encJDBC.setStudentName(studentName);
				encJDBC.insertIntoDB();
				break;
			}	
			case 2: {
				encJDBC.selectFromDB();
				break;
			}
			case 3: {				
				System.out.print("Enter student name: ");
				studentName = scanner.next();
				encJDBC.setStudentName(studentName);
				encJDBC.deletFromDB();
				break;
			}	
			case 4: {
				encJDBC.closeConnection();
				break;
			}
			default:
				System.out.println("Enter the specified choice");
				break;
			}
		} while (choice != 4);
		scanner.close();
	}
}
