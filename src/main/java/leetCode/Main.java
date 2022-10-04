package leetCode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void matchingLists() throws IOException {
        List<String> list = Files.readAllLines(Paths.get("C:\\input.txt"), StandardCharsets.UTF_8);
        List<String> firstList = new ArrayList<>(list.subList(1, Integer.parseInt(list.get(0)) + 1));
        List<String> secondList = new ArrayList<>(list.subList(Integer.parseInt(list.get(0)) + 2, list.size()));
        int sizeFirstList = firstList.size();
        int sizeSecondList = secondList.size();

        List <String> rezult = new ArrayList<>();
        int num = 0;
        boolean yes = false;
        for (int i = 0; i < sizeFirstList; i++) {
            for (int j = 0; j < sizeSecondList; j++) {
                if (firstList.get(i).regionMatches(0, secondList.get(j), 0, 3)
                        || firstList.get(i).regionMatches(sizeSecondList - 3, secondList.get(j), sizeFirstList - 3, 3)) {
                    rezult.add(firstList.get(i) + ":" + secondList.get(j));
                    yes = true;
                }
//                if (firstList.get(i).substring(0, 3).equals("bet") && secondList.get(j).substring(0, 3).equals("cem")) {
//                    rezult.add(firstList.get(i) + ":" + secondList.get(j));
//                    yes = true;
//                }
            }
            if (!yes) {
                rezult.add(firstList.get(i) + ":?");
            }
        }
        File file = new File("C:\\output.txt");
        PrintWriter printWriter = new PrintWriter(file);
        for (String s : rezult) {
            printWriter.print(s + System.lineSeparator());
        }
        printWriter.close();
    }

    public static void main(String[] args) throws IOException {
        matchingLists();
    }
}
