package Easy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class DateAndTime {
	public static String findDay(int month, int day, int year) {
		String result;
		DayOfWeek dt = LocalDate.of(year, month, day).getDayOfWeek();
		result = dt.toString();
		return result;
		
	}

	public static void main(String[] args) {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//		int month = Integer.parseInt(firstMultipleInput[0]);
//
//		int day = Integer.parseInt(firstMultipleInput[1]);
//
//		int year = Integer.parseInt(firstMultipleInput[2]);
//
//		String res = Result.findDay(month, day, year);
//
//		bufferedWriter.write(res);
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		String[] arr = str.split(" ");
		int month = Integer.parseInt(arr[0]);
		int day = Integer.parseInt(arr[1]);
		int year = Integer.parseInt(arr[2]);
		
		System.out.println(findDay(month,day,year));
		in.close();
	}
}
