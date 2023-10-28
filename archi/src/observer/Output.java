package observer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Output implements Observer {
//    private ArrayList<String> kwicList;
//    private BufferedWriter outputFile;
    private String filePath;
    private List<String> list = new ArrayList<>();
    public Output(List<String> list,String filePath) {
        this.list = list;
        this.filePath = filePath;
    }

    @Override
    public void toDo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.filePath))) {
            for (String item : list) {
                writer.write(item);
                writer.newLine(); // 每个元素写入一行
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
