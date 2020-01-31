package java.generic;

public class GenericDemo {

	//generic method printArray
	public static <E> void printArray( E[] inputArray) {
		//display array elements
		for(E element: inputArray) {
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// Create arrays of Integer, Double and Character
	      Integer[] intArray = { 1, 2, 3, 4, 5 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	      System.out.println("Array integerArray contains:");
	      printArray(intArray);   // pass an Integer array
	}
}
