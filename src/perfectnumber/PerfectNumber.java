package perfectnumber;



import java.util.*;


public class PerfectNumber {
	
	public static int method1(int Number ) {
	  int Sum = 0;
		for(int i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}	
		}			
		return Sum;
	}
		public static int method2(int Sum,int Number) {
			if (Sum == Number) {
				System.out.println(Number + " is a Perfect Number");
			}
			else if (Sum < Number) {
				System.out.println(Number +" is deficient Number");
			}
			else if (Sum > Number) {
				System.out.println(Number +" is abundant Number");
			}
			  return 0;
		}
				

    public static void main(String[] args) {
        System.out.println("Elvis Strauts 2.g 171rdb062");
        System.out.print("Enter A Number: ");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt(); 

        method2(method1(Number),Number);
        
     
	}

 
}