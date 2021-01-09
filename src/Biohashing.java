import java.util.Scanner;

class math_concepts{
	
	private int size;
	private int primes[];
	private int max=1000001;
	
	void sieve_of_eratosthenes() {
		int count=0,c=0;
		int flag[]=new int[max];
		
		for(int i=2;i<max;i++)
			if(flag[i]==0){
				for(int j=i+i;j<=max;j=j+i)
					flag[j]=1;	
			}
		
		for(int k=2;k<max;k++)
			if(flag[k]==0)
				++count;
		
		primes=new int[count];
		size=count;
		
		for(int l=2;l<max;l++)
			if(flag[l]==0) {
				primes[c]=l;
				++c;
			}	
	}
	
	int[] primes_array(){
		return primes;
	}
	
	int primes_size(){
		return size;
	}
}

public class Biohashing {
	public static void main(String args[]) {
		Scanner scan1=new Scanner(System.in);
		int rows=0,columns=0;
		int count1;
		int prime[];
		
		try {
			System.out.print("Enter Number Of Rows : ");
			rows=Integer.parseInt(scan1.next());
			System.out.print("\nEnter Number Of Columns : ");
			columns=Integer.parseInt(scan1.next());
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid input.");
			System.exit(0);
		}
		
		scan1.close();
		
		math_concepts mc_1=new math_concepts();
		mc_1.sieve_of_eratosthenes();
		
		count1=mc_1.primes_size();
		prime=new int[count1];
		
		prime=mc_1.primes_array();
		
		for(int i=0;i<count1;i++)
			System.out.print(prime[i]+" ");
	}
}
