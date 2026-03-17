package datasa;

public class Armstrongall {
    
    public static void main(String[] args) {
        

        int number = 153;
        int count = countDigits(number);
        System.out.println("Digits in " + number + ": " + count);
        
        int armstrongSum = calculateArmstrongSum(number, count);
        System.out.println("Armstrong sum: " + armstrongSum);
        
        boolean isArm = isArmstrong(number);
        System.out.println(number + " is Armstrong: " + isArm);
       
        
        int start = 1;
        int end = 10000;
        findArmstrongInRange(start, end);
    }
    
    

    public static int countDigits(int n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    
    
    public static int calculateArmstrongSum(int n, int power) {
        int sum = 0;
        int original = n;  // Keep original for while loop
        
        while (n > 0) {
            int lastDigit = n % 10;
            sum += (int) Math.pow(lastDigit, power);
            n = n / 10;
        }
        
        return sum;
    }
    
    
    public static boolean isArmstrong(int n) {
        int count = countDigits(n);
        int sum = calculateArmstrongSum(n, count);
        return sum == n;
    }
    
    
    public static void findArmstrongInRange(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println("  ⭐ " + i);
            }
        }
    }
    
}