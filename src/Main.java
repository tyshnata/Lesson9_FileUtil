import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // Test method "File getFile(String path)"
        FileUtil.getFile("C:\\Users\\windows\\IdeaProjects\\FileUtil\\src\\jjj.txt");
        System.out.println("============================================");

        File file=FileUtil.getFile("C:\\Users\\windows\\IdeaProjects\\FileUtil\\src\\qqq.txt");
        System.out.println(file);
        System.out.println("============================================");

        // Test method "List<String> getFiles(String directoryPath)"
        List<String> list =FileUtil.getFiles("C:\\Users\\windows\\IdeaProjects\\FileUtil\\src");
        for (String f:list) {
            System.out.println(f);
        }
        System.out.println("============================================");

        // Test method "void writeToFile(File file, List<String> text)"
        File fileQ = new File("C:\\Users\\windows\\IdeaProjects\\FileUtil\\src\\qqq.txt");
        List<String> strings=new ArrayList<>();
        strings.add("Test method 'void writeToFile(File file, List<String> text)' from FileUtil. ");
        strings.add("Ok");
        FileUtil.writeToFile(fileQ,strings);
        List<String> listStr2 = FileUtil.readFromFile(fileQ);
        for(String s : listStr2){
            System.out.println(s);
        }
        System.out.println("============================================");

        // Test method "void writeToFile(File file, byte[] info)"
        String string="Test method 'void writeToFile(File file, byte[] info)' from FileUtil. ";
        byte[] info=string.getBytes();
        FileUtil.writeToFile(fileQ,info);
        listStr2 = FileUtil.readFromFile(fileQ);
        for(String s : listStr2){
            System.out.println(s);
        }
        System.out.println("============================================");
    }
}
