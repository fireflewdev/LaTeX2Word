import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String [] args) {

        String fileName = "in.dat";
        String file = readFile(fileName);

    }
    public static String readFile(String fileName){
        String file = "";
        try {
            FileInputStream inputStream = new FileInputStream(fileName);

            byte[] buffer = new byte[inputStream.available()];

            int total = 0;
            int nRead = 0;
            while((nRead = inputStream.read(buffer)) != -1) {
                file = new String(buffer);
                total += nRead;
            }

            inputStream.close();

            System.out.println("Read " + total + " bytes");
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
        return file;
    }

    /* Ignore the code below */

    /* public static void scan(String in){
        //Scan input
        System.out.println("getting input...");
        String s = "Hello, World!\nmighty fine day it is!\nHere is another line.";
        Scanner input = new Scanner(s);
        String file = "";
        String next = input.nextLine();
        file += next+"\n";
        System.out.println("putting input to string...");
        while(input.hasNextLine()){
            next = input.nextLine();
            file+=next+"\n";
        }
        System.out.println("done!");
        System.out.print(file);
    } */
}