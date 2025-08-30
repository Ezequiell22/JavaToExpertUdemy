public class TimeDate {
	public static void main(String[] args) {

		Date date = new Date();
		system.out.println(date);

		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(2024, Calendar.JANUARY, 1);

		Date d1 = calendar1.getTime();

		Calendar calendar2 = new GregorianCalendar(2019, Calendar.FREBRUARY, 1);
		Date d2 = calendar2.getTime();


		/* format*/
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh.mm.ss a z");

		System.out.println(dateFormat.format(now));

		/*compare*/

		Date firstDate = calendar1.getTime();
		Date secondDate = calendar2.getTime();

		firstDate.before(secondDate); /*true false*/
		firstDate.compareTo(secondDate); /* -1 0 1*/

		/*local*/

		LocalDate date1 = LocalDate.of(2020, 3, 2);
		LocalTime time1 = LocalTime.of(9, 33, 22);

		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
		LocalDateTime2 dateTime2 =  LocalDateTime.of(2020, 1, 3, 10, 1, 1);
	}
}