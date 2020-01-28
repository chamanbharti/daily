import java.time.LocalDate;
import java.util.Calendar;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
	public static void main(String[] args) {
//		Predicate<String>isEquals = s -> {
//			return s.equals("Hello");
//		};
//		System.out.println(isEquals.test("Hello"));
//		System.out.println(isEquals.test("Hello World"));
//		Predicate<Integer>isGreaterThan = i -> {
//			return i > 0;
//		};
//		System.out.println(isGreaterThan.test(5));
//		System.out.println(isGreaterThan.test(-5));
		
//		Predicate<String>predicate = s -> {
//			return s.equals("Hello");
//		};
//		System.out.println(Predicate.isEqual(predicate).toString());
//		Predicate<String>predicateAnd = predicate.and(s -> s.length()>4);
//		System.out.println(predicateAnd.test("Hell"));
//		Predicate<String>predicateOr = predicate.or(s -> s.length()==10);
//		System.out.println(predicateOr.test("Hello"));
//		Predicate<String>predicateNegate = predicate.negate();
//		System.out.println(predicateNegate.test("Hello"));
//		Predicate<String>i = Predicate.isEqual("Hello");
//		System.out.println(i.test("Hello"));
		
//		Function<Integer,String>evenOrOdd = (e) -> {
//			if(e % 2 == 0) {
//				return e+" is even number";
//			}else {
//				return e+" is odd number";
//			}
//		};
//		System.out.println(evenOrOdd.apply(5));
//		System.out.println(evenOrOdd.apply(8));
		
//		Function<Integer,Integer>f1 = i -> (i-5);
//		Function<Integer,Integer>f2 = i -> (i*2);
//		//andThen()
//		int a = f1.andThen(f2).apply(50);
//		System.out.println(a);
//		int b = f1.andThen(f2).apply(50);
//		System.out.println(b);
//
//		//identity()
//		Function<Integer,Integer>id = Function.identity();
//		System.out.println(id.apply(3));
		
//		Consumer<String>c = s -> {
//			System.out.println(s);
//		};
//		c.accept("Hello Java");
//		c.accept("Hello World");
//		
//		Consumer<Integer>cc = s -> {
//			System.out.println("Integer value="+s);
//		};
//		cc.accept(5);
//		cc.accept(8);
		
//		Consumer<String>consumer1 = s->{
//			System.out.println(s+" World");
//		};
//		Consumer<String>consumer2 = s->{
//			System.out.println(s+" Java");
//		};
//		
//		consumer1.andThen(consumer2).accept("Hello");
		
//		Supplier<String>supplier1 = () -> {
//			return "Hello World";
//		};
//		System.out.println(supplier1.get());
//		Supplier<Number>supplier2 = () ->{
//			return 40;
//		};
//		System.out.println(supplier2.get());
		
		
//		String sql = "Book_1_2020";
//		System.err.println("Before Modifying SQL =" + sql);
//	   Calendar calendar = Calendar.getInstance();
//	   int month = calendar.get(Calendar.MONTH) + 1;
//	   int year = calendar.get(Calendar.YEAR);
//	   String tableName = "Book_" + month + "_" + year;
//	   sql = sql.replace("Book_1_2020", tableName);
//	   System.err.println("After Modifying SQL =" + sql);
		

		String sql = "Book_1_2020";
		System.err.println("Before Modifying SQL =" + sql);
		LocalDate date = LocalDate.now();
	   int month = date.getMonthValue() + 1;
	   int year = date.getYear();
	   String tableName = "Book_" + month + "_" + year;
	   sql = sql.replace("Book_1_2020", tableName);
	   System.err.println("After Modifying SQL =" + sql);
	}

}
