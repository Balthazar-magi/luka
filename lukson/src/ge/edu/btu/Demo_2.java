package ge.edu.btu;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

//class  WordFilter implements FilenameFilter {
//
//    @Override
//    public boolean accept(File dir, String name) {
//        return name.toLowerCase().startsWith("app");
//    }


public class Demo_2 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\99555\\Desktop\\test");

        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.length() > 0;
            }
        });
        for(File currentFile : files) {
            System.out.println(currentFile.getName() + " " + currentFile.length());
        }


    }

        }
