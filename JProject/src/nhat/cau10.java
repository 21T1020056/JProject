package nhat;
import java.util.Scanner;

public class cau10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n= sc.nextInt();
		int m=0;
		long p=0;
				System.out.println("so fibonacci nho hon n la so nguyen to la: " );
		while(p<n) {
			
			p=(int)hello.Fibo(m);
			if(hello.snt((int) p)==1)
				System.out.println(p);
					m++;
		}
	}
}