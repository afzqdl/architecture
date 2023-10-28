package ObjectOriented;

import max.Solution;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
//import java.util.StringTokenizer;

public class Shift {

//    private ArrayList<String> kwicList = new ArrayList<String>();
    private ArrayList<String> lineTxt;

    public Shift( ArrayList<String> lineTxt) {
        this.lineTxt = lineTxt;

    }

//    public ArrayList<String> getKwicList() {
//        return kwicList;
//    }

//    private String[] word;

    private int maxWidth = 16;

//    public ArrayList<String> getLineTxt() {
//        return lineTxt;
//    }

    public List<String> shift() {
        String[] word = new String[lineTxt.size()];
        int i = 0;
        for (String line : lineTxt) {
            word[i++] = line;
        }
        Solution solution = new Solution();
        List<String> list = new ArrayList<>();
        list = solution.fullJustify(word, maxWidth);
        return list;
    }

//    public void shift() {
//        //获取每个单词，存入tokens
//        Iterator<String> it = lineTxt.iterator();
//        while (it.hasNext()) {
//            StringTokenizer token = new StringTokenizer(it.next());
//            ArrayList<String> tokens = new ArrayList<String>();
//            int i = 0;
//            //循环添加单词
//            int count = token.countTokens();
//            while (i < count) {
//                tokens.add(token.nextToken());
//                i++;
//            }
//
//            //display(tokens);
//            //切割各个单词，不断改变起始值和利用loop实现位移。
//            for (i = 0; i < count; i++) {
//                StringBuffer lineBuffer = new StringBuffer();
//                int index = i;
//                for (int f = 0; f < count; f++) {
//                    //从头继续位移
//                    if (index >= count)
//                        index = 0;
//                    //存入StringBuffer
//                    lineBuffer.append(tokens.get(index));
//                    lineBuffer.append(" ");
//                    index++;
//                }
//                String tmp = lineBuffer.toString();
//                kwicList.add(tmp);
//            }
//        }
//
//    }

}
