package testbook_practice.Chapter6;

import java.io.IOException;

public class Practice1 {
    public static void main(String[] args) throws IOException {
        doWarusa();
        doTogame();
        callDeae();
        showMondokoro();
    }
    public static void doWarusa() {
        System.out.println("きなこ粉でござる。食えませんがの。");
    }
    public static void doTogame() {
        System.out.println("この老いぼれの目はごまかせませんぞよ。");
    }
    public static void callDeae() {
        System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
    }
    public static void showMondokoro() throws IOException {
        System.out.println("飛車さん、角さん。もういいでしょう。");
        System.out.println("この紋所が目にはいらぬか！");
        doTogame(); //もう一度、とがめる
    }
}