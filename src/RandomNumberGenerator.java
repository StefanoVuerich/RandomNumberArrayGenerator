import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		int[] randomNumbers = TheRandomGenerator.generateRandomArray(4);
		
		String answer1 = "uno";
		String answer2 = "due";
		String answer3 = "tre";
		String answer4 = "quattro";
		
		String[] risposte = {answer1, answer2, answer3, answer4};
		
		int x = 0;
		for (int i : randomNumbers) {
			System.out.println(risposte[i - 1]);
			++x;
			
		}
	}

	public static class TheRandomGenerator {

		public static int[] generateRandomArray(int arrayLength) {

			// inizializzo array
			int[] randomNumbersArray = new int[arrayLength];

			// primo for loop
			for (int i = 0; i < randomNumbersArray.length; ++i) {

				boolean assigned = false;

				while (!assigned) {
					Random r = new Random();
					int randomNumber = r.nextInt((arrayLength + 1) - 1) + 1;

					boolean isNotAlreadyPresent = true;

					for (int j = 0; j <= i; ++j) {
						if (randomNumber == randomNumbersArray[j])
							isNotAlreadyPresent = false;
					}
					if (isNotAlreadyPresent) {
						randomNumbersArray[i] = randomNumber;
						assigned = true;
						break;
					}
				}
			}

			return randomNumbersArray;
		}

	}

}
