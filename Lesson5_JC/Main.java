package Lesson5_JC;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        AppData appData = new AppData(3,2,3);
        appData.header[0] = "Value1";
        appData.header[1] = "Value2";
        appData.header[2] = "Value3";

        appData.data[0][0] = 100;
        appData.data[0][1] = 200;
        appData.data[0][2] = 300;
        appData.data[1][0] = 400;
        appData.data[1][1] = 500;
        appData.data[1][2] = 600;

//        for (String h: appData.header) {
//            System.out.print(h);
//        }
//
//        System.out.println();

//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(appData.data[i][j]);
//            }
//            System.out.println();
//        }

        // ЗАПИСЬ ФАЙЛА

        try (FileWriter fileWriter = new FileWriter("767.csv")) {
            for (int i = 0; i < appData.header.length; i++) {
                fileWriter.write(appData.header[i]);
                if (i < appData.header.length - 1) {
                    fileWriter.write(";");
                }
            }
            fileWriter.flush();
            fileWriter.write("\n");

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    fileWriter.write(String.valueOf(appData.data[i][j]));
                    if (j < appData.data[i].length - 1) {
                        fileWriter.write(";");
                    }
                }

                fileWriter.write("\n");
                fileWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ЧТЕНИЕ ФАЙЛА

        try (BufferedReader reader = new BufferedReader(new FileReader("767.csv")))
        {
            String str;
            while ((str = reader.readLine()) != null)
                System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
