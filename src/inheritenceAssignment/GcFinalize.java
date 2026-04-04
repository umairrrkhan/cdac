package inheritenceAssignment;


class Testinggc{
	int id;
	
	Testinggc(int id ){ this.id = id ;}
	
	protected void finalize() throws Throwable {
        System.out.println("Finalizing object " + id);
        super.finalize();
    }
}

public class GcFinalize {
	
	String name ;
	int number;
	
	GcFinalize(String name , int number){
		this.name = name;
		this.number  = number;
	}
	
	void show() {
		System.out.println(this.name + " + " + this.number);
	}



public static void main(String args[]) throws InterruptedException {
    GcFinalize g = new GcFinalize("umair " , 123);
    
    g.show();
    
    Testinggc t = new Testinggc(1);
    Testinggc y = new Testinggc(2);
    
    t = null; // this is gc bcz this is not pointing on someone so this is the gc here okay 
    y = null; // and this too 
    
    System.gc(); // its also not give u gurantee 
    
    Thread.sleep(2000);
    
    System.out.println("end the main");
}

}
