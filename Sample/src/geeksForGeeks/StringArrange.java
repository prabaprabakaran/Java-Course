package geeksForGeeks;

import java.util.Scanner;

public class StringArrange {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String sb=s.nextLine();
char temp;
char ch[]=sb.replaceAll("[^0-9+]","").toCharArray();
char ch1[]=sb.replaceAll("[0-9+]","").toCharArray();
String original="";
int number=0;
for(int i=0;i<ch.length;i++){
	number+=ch[i]-48;
}
for(int i=0;i<ch1.length-1;i++){
	for(int j=i+1;j<ch1.length;j++){
		if((int)ch1[i]>(int)ch1[j]){
			temp=ch1[i];
			ch1[i]=ch1[j];
			ch1[j]=temp;
			
		}
	}
}
for(int i=0;i<ch1.length;i++){
original+=(ch1[i]);
}
System.out.println(original+""+number);
}
}
