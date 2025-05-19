public class Review21 {
    public static void main(String[] args) {
        int num = 6;
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("結果" + sum);
    }
}
