
public class FirstProgram {
	static boolean isPrime(int n) {
		int count=0;
		for (int i=1;i<=n;i++) {
			if(n%i==0)
				count++;
		
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13,count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		if(count==2)			
			System.out.println("yes");	
		else							
		System.out.println("no");	
									
	}									
}



	 