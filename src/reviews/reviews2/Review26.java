package reviews.reviews2;

public class Review26 {
    public static void main(String[] args) {
        int numArray[] = {11,12,13,14,14,14,15};
        int target = 14;
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == target) {
                count = count +1;
            }
        }
        System.out.println("探索した値: " + target);
        System.out.println("一致した数: " + count);
    }
}
