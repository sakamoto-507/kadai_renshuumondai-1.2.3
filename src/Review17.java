public class Review17 {
    public static void main(String[] args) {
        int num = 6;
        int sum = 0;
        int i = 0;
        while (i <= num) {

            if (i % 2 == 0) {
                sum = sum + i;
            }
            i = i + 1;
        }
        System.out.println("結果" + sum);
    }
}
