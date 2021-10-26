package lista01.exercício02;

public class AppExercício02 {
	
	public static void main(String[] args) {
		for (int número = 0; número <= 100; número++) {
			if (divisívelPor3(número) && divisívelPor5(número)) {
				System.out.println(número);			
			}
		}
	}
	
	private static boolean divisívelPor(int número, int divisor) {
		return número % divisor == 0;
	}
	
	
	private static boolean divisívelPor3(int número) {
		return divisívelPor(número, 3);
	}

	private static boolean divisívelPor5(int número) {
		return divisívelPor(número, 5);
	}
}
