package code9;

public class magic {
	
		 
	    public static void main(String[] args) { 
	        int number = 1000;  // Number to check
	        int sum = 0;
	        while (number > 0 || sum > 9) 
	        { 
	            if (number == 0) 
	            { 
	                number = sum; 
	                sum = 0; 
	            } 
	            sum += number % 10; 
	            number /= 10; 
	        } 
	 
	        // If sum = 1, it is magic number 
	        if(sum == 1) {
	            System.out.println("It is a magic number");
	        }else {
	            System.out.println("It is not a magic number");
	        }
	    }
	

//public class magic{
	 
   public static void main1(String[] args) { 
        int number = 10001;  // Number to check
        if(number % 9 == 1) {
            System.out.println("It is a magic number");
        }else {
            System.out.println("It is not a magic number");
        }
    }
}
