package fileio;

import java.io.*;
import java.util.Scanner;

import java.util.Scanner;

class Employee implements Serializable{
	int empno;
	String name , address;
	
	void input() {
		Scanner io = new Scanner(System.in);
		System.out.println("empno");
		empno = io.nextInt();
		io.nextLine();
		System.out.println("enter the name"); name = io.next() ; 
		io.nextLine();
		System.out.println("address"); address = io.next();
		io.nextLine();
	}
	
	void display() {
		System.out.println(empno + " "+ name + " : "+ address);
	}
}

public class Prb3 {

	public static void main(String [] args) {
		
		Employee emp = new Employee();
        emp.input();
        // yaha write ho rha hai 
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Employee.dat"))) {
            out.writeObject(emp);
        }catch (IOException e) { System.out.println("Write failed: " + e); }

        //  Read object & display
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Employee.dat"))) {
            Employee loaded = (Employee) in.readObject();
            loaded.display();
            
        }catch (IOException | ClassNotFoundException e) { System.out.println("Read failed: " + e); }
		
	}
	
}
