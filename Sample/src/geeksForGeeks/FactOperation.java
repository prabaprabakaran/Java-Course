package geeksForGeeks;

import java.util.Scanner;

public class FactOperation {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int fact=1;
	int i=0;
	int b=0;
	int c[]=new int[a];
	while(a>0){
		b=a%10;
		a=a/10;
		c[i]=b;
		i++;
		
	}
	for(int j=0;j<i;j++){
		fact=fact*c[j];
	}
	System.out.println(fact);

	//System.out.println(fact);
	//System.out.println(c[2]);
	//System.out.println(b[1]);
	

	
}
}
