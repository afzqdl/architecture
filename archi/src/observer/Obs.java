package observer;

import java.io.BufferedReader;
import java.util.ArrayList;

public class Obs {
//    private int maxWidth = 16;
//    private ArrayList<String> lineTxt = new ArrayList<String>();
//    private String[] word;
//    private BufferedReader inputFile;
//    public static void main(String[] args) {
////        Main m = new Main();
//        //创建主题
//        KWICSubject kwicSubject = new KWICSubject();
//        //创建观察者
//        Input input = new Input("input.txt");
//        Shift shift = new Shift(input.getLineTxt());
////        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
//        Output output = new Output(shift.getList(), "output.txt");
//
//        // 将观察者加入主题
//        kwicSubject.addObserver(input);
//        kwicSubject.addObserver(shift);
////        kwicSubject.addObserver(alphabetizer);
//        kwicSubject.addObserver(output);
//        // 逐步调用各个观察者
//        kwicSubject.startKWIC();
//    }

    public void run() {
        //创建主题
        KWICSubject kwicSubject = new KWICSubject();
        //创建观察者
        Input input = new Input("input.txt");
        Shift shift = new Shift(input.getLineTxt());
//        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        Output output = new Output(shift.getList(), "output.txt");

        // 将观察者加入主题
        kwicSubject.addObserver(input);
        kwicSubject.addObserver(shift);
//        kwicSubject.addObserver(alphabetizer);
        kwicSubject.addObserver(output);
        // 逐步调用各个观察者
        kwicSubject.startKWIC();
    }
}
