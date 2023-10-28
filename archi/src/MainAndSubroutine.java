import max.Solution;

import java.io.*;
import java.util.*;

public class MainAndSubroutine {
    private int maxWidth = 16;
    private ArrayList<String> lineTxt = new ArrayList<String>();
    private String[] word;
    private BufferedReader inputFile;

//    public static void main(String[] args) {
//
//        MainAndSubroutine kwic = new MainAndSubroutine();
//        kwic.input("input.txt");
//
//        kwic.output(kwic.shift(), "output.txt");
//    }

    public void run() {
        MainAndSubroutine kwic = new MainAndSubroutine();
        kwic.input("input.txt");

        kwic.output(kwic.shift(), "output.txt");
    }

    public void input(String fileName) {
        try {
            inputFile = new BufferedReader(new FileReader(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String line;
        try {
            while ((line = inputFile.readLine()) != null) {
                lineTxt.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void output(List<String> list, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String item : list) {
                writer.write(item);
                writer.newLine(); // 每个元素写入一行
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public List<String> shift() {
        word = new String[lineTxt.size()];
        int i = 0;
        for (String line : lineTxt) {
            word[i++] = line;
        }
        Solution solution = new Solution();
        List<String> list = new ArrayList<>();
        list = solution.fullJustify(word, maxWidth);
        return list;
    }



}
