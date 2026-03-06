package day1;

public class tutorial {
	
	static String randomname = "home to the hole";
	static final double UI = 3.143;

	
	public static void main(String [] args) {
		System.out.println(randomname);
		System.out.println(UI);
		
		int IntegerOne = 12;
		
		byte BigByte = 127;
		
		int IntegerTwo 
		= 
		IntegerOne 
		+ 1;
		
		System.out.println(IntegerTwo);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		
		char randomChar = 66;
	    char anotherChar = 'A';
	    char escapedChar = '\\';
	    
	    System.out.println(randomChar);
	    System.out.println(anotherChar);
	    System.out.println(escapedChar);
	    
	    String firstString = "hello";
	    String holy = "cross";
	    
	    String CombineString = firstString + ' ' + holy;
	    
	    System.out.println(CombineString);
	    
	    String ConvertString = Byte.toString(BigByte); // work only for the premptive data type okay right 
	    String Conver2 = Integer.toString(IntegerOne); 
	    
	    System.out.println(ConvertString);
	    System.out.println(Conver2);
	    
	    double aDouble = 3.12312341231231;
	    
	    int home = (int) aDouble;
	    
	    System.out.println(home);
	    
	    int ho = 34;
	    String yu = "uio";
	    		
	    String io = Integer.toString(ho);
	    
	    int stringToint = Integer.parseInt(io);
	    
	    System.out.println(stringToint);
	    
	}
}
