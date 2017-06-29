
public class statics {
	static int i=100;
	public static void main(String[] args) {
		statics staticss=new statics();
		statics statics1=new statics();
		int a=200;
		staticss.i=a;
		System.out.println(a);
		System.out.println(i);
		System.out.println(statics1.i);
		
		
	}

}
