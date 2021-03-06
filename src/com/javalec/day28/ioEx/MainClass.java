package com.javalec.day28.ioEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Project: wizEx
 * FileName: MainClass
 * Date: 2015-05-06
 * Time: 오전 11:23
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {

        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream("C:\\Users\\sklee\\IdeaProjects\\wizEx\\jain.txt");
            os = new FileOutputStream("C:\\Users\\sklee\\IdeaProjects\\wizEx\\jaout.txt");
            while (true) {
                int i = is.read();
                if (i == -1) break;
                os.write(i);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e2) {
                    System.out.println(e2.getMessage());
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e2) {
                    System.out.println(e2.getMessage());
                }

            }
        }
    }
}
