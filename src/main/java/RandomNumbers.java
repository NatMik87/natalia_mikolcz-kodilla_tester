import java.util.Random;

public class RandomNumbers {
    int minNumber;
    int maxNumber;
    public RandomNumbers(int minNumber , int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }


    public static void main(String[] args) {
        int sum = 0;
        Random rand = new Random();
        RandomNumbers randomNumbers = new RandomNumbers(30, 0);
        while (sum <= 5000) {
            int intRandom = rand.nextInt(31);
            sum += intRandom;

            if(intRandom <= randomNumbers.minNumber)
            {
            randomNumbers.minNumber = intRandom;
            }
            if(intRandom >= randomNumbers.maxNumber){
                randomNumbers.maxNumber = intRandom;
            }
        }
        System.out.println(randomNumbers.minNumber);
        System.out.println(randomNumbers.maxNumber);
    }

}
