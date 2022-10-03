package leetCode;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            list = Files.readAllLines(Paths.get("C:\\a2.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list);
    }
}