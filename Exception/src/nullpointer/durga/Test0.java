package nullpointer.durga;

public class Test0 {
	
	//1 byte
	static byte _byte;
	static boolean b;
	
	//2 byte
	static char c;
	static short s;
	
	//4 byte
	static int i;
	static float f;
	
	// 8 byte
	static long l;
	static double d;
	
	
	static String str;
	
	public static void main(String[] args) {
		
//		String s = null;
//		System.out.println("s:"+s);
//		System.out.println((String)null);
		
		
		//char ch = 'a';
		//ch = null;
		
//		System.out.println("byte:"+_byte);//0
//		System.out.println("boolean:"+b);//false
//		
//		System.out.println("char:"+c);//'\u0000'
//		System.out.println("short:"+s);//0
//		
//		System.out.println("int:"+i);//0
//		System.out.println("float:"+f);//0.0
//		
//		System.out.println("long:"+l);//0
//		System.out.println("double:"+d);//0.0
//		
//		System.out.println("String:"+str);//null
//		
//		//System.out.println(null);//CE
//		
//		//r==null // always false
//		String r = new String("Chaman");
//		System.out.println(r==null);//false
//		
//		//null==null//always true
//		String s = null;
//		System.out.println(s==null);//true
//		System.out.println(null==null);//true
//		
//		System.out.println("str.equals(null)");
//		String str = new String("Chaman");
//		System.out.println(str.equals(null));//false
//		String ss=null;
//		System.out.println(ss.equals(null));//NPE
//		
//		System.out.println("null Vs NULL Vs ");
//		
		String fullName = "nulld";
		if(fullName != null && fullName.isEmpty()) {
			fullName = "Chaman";
		}else {
			fullName = null;
		}
		
		
		System.out.println(fullName);
	}

}
