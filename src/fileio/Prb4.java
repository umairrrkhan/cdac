package fileio;

import java.io.*;
import java.util.Scanner;

class Book implements Serializable{
	String bname , aname;
	double price;
	
	void get() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Book Name: "); bname = sc.nextLine();
        System.out.print("Author Name: "); aname = sc.nextLine();
        System.out.print("Price: "); price = sc.nextDouble(); sc.nextLine(); 
    }
	
	void display() {
		System.out.println(bname + " : " + aname+ " : "+ price);
	}
	
	void writeToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("library.dat"))) {
            out.writeObject(this);
            System.out.println("Data saved");
        } catch (IOException e) { System.out.println("Write failed: " + e.getMessage()); }
    }
	
	static Book readFromFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("library.dat"))) {
            return (Book) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Read failed (file empty/missing)");
            return null;
        }
    }
}

public class Prb4 {
	
	public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.println("1) Store data to file");
	            System.out.println("2) Read data from file");
	            System.out.println("3) Exit");
	            System.out.print("Choice: ");
	            int ch = sc.nextInt(); sc.nextLine(); 

	            if (ch == 1) {
	                Book b = new Book();
	                b.get();
	                b.writeToFile();
	            } else if (ch == 2) {
	                Book loaded = Book.readFromFile();
	                if (loaded != null) loaded.display();
	            } else if (ch == 3) {
	                System.out.println("Exited."); break;
	            } else {
	                System.out.println("Invalid choice.");
	            }
	        }
		
	}

}
