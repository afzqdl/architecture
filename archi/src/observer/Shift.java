package observer;

import max.Solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class Shift implements Observer {
//    private ArrayList<String> kwicList = new ArrayList<String>();
    private ArrayList<String> lineTxt;
    List<String> list = new ArrayList<>();

    public Shift( ArrayList<String> lineTxt) {
        this.lineTxt = lineTxt;
    }

//    public ArrayList<String> getKwicList() {
//        return kwicList;
//    }

    public List<String> getList() {
        return this.list;
    }

    public ArrayList<String> getLineTxt() {
        return lineTxt;
    }

    @Override
    public void toDo() {
        String[] word = new String[lineTxt.size()];
        int i = 0;
        for (String line : lineTxt) {
            word[i++] = line;
        }
        Solution solution = new Solution();
//        List<String> list = new ArrayList<>();
        this.list = solution.fullJustify(word, 16);
//        return list;
    }



}

