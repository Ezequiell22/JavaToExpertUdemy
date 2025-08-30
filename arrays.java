public class GenericMethod {

	piblic static void main(String[] args) 
	{
		List<String> array = new ArrayList<>();

		array.add("One thing");
		array.add("other thing");

		for(String s : array)
			System.out.println(s);



		String[] names = {"Ana", "Marta", "Gabi"};
		printArray(names);
	}

public static <T> void printArray(T[] items){
	for(T item : items)
			System.out.println(item);
	}
}