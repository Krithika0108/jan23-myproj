
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
		if(count==2)					//[C-2]//if(count==2)return true
			System.out.println("yes");	// else return false
		else							//	if (isPrime(num)=="true"){
			System.out.println("no");	//		System.out.println("Yes");}
									// else(isPrime(num)=="false"){
}									//system.out.println("No");}
}

/*//write a program to get prime from 1 to 100
 //public class FirstProgram{
	public static void main(String[]args){
	 for(int i=1;i<=100;i++) {
	 if(isPrime(i)==true){
	 System.out.println(i+" ");
	 }
   }
 }
}*/

/*findPrimeNos(100,500);
  }
  private static void findPrimeNos(int start,int end){
  int p=0;
  for(int i=start;i<=end;i++){
  int count=0;
  for(int k=1;k<=i;k++) {
  	if(i%k==0)
  	count++;
  	}
  	if(count==2){
  	system.out.println(i+" ");
  	p++;
  	if(p==8)//if(p%8==0){
  	system.out.println();
  	p=0;//when p%8==0 no need of this statement
  	}
 */

	 