package pipeAndFilter;

import max.Solution;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Shift extends Filter {

    private int maxWidth = 16;
    private String s = new String("What   must   be\n" +
            "acknowledgment  \n" +
            "shall be  ");

    public Shift(Pipe input, Pipe output) {
        super(input, output);
    }

    @Override
    protected void transform() throws IOException {
        //获取每个单词，存入tokens
        while (input.hashNextLine()) {
            StringTokenizer token = new StringTokenizer(input.readerLine());
            ArrayList<String> tokens = new ArrayList<String>();
            int i = 0;
            //循环添加单词
            int count = token.countTokens();
            while (i < count) {
                tokens.add(token.nextToken());
                i++;
            }

            String[] word = new String[tokens.size()];
            i = 0;
            for (String line : tokens) {
                word[i++] = line;
            }
//            for (String w : word) {
//                System.out.println(w);
//            }
            Solution solution = new Solution();
            List<String> list = new ArrayList<>();
            list = solution.fullJustify(word, maxWidth);


        }
        output.writerLine(s);
        input.closeReader();
        output.closeWriter();
    }
}

