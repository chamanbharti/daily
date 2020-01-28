package optional.objects;

import java.util.Objects;

public class ObjectsDemo {

	public static void main(String[] args) {
		
		System.out.println("public static boolean equals(Object a,Object b) of Objects");
		String firstName = "Chaman";
		String lastName = "Chaman";
		System.out.print(Objects.equals(firstName, lastName));
		System.out.println(": Using public static boolean equals(Object a,Object b)  of Objects");
		System.out.print(firstName.equals(lastName));
		System.out.println(": Using boolean equals(Object obj) of Object");
		
		/**
	  public static <T> T requireNonNull(T obj) {
       if (obj == null)
           throw new NullPointerException();
         return obj;
       }
		 */
		System.out.println();
		String str = "Chaamn";
		str = Objects.requireNonNull(str);
		
		System.out.println(str);
		
		/**
	public static <T> T requireNonNull(T obj, String message) {
        if (obj == null)
            throw new NullPointerException(message);
        return obj;
    }
		 */
		str = null;
		str = Objects.requireNonNull(str, "str cannot be null");
		System.out.println(str);
		
		str = null;
		//useful when creating the message is expensive
		Objects.requireNonNull(str, ObjectsDemo::createMessage);
		
	}
	
	
	private static String createMessage() {
		return "a demo string";
	}
}
