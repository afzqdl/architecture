package ObjectOriented;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Input {

    private ArrayList<String> lineTxt = new ArrayList<String>();

    private BufferedReader inputFile;

//    public ArrayList<String> getLineTxt() {
//        return lineTxt;
//    }

    public Input(ArrayList<String> lineTxt){
        this.lineTxt = lineTxt;
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

}
