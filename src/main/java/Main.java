class Main {
  public static int exe21(String a, int i) {
		if(i==a.length())
			return 0;
		if(Character.isUpperCase(a.charAt(i)))
			return exe21(a,i+1);
		return 1+exe21(a,i+1);
		
	}
	public static String exe22(String a,int i) {
		if(i==a.length())
			return "";
		if((i+1)%3==0)
			return a.charAt(i)+"*"+exe22(a,i+1);
		return a.charAt(i)+exe22(a,i+1);
	}
	public static String exe23(String a, int i) {
		if(i==a.length())
			return "";
		return a.charAt(a.length()-i-1)+exe23(a,i+1);
	}
	public static void exe24(char start, char end) {
		if(start>end)
			return;
		System.out.println(start);
		exe24((char)(start+1),end);
	}
	public static void exe25(int n,int p) {
		if(p==0)
			return;
		if(n%p==0)
			System.out.println(p);
		exe25(n,p-1);
	}
	public static void exe26(int num) {
		if(num/10==0)
			return;
		if((num%10)%2==0)
			System.out.println((num%10));
		exe26(num/10);
	}
	public static void exe27(int i, int j) {
		if(i==11)
			return;
		System.out.println(i*j);
		if(j==10) {
			j=0;
			i+=1;
		}
		exe27(i,j+1);
			
	}
	public static void exe28(int a1, int d,int n) {
		if(n==0)
			return;
		System.out.println(a1);
		exe28(a1+d,d,n-1);
	}
	public static void exe29(int a, int n,int d) {
		if(n==1) {
			System.out.println(a);
			}
		else {
		System.out.println(a);
		exe29(a+d,n-1,d+1);
		}
	}
	public static void exe30(int a, int n,int i) {
		if(n==0)
			return;
		System.out.println(a);
		if(i%2==0) {
			exe30(a-1,n-1,i+1);
		}
		else
			exe30(a+2,n-1,i+1);
	}
	public static void exe31(int[] a, int i) {
		if(i==a.length)
			return;
		if(i%2==0)
			System.out.println(a[i]);
		exe31(a,i+1);
	}
	public static void exe32(int[] a,int i) {
		if(i==a.length-1)
			return;
		if(a[i]<a[i+1])
			System.out.println(a[i]);
		exe32(a,i+1);
	}
	public static int ezer(int n) {
		if(n/10==0)
			return n;
		return n%10+ezer(n/10);
	}
	public static int exe42(int n) {
		int a = ezer(n);
		if(a<10) {
			return a;
		}
		else {
			return exe42(a);
		}
	}
	public static boolean issort(int n) {
		if (n / 10 == 0) {
	        return true;
	    }

	    int lastDigit = n % 10;
	    int secondLastDigit = (n / 10) % 10;

	   	    if (lastDigit < secondLastDigit) {
	        return false;
	    }
	   	    
	   	return issort(n/10);
	}
	public static int count(int[] arr, int num, int i) {
	    if (i == arr.length) {
	        return 0;
	    }

	  
	    if (arr[i] == num) {
	        return 1 + count(arr, num, i + 1);
	    } else {
	        return count(arr, num, i + 1);
	    }
	}
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
