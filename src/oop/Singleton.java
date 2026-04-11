package oop;


class databaseConnection{
	private static databaseConnection instance;
	
	private databaseConnection() {
		System.out.println("connection created");
	}
	
	public static databaseConnection getInstance() {
		if(instance == null) {
			instance = new databaseConnection();
		}
		return instance;
	}
	
	void connect() {
		System.out.println("connected to database");
	}
	public void disconnect() {
        System.out.println("Disconnected from database");
    }
}
public class Singleton {
	
	public static void main(String args[]) {
		
		databaseConnection db1 = databaseConnection.getInstance();
        databaseConnection db2 = databaseConnection.getInstance();
		
        
        db1.connect();
        db2.connect();
	
	    System.out.println("same object ? "+(db1 == db2));
	    db1.disconnect();
	}

}
