public class Main {
	public static void main(String[] args){

		String s = "";
		long startTime = system.currentTimeMillis();

		for(int i = 0; i< 100000; i++){
			s += "Java";
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Duration of String operations: "+ (endTime - startTime)+ " ms");


		var stringBuilder = new StringBuilder();
		startTime = System.currentTimeMillis();

		for (int i=0; i <100000 ; i++ ) {
			stringBuilder.append("Java");
		}

		endTime = System.currentTimeMillis();
		System.out.println("Duration of String operations: "+ (endTime - startTime));

	}
}