import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileUtil {

    public static File getFile(String path){
        File file = new File(path);
        if (file.isFile()){
            return file;
        }
        System.out.println("Файл не найден.");
        return null;
    }

    public static List<String> getFiles(String directoryPath){
        File directory=new File(directoryPath);
        List<String> files =new ArrayList<>();
        if (directory.isDirectory()){
            for (String f: directory.list()){
                files.add(f);
            }
        }
        return files;
    }

    public static List<File> listFilesFromDir(String dirPath){
        File directory=new File(dirPath);
        List<File> files =new ArrayList<>();
        if (directory.isDirectory()){
            for (File f: directory.listFiles()){
                files.add(f);
            }
        }
        else {}
        return files;
    }

    public static void writeToFile(File file, List<String> text){
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter= new FileWriter(file);
            bufferedWriter= new BufferedWriter(fileWriter);
            for (String str: text   ) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> readFromFile(File file){
        List<String> fileText=new ArrayList<>();
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader=new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            if (file.isFile()){
                while ((line=bufferedReader.readLine())!=null){
                    fileText.add(line);
                }
            }
            else {
                System.out.println("Файл не найден.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileText;
    }

    public static void writeToFile(File file, byte[] info){
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter= new FileWriter(file);
            bufferedWriter= new BufferedWriter(fileWriter);
            for (byte b:info) {
                bufferedWriter.write(b);
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    }
