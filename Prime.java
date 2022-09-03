package week1.day1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 17;
		int count=0;
		for(int i=2;i<=num-1;i++) {
			if (num%i==0)
			count ++;
		}
		if (count==0)
			System.out.println("This is a prime number");
		else
			System.out.println("This is not a prime number");
		
    }

}
