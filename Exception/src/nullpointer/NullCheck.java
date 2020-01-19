package nullpointer;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

//https://www.techiedelight.com/check-string-empty-or-null-java/
public class NullCheck {
	
	public static void main(String[] args) {
		
//		String str = null;
//		if(str == null || str.isEmpty()) { //  true
//			System.out.println("null pointer");
//		}
		
//		String str = "gg";
//		if(str == null || str.length() == 0) { //  true
//			System.out.println("null pointer");
//		}
		
//		String empty = "";
//		String str = "";
//		if(str == null || str.isEmpty()) {//true
//			System.out.println("null pointer");
//		}
//		if(str == null || empty.equals(str)) {//true
//			System.out.println("null pointer");
//		}
		
//		String string = null;
//		if(string == null || string.isEmpty()){//true
//			System.out.println("null pointer");
//		}
		
		//since java 11
//		Predicate<String> notNull = Predicate.not(Objects::isNull);
//		Predicate<String> notEmptyString = Predicate.not(String::isEmpty);
//		Predicate<String> isNotEmpty = notNull.and(notEmptyString);
//		System.out.println(isNotEmpty.test(""));      // false
//		System.out.println(isNotEmpty.test(null));    // false
//		System.out.println(isNotEmpty.test("null"));  // true
		
//		String string = null;
//		if(string == null)
//			System.out.println("null pointer");
//		string = "";
//			if(string.length() == 0)
//				System.out.println("null pointer");
//
//			if(("").equals(string))
//				System.out.println("null pointer");
		
//		String string = null;
//		if(string == null || string.trim().isEmpty())
//			System.out.println("null pointer");
		
		//since java 8
//		String string = "";
//		Optional.ofNullable(string).filter(s-> !(s.trim().isEmpty())).ifPresent(result->{
//			System.out.println("null pointer"+result);
//		});
		
		//This could be combined with Optional to check if string is null or empty
//		String str = "";
//		//boolean isNullOrEmpty = Optional.ofNullable(str).map(String::isBlank).orElse(true); //in jdk 11
//		boolean isNullOrEmpty = Optional.ofNullable(str).map(String::isEmpty).orElse(true);
//		if(isNullOrEmpty) {
//			System.out.println("Null");
//		}
		
		
		//The better way to handle null in the string is,
//		String str = "ff";
//		if(str!=null && !str.equalsIgnoreCase("null") && !str.isEmpty()) {
//			System.out.println("Null");
//		}
//		
		
//		String str = " ";
//		if(str!=null && !str.equalsIgnoreCase("null") && str.length()!=0) {
//			System.out.println("Null");
//		}
		
		//with space
		String str = " ";
		if(str!=null && !str.equalsIgnoreCase("null") && str.trim().length()!=0) {
			System.out.println("Null");
		}
		
		
	}
	
	

}
