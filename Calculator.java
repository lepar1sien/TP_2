import java.math.BigInteger;
import java.io.*;
import java.util.*;

public class Calculator {
    public static List<Integer> readNumsFromFile(String filename) throws IOException {
        List<Integer> nums = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = buffer.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                for (String token : tokens) {
                    nums.add(Integer.parseInt(token));
                }
            }
        }
        return nums;
    }
    public static int _min(List<Integer> nums) {
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            int curr = nums.get(i);
            if (min > curr) {
                min = curr;
            }
        }
        return min;
    }

    public static int _max(List<Integer> nums) {
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            int curr = nums.get(i);
            if (max < curr) {
                max = curr;
            }
        }
        return max;
    }


    public static BigInteger _sum(List<Integer> nums) {
        BigInteger sum = BigInteger.ZERO;
        for (int num : nums) {
            sum = sum.add(BigInteger.valueOf(num));
        }
        return sum;
    }


    public static BigInteger _mult(List<Integer> nums) {
        BigInteger product = BigInteger.ONE;
        for (int num : nums) {
            product = product.multiply(BigInteger.valueOf(num));
        }
        return product;
    }

    public static void main(String[] args) {
        try {
            List<Integer> numbers = readNumsFromFile("numbers.txt");

            System.out.println("Минимальное: " + _min(numbers));
            System.out.println("Максимальное: " + _max(numbers));
            System.out.println("Сумма: " + _sum(numbers));
            System.out.println("Произведение: " + _mult(numbers));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}