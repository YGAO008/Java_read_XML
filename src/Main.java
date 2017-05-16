import sample.GetExcelInfo;

import java.io.File;

public class Main {


    public static void main(String[] args) {

        System.out.println("Hello World!");

        GetExcelInfo obj = new GetExcelInfo();
        // 此处为我创建Excel路径：E:/zhanhj/studysrc/jxl下
        File file = new File("/Users/gaojael/Desktop/LA-Venues.xls");
        obj.readExcelByColumnId(file,1);
    }
}
