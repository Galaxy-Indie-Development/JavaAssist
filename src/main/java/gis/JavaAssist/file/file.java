package gis.JavaAssist.file;

import java.io.*;

/**
 * @author Zachary Nichelson
 * Created on 6/16/22
 * @description File class uses the natural Java FileReader, FileWriter and PrintWriter Classes.
 */
public class file {
    public file(){

    }

    /**
     *
     * @param fr The FileReader instance you would like to use
     * @param ch 0 to -1 -- Uses FileReader class that uses an int from 0 to -1 to detect the end of a file
     * @param path path of the file you would like to read
     */
    public void read(FileReader fr, int ch, String path){
        try
        {
            fr = new FileReader(path);
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }

        // read from FileReader till the end of file
        while (true) {
            try {
                if (!((ch=fr.read())!=-1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print((char)ch);
        }

        // close the file
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param path This is the path to the file you would like to write to. -- Uses the FileWriter Class
     * @param txt Txt you would like to write to the file at the path -- Uses the PrintWriter Class
     * @param isAppended Would you like the text at the beginning or end of the file -- Uses the FileWriter Class
     */
    public void write(String path, String txt, boolean isAppended){
        try {
            FileWriter fw = new FileWriter(path, isAppended);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(txt);

            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
