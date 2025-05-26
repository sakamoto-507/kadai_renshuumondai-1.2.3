package reviews.reviews2;

public class Review15 {
    public static void main(String[] args) {
        int num = 4;
        num = num % 2;
        if (num == 0){
            System.out.println("偶数");
        }
        else if (num == 1){
            System.out.println("奇数");
        }else{
            System.out.println("無効な入力です。");
        }
    }
}
