import java.io.File;
import java.util.function.Predicate;

public class FolderActions {

    // 1. Create Folder
    public static void CreateFolder(String folderPath){
        File folder = new File(folderPath);
        if(!folder.exists()){
            folder.mkdir();
            System.out.println("Folder Created... "+folderPath);
        }
    }

   // 2. Check folder is Exist or Not
   public static String FolderExistOrNot(String folderPath){
       File folder = new File(folderPath);
       boolean exists = folder.exists();
       return exists ? "File Already exist.. "+folderPath: "File not exist..";
   }

   // 3. Update Folder Name
     public static String UpdateFolderName(String oldFolderPath,String newFolderPath){
        File oldFolder = new File(oldFolderPath);
        File newFolder = new File(newFolderPath);
        return oldFolder.exists()
                ? (oldFolder.renameTo(newFolder) ? "File name Renamed.. "+newFolderPath: "Rename Failed")
                : "File does Not Exist...";
     }

   // 4. Delete Folder
    public static String DeleteFolder(String folderPath){
        File folder = new File(folderPath);
        return folder.exists() ?
                (folder.delete() ? "File deleted Successfully.. "+folderPath: "Deletion Failed..!")
                : "Folder not Exist..";
    }

    public static void main(String[] args) {
        String folderPath = "/Users/mannu/Desktop/FileHandling/MyFiles";
        FolderActions.CreateFolder(folderPath);

        String msg1 = FolderActions.FolderExistOrNot(folderPath);
        System.out.println(msg1);

        String newFolderPath = "/Users/mannu/Desktop/FileHandling/myFiles";
        String msg2 = FolderActions.UpdateFolderName(folderPath, newFolderPath);
        System.out.println(msg2);


//        String msg3 = FolderActions.DeleteFolder(folderPath);
//        System.out.println(msg3);

    }


}
