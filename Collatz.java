// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int count = 0 ;
		int sum = 1;
		
		if(mode.equals("v"))
		{

		for(int i = 1 ; i <= N ; i++){
			sum = i;
			count = 0;
			if(i==1){
				System.out.print(sum + " ");
				while (count<3) 
				{
					if(sum%2==0){
						sum=sum/2;
					}
					else{
						sum = (sum*3)+1;
					}
					count++;
					System.out.print(sum + " ");
					
				}
				count++;
			}
			else{
				while(sum!=1){
				System.out.print(sum + " ");

				if(sum%2==0){
					sum=sum/2;
				}
				else{
					sum = (sum*3)+1;
				}
				count++;

				if(sum==1){
					System.out.print(sum + " ");
					count++;

				}
				
			}
		}
		System.out.print("(" + count + ")");
		System.out.println();

		}
	}

		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");


	    
	}
}
