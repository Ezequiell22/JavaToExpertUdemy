public enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, SATURDAY, SUNDAY
}

enum TrafficLight {
	GREEN(50), YELLOW(5), RED(30);

	private final int time;

	TrafficLight(int time){
		this.time = time;
	}

	public int getTime(){
		return this.time;
	}
}

public class EnumExample {
	public static void main(String[] args) {
		for(Day day : Day.values())
			System.out.println(day);

		Day day = Day.MONDAY;

		switch(day){
			case MONDAY -> System.out.println("MONDAY");
			case TUESDAY -> System.out.println("TUESDAY");
			case WEDNESDAY -> System.out.println("WEDNESDAY");
			default -> throw new IllegalArgumentException("this is not valid");
		}


		for( TrafficLight light : TrafficLight.values()){
			System.out.println(light + " light time is: " + light.getTime());
		}
	}
}