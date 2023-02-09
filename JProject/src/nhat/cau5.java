package nhat;
 import java.util.Scanner;
 
 public class cau5{
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int i;
		int n = sc.nextInt();
		System.out.println("Tat ca cac nguyen to nho hon n la: ");
		if(n>=2) {
			System.out.println("2");
		}
		for(i=3;i<n;i+=2) {
			if(hello.snt(i)==1) {
				System.out.println(+ i);
			}
		}
		
	}
 }