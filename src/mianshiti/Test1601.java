package mianshiti;

public class Test1601 {
    public static void main(String[] args) {

    }

    public int[] swapNumbers(int[] numbers) {
        numbers[0] ^= numbers[1];
        numbers[1] ^= numbers[0];
        numbers[0] ^= numbers[1];

        return numbers;
    }
}
