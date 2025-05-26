package reviews.reviews2;

public class Review18 {
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        int i = 0;
        while(i <= num){
            if (i % 2 == 1){
                sum =  sum + i;
            }
            i = i + 1;
        }
        System.out.println("結果" + sum);
    }
}
