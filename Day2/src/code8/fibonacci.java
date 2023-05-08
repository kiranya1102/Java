package code8;

public class fibonacci {
		  public static void main(String[] args) {

		    int n = 10,
		    firstTerm = 0, 
		    secondTerm = 1;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; ++i) {
		      
		    	System.out.print(firstTerm + ", ");

		      // compute the next term
		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		    }
		  }
		}
//Here, we have used the for loop to

//print the firstTerm of the series
//compute nextTerm by adding firstTerm and secondTerm
//assign value of secondTerm to firstTerm and nextTerm to secondTerm

