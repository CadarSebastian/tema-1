import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exercitiu1();
		// exercitiu2();
		// exercitiu3();
		// exercitiu4();
		// exercitiu5();
		// exercitiu6();
		// exercitiu7();
		// exercitiu8();
		// exercitiu9();
		// exercitiu10();
		// exercitiu11();
		// exercitiu12();
		// exercitiu13();
		// exercitiu14();
		// exercitiu15();
		// exercitiu16();
		// exercitiu17();
		// exercitiu18();
		// exercitiu19();
		// exercitiu20();

	}

	public static void exercitiu1() {
		Scanner input = new Scanner(System.in);
		int nr = input.nextInt();
		if (nr >= 5 && nr <= 10) {
			System.out.println("admis");
		} else if (nr <= 4 && nr > 0) {
			System.out.println("Respins");
		} else {
			System.out.println("Invalid");
		}
	}

	public static void exercitiu2() {
		Scanner input = new Scanner(System.in);
		int nr = input.nextInt();
		switch (nr) {
		case 1:
			System.out.println("UNU");
			break;
		case 2:
			System.out.println("DOI");
			break;
		case 3:
			System.out.println("TREI");
			break;
		case 4:
			System.out.println("PATRU");
			break;
		case 5:
			System.out.println("CINCI");
			break;
		default:
			System.out.println("INVALID");
			break;
		}

	}

	public static void exercitiu3() {
		Scanner input = new Scanner(System.in);
		int nr1 = input.nextInt();
		int nr2 = input.nextInt();
		if (nr1 % 2 == 0 && nr2 % 2 == 0) {
			System.out.println((nr1 + nr2) / 2);
		}
		if (nr1 % 2 != 0 && nr2 % 2 != 0) {
			System.out.println(nr1 * nr2);
		}
		if (nr1 % 2 == 0 && nr2 % 2 != 0 || nr1 % 2 != 0 && nr2 % 2 == 0) {
			System.out.println(nr1 + nr2);
		}
	}

	public static void exercitiu4() {
		Scanner input = new Scanner(System.in);
		int nr1 = input.nextInt();
		int nr2 = input.nextInt();
		int nr3 = input.nextInt();
		if (nr1 > nr2 && nr1 > nr3) {
			System.out.println(nr1);
		} else if (nr2 > nr3 && nr2 > nr1) {
			System.out.println(nr2);
		} else
			System.out.println(nr3);

	}

	public static void exercitiu5() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int s = 0;
		int nr = 0;
		int i = 0;
		while (nr < n) {
			i++;
			if (i % 2 == 0) {
				s = s + i;
				nr++;
			}

		}
		System.out.println(s);
	}

	public static void exercitiu6() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int s = 0;
		int nr = 0;
		int i = 0;
		while (nr < n) {
			i++;
			if (i % 2 != 0) {
				s = s + i;
				nr++;
			}

		}
		System.out.println(s);
	}

	public static void exercitiu7() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int s = 0;
		int nr = 0;
		int i = 0;
		while (nr < n) {
			i++;
			s = s + i;
			nr++;
		}
		System.out.println(s / n);
	}

	public static void exercitiu8() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		System.out.println(f);
	}

	public static void exercitiu9() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int c = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				c++;
		}
		if (c == 2)
			System.out.println(" este prim");
		else
			System.out.println(" nu este prim");
	}

	public static void exercitiu10() {
		Scanner input = new Scanner(System.in);
		int o = 1000;
		while (true) {
			o++;
			int c = 0;
			for (int i = 1; i <= o / 2; i++) {
				if (o % i == 0)
					c++;
			}
			if (c == 2) {
				System.out.println(o);
				break;
			}

		}
	}

	public static void exercitiu11() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n; i++)
			if (n % i == 0) {
				System.out.println(i);
			}
	}

	public static void exercitiu12() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				int c = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0)
						c++;
				}
				if (c == 2) {
					System.out.println(i);
				}
				
			}
		}
	}

	public static void exercitiu13() {
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=999;i++) {
			for(int j=999;j>=1;j--) {
				if(i%17==0 && j%19==0 && i+j==1000) {
					System.out.println(i + " "+ j);
				}
			}
		}
			
		
		}

	public static void exercitiu14() {
		Scanner input = new Scanner(System.in);
		for(int i=1;i<=999;i++) {
			for(int j=999;j>=1;j--) {
				if(((i%17==0 || i%13==0) && (j%19==0 || j%7==0)) && i+j==1000) {
					System.out.println(i + " "+ j);
				}
			}
		}
	}

	public static void exercitiu15() {
		Scanner input = new Scanner(System.in);
		for(int a=0;a<=9;a++) {
			for(int b=0;b<=9;b++) {
				int e=3020+(100*a)+b;
				if(e%9==0)System.out.println(e);
			}
		}
	}

	public static void exercitiu16() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int nrlength=Integer.toString(n).length();
		for( int i=0;i<nrlength;i++){
			String c=Integer.toString(n);//115
			char v=c.charAt(i);
			System.out.print(v+" ");
			
			
		}
		
			
	}
 
	public static void exercitiu17() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int max=0;
		while(n>0) {
			int v=n%10;
			if (v>max) max=v;
			n=n/10;
		}System.out.println(max);
	}

	public static void exercitiu18() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int max=9;
		while(n>0) {
			int v=n%10;
			if (v<max) max=v;
			n=n/10;
		}System.out.println(max);
		
	}

	public static void exercitiu19() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int nrlength=Integer.toString(n).length();
		for( int i=0;i<nrlength;i++) {
			System.out.print(n%10);
			n=n/10;
		}
		
	}

	public static void exercitiu20() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int r;
		int inv=0;
		int nor=n;
		  while(n>0){
		   r=n%10;  //getting remainder
		   inv=(inv*10)+r;
		   n=n/10;
		  }
		  if(nor==inv)
		   System.out.println("este palindrom");
		  else  System.out.println("nu este palindrom");
		
		
	}






}
