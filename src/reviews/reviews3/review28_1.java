package reviews.reviews3;

import java.io.*;
public class review28_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("宛先を入力");
        String to = br.readLine();
        System.out.println("件名を入力");
        String subject = br.readLine();
        System.out.println("本文を入力");
        String body = br.readLine();
        review28_2 mail = new review28_2();
        if(subject.isEmpty()) {
            mail.send(to,body);
        }else{
            mail.send(to,subject,body);
        }
    }
}
