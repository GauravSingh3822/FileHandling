import java.io.*;
import java.util.Scanner;

public class FileActions {

    // 1. Create File
   public static String CreateFile(String filePath) throws IOException {
       File file = new File(filePath);
       return file.createNewFile() ? "File Created..."+filePath : "File Already Exist..";
   }

    // 2. Check file is Exist or Not
   public static String FileExistOrNot(String filePath){
       File file = new File(filePath);
       return file.exists() ? "File Already exist.. "+filePath: "File not exist..";
   }
   // 3. Write File
    public static void WriteFile(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write("Welcome to Java File Handling...");
        fileWriter.close();
        System.out.println("File written successfully...");

    }

    // 4. Read File
    public static void ReadFile(String filePath) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filePath);
        Scanner scanner = new Scanner(fileReader);
        while(scanner.hasNextLine()){
            String data = scanner.nextLine();
            System.out.println(data);
        }
    }

    // 5. Update File Name
    public static String RenameFile(String oldFilePath,String newFilePath){
       File oldFile = new File(oldFilePath);
       File newFile = new File(newFilePath);
       return oldFile.renameTo(newFile) ? "File Renamed Successfully.." : "File not Renamed..";
    }
    // 6. Delete File
    public static  String FileDeleteFile(String filePath){
       File file = new File(filePath);
       return file.delete() ? "File Deleted Successfully.." : "File not Deleted..";
    }

    public static void main(String[] args) throws IOException {
        String folderPath = "/Users/mannu/Desktop/FileHandling/MyFiles/User.txt";
        String createFile = FileActions.CreateFile(folderPath);
        System.out.println("====================================================================");
        System.out.println(createFile);
        System.out.println("====================================================================");
        String fileExistOrNot = FileActions.FileExistOrNot(folderPath);
        System.out.println(fileExistOrNot);
        System.out.println("====================================================================");
        FileActions.WriteFile(folderPath);
        System.out.println("====================================================================");
        FileActions.ReadFile(folderPath);
        System.out.println("====================================================================");
        String renameFile = FileActions.RenameFile(folderPath, "/Users/mannu/Desktop/FileHandling/MyFiles/User1.txt");
        System.out.println(renameFile);
        System.out.println("====================================================================");
        String filePath = "/Users/mannu/Desktop/FileHandling/MyFiles/User1.txt";
        String deleteFile = FileActions.FileDeleteFile(filePath);
        System.out.println(deleteFile);

    }
}

