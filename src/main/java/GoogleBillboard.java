public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		    int n = 2;
  double num = 0;
  String numString = new String("");
  
  // System.out.println("Problem 1:");
  while (!isPrime(num)) {
    numString = e.substring(n,n+10);
    num = Double.parseDouble(numString);
    n++;
  }
  System.out.println(num);
  
  num = 0;
  n = 2;
  int x = 0;
  /*
  System.out.println("Problem 2:");
  while (x < 5) {
    numString = e.substring(n,n+10);
    num = Double.parseDouble(numString);
    n++;
    if (sums49(numString)) x++;
  }
  System.out.println(numString);
*/
	}

	//Finish this function
	public static boolean isPrime(double input){
		if (input < 2) return false;
		for (int i = 2; i <= Math.sqrt(input); i++) if (input % i == 0) return false;
		return true;
	}
	/*
	public static boolean sums49(String input){
		double sum = 0;
		for(int i = 0; i < input.length(); i++) sum += Double.parseDouble(input.substring(i,i+1));
		return sum == 49;
	} */
}	
