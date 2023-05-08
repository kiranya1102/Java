package code12;

public class anonymous {
	// Java program to illustrate the
	// concept of anonymous array
	 
	
	    public static void main(String[] args)
	    {
	          // anonymous array
	          sum(new int[]{ 1, 2, 3 });
	    }
	   
	    public static void sum(int[] a)
	    {
	        int total = 0;
	 
	        // using for-each loop
	        for (int i : a)
	            total = total + i;
	         
	        System.out.println("The sum is: " + total);
	    }
	}

