package oop;

import java.io.*;

public class JavaIONew {
    public static void main(String[] args) {


        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("Directory/input.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("Directory/output.txt", true));
            int nextChar;
            while ((nextChar = bufferedReader.read()) != -1) {
                System.out.println(nextChar);
                bufferedWriter.append((char) nextChar);
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}