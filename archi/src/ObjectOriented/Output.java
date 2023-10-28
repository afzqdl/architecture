package ObjectOriented;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Output {
//    private ArrayList<String> kwicList;
//    private BufferedWriter outputFile;
//
//    public Output(ArrayList<String> kwicList) {
//        this.kwicList = kwicList;
//    }

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
}
