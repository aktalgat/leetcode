package io.talgat.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormatText {

    public static void main(String[] args) {
        String[][] paragraphs = {
                {"Hello", "word"},
                {"You", "are great"},
                {"Please align", "this text", "to center"}
        };
        int width = 16;

        FormatText sut = new FormatText();
        Arrays.stream(sut.formatParagraphs(paragraphs, width)).forEach(System.out::println);
    }

    public String[] formatParagraphs(String[][] paragraphs, int width) {
        List<String> list = new ArrayList<>();
        list.add("*".repeat(width + 2));
        for (String[] pargraph : paragraphs) {
            StringBuilder line = new StringBuilder();
            for (String word : pargraph) {
                if (line.length() + (line.length() == 0 ? 0 : 1) + word.length() > width) {
                    list.add(line.toString());
                    line = new StringBuilder();
                }
                if (!line.isEmpty()) line.append(" ");
                line.append(word);
            }
            if (!line.isEmpty()) {
                list.add(line.toString());
            }
        }
        list.add("*".repeat(width + 2));
        for (int i = 1; i < list.size() - 1; i++) {
            int d = width - list.get(i).length();
            int l = d / 2;
            list.set(i, "*" + " ".repeat(l) + list.get(i) + " ".repeat(l) + (d % 2 != 0 ? " " : "") + "*");
        }
        return list.toArray(new String[0]);
    }
}
