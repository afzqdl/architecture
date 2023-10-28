package max;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    private int maxWidth = 16;
    private ArrayList<String> lineTxt = new ArrayList<String>();
    private String[] word;
    private BufferedReader inputFile;

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

    public void Output(List<String> list, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String item : list) {
                writer.write(item);
                writer.newLine(); // 每个元素写入一行
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Main m = new Main();
        m.input("input.txt");
        m.word = new String[m.lineTxt.size()];
        int i = 0;
        for (String line : m.lineTxt) {
            m.word[i++] = line;
        }
        Solution solution = new Solution();
        List<String> list = new ArrayList<>();
        list = solution.fullJustify(m.word, m.maxWidth);
        m.Output(list, "output.txt");

    }
}
