package ExerciciosAula35MétodosRecursivos;

public class Fibonacci {

	public static int fibonacci(int n) {
		if (n == 2 || n == 3) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
		
	}	
		
}
