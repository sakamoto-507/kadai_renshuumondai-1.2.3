package reviews.reviews3.review29;

import java.io.*;

public class Email {
    public String readString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = "";
        try {
            inputStr = br.readLine();
        }catch (IOException e){
            System.out.print("ERROR:IOException");
        }
        return inputStr;
    }
}
