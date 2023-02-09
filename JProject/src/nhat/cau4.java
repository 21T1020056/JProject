package nhat;

import java.util.Scanner;

public class cau4{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a va b: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i=hello.ucln(a,b);
		int j;
		System.out.println("Uoc chung lon nhat cua a va b la: "+ i);
	j=a;
	if(b<a) {
		j=b;
	}
		while(j<a*b) {
			j++;
			if(j%a==0 && j%b==0) {
				System.out.println("Boi chung nho nhat cua a va b la: "+ j);
				break;
			}
			
		}
		
				}
}
		
		
		



