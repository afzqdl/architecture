import ObjectOriented.ObjectOriented;
import observer.Obs;
import pipeAndFilter.PipeAndFilter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {


    public static void main(String[] args) throws IOException {
        MainAndSubroutine mas = new MainAndSubroutine();
        PipeAndFilter paf = new PipeAndFilter();
        Obs obs = new Obs();
        ObjectOriented objo = new ObjectOriented();

        String filePath = new String(); // 替换为您的文件路径

        System.out.println("*****经典软件体系结构教学软件*****");
        System.out.println("*****1、主程序-子程序");
        System.out.println("*****2、面向对象");
        System.out.println("*****3、事件系统");
        System.out.println("*****4、管道-过滤器");
        System.out.print("请选择软件的体系结构风格：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i==1) {
            mas.run();
            filePath = "mas.txt";
        } else if (i==2) {
            obs.run();
            filePath = "obs.txt";
        } else if (i==3) {
            objo.run();
            filePath = "objo.txt";
        } else {
            paf.run();
            filePath = "paf.txt";
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("");
        System.out.println("经过处理后的文本：");
        filePath = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
