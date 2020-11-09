package ge.edu.btu;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("C:\\Users\\99555\\Desktop\\test\\lk.PNG");
        File file_copy = new File("C:\\Users\\99555\\Desktop\\luka\\lk.PNG");


        try (InputStream is =  new FileInputStream(file);
             OutputStream os = new FileOutputStream(file_copy);){


            byte[] buffer = new byte[(int) file.length()];
            is.read(buffer);
            os.write(buffer);
            System.out.println("წარმატებით გადაკოპირდა ფაილი" );

        } catch (Exception e) {
            e.printStackTrace();



        }
        }


    }

