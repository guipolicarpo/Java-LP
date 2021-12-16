/* Guilherme Policarpo de Carvalho */ 
public class ConversaoPrimitivos {
	
	public static void main (String[] args) {
		int a = 10;
		long b =  (int) a;
		int c = (int) b;
		float d = (int) b;
		short e = (byte) a;
		double f = (int) d;
		Long g = (long) b;
		long h = g;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}

