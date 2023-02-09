package nhat;

import java.util.Iterator;

public class hello {
	// main => ctrl + space => enter

	
	
	
public static void ptb2 (float a, float b, float c) {
	float delta = (float) (Math.pow(b, 2)-4*a*c);
	if (delta <0) {
		System.out.println("Phuong trinh vo nghiem");
		
}
	else if(delta ==0) {
		System.out.println("PT co nghiem kep: "+ (-b/2*a));
		
	}
	else {
		double x1=(-b - Math.sqrt(delta))/2*a;
		double x2 = (-b + Math.sqrt(delta))/2*a;
		System.out.printf("Pt co hai nghiem phan biet: %f, %f",x1,x2);
		
	}
	

}





public static long GT(int n) {
	int s = 1;
	for(int i=1;i<=n;i++) {
		s*=i;
	
	}
	return s;
	
	
	
	
	
}
public static int ucln(int tu,int mau){
    while(tu!=mau){
        if(tu>mau) tu-=mau;
        else mau-=tu;
    }
    return tu;
}
public static long DQGT(int n) {
	if(n==0) return 1;
	return n* DQGT(n-1);
}
public static long Fibo(int n) {
	long a=1;
	long b=0;
	long c = 0;
	for (int i =0;i<n;i++) {
		 c = a+b;
		b=a;
		a=c;
	}
	return c;
	
}
public static boolean Tnghich(int n){
	int m = n;
	int temp = 0;
	while(n>0) {
		temp = temp*10 + n%10;
		n/=10;
	}
	if(m==temp)return true;
	return false;
}
	

public static long tong(long n) {
	int tong=0;
	for(long i=n;i>0;i/=10) {
		long j=i%10;
		tong+=j;
	}
	return tong;
}
public static int snt(int n) {
    
    if (n < 2) {
        return 0;
    }
   
    int i;
    int m = (int) Math.sqrt(n);
    for (i = 2; i <= m; i++) {
        if (n % i == 0) {
            return 0;
        }
    }
    return 1;
}
}
