package ObjectOriented;

import java.io.BufferedReader;
import java.util.ArrayList;

public class ObjectOriented {

    private int maxWidth = 16;
    private ArrayList<String> lineTxt = new ArrayList<String>();
    private String[] word;
    private BufferedReader inputFile;

//    public static void main(String[] args) {
//
//        ObjectOriented main = new ObjectOriented();
//        Input input = new Input(main.lineTxt);
//        input.input("input.txt");
////        Shift shift = new Shift(input.getLineTxt());
//        Shift shift = new Shift(main.lineTxt);
//        Output output = new Output();
//        output.output(shift.shift(), "output.txt");
////        shift.shift();
////        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
////        alphabetizer.sort();
////        Output output = new Output(alphabetizer.getKwicList());
////        output.output("output.txt");
//
//    }

    public void run() {
        ObjectOriented main = new ObjectOriented();
        Input input = new Input(main.lineTxt);
        input.input("input.txt");
//        Shift shift = new Shift(input.getLineTxt());
        Shift shift = new Shift(main.lineTxt);
        Output output = new Output();
        output.output(shift.shift(), "output.txt");
    }

}
