// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

		int num = Integer.parseInt(args[0]);

		double count = 1 ;
	    double piSum = (double) 1;
		System.out.println(piSum);
		boolean checkSign = false;

		for(int i = 1 ; i < num ; i++){
			count+=2;
			if(checkSign==true){
			piSum = piSum + (1/count);
			}
			else{
				piSum = piSum - (1/count);
				}

				checkSign = !checkSign;
				
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + 4 * piSum);

	}
}
