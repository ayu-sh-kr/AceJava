import java.security.SecureRandom;

public class DiceRoll {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int[] dice = new int[7];
        for(int i = 0; i <= 6000000; i++){
            ++dice[1 + randomNumber.nextInt(6)];
        }

        System.out.println("Face \t Frequency");
        for(int i = 1; i <= 6; i++){
            System.out.println(i + "\t" + dice[i]);
        }
    }
}
