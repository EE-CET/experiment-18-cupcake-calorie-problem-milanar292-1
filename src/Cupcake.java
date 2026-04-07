import java.util.*;

public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Long[] calories = new Long[n];
        
        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextLong();
        }
        
        // Sort in descending order
        Arrays.sort(calories, Collections.reverseOrder());
        
        long totalMiles = 0;
        
        for (int i = 0; i < n; i++) {
            totalMiles += calories[i] * (1L << i); // 2^i using bit shift
        }
        
        System.out.println(totalMiles);
    }
}
