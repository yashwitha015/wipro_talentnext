
		package java_fundamentals;

		public class ArrayQuestion1 {
		    public static void main(String[] args) {
		        
		        int[] numbers = {10, 20, 30, 40, 50};

		        int sum = 0;

		        for (int num : numbers) {
		            sum += num;
		        }

		        double average = (double) sum / numbers.length;

		     
		        System.out.println("Sum = " + sum);
		        System.out.println("Average = " + average);
		    }
		

	}


