package reviews.reviews3.review29;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Email keyinput = new Email();
        System.out.print("宛先を入力>");
        String to = keyinput.readString();
        System.out.print("件名を入力>");
        String subject = keyinput.readString();;
        System.out.print("本文を入力>");
        String body = keyinput.readString();;
        System.out.println(to + "に以下のメールを送信しました。");
        System.out.println("件名: " + subject);
        System.out.println("本文: " + body);
    }
}
