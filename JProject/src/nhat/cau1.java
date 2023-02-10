package nhat;
import java.util.Scanner;

public class cau1{
	public static void main(String[] args) {
       	///        bai 1
//scan 
Scanner sc = new Scanner(System.in);
System.out.println("Nhap a,b,c: ");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
double x1;
double x2;
int delta = b*b - 4*a*c;
if(delta <0) {
System.out.println("phuong trinh Vo nghiem");

}
else if(delta == 0) {
x1= (-b)/2*a;
System.out.println("Phuong trinh co nghiem kep: "+ x1);
}
else if(delta > 0) {
x1 = (-b + Math.sqrt(delta)) / (2*a);
x2 = (-b - Math.sqrt(delta)) / (2*a);
System.out.println("phuong trinh co hai nghiem:");
System.out.println("x1= "+ x1);
System.out.println("x2= "+ x2);

}
}
}
