package OptionalThirdTask;

import java.util.*;

public class Song {
    private static final String TheSong = "Yesterday, all my troubles seemed so far away\n"+
                                          "Now it looks as though they're here to stay\n"+
                                          "Oh, I believe in yesterday\n";

    private static final Comparator<String> comparator = new Comparator<String>() {
        @Override
        public int compare(String from, String to) {
            return from.length() - to.length();
        }
    };

    public static void main(String[] args) {
        List<String> list = Arrays.asList(TheSong.split("\n"));
        System.out.println(list);
        Collections.sort(list, comparator);
        System.out.println(list);
    }
}