package nhat;
import java.util.Scanner;
public class cau8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so n: ");
		long n= sc.nextLong();
		System.out.print("Tong cac chu so trong "+ n);System.out.print(" la: ");
		long m=hello.tong(n);
		System.out.println(+ m);
	}
}