import java.io.File;


public class ReadFilesFromFolder {
 

  public static void main(String[] args) {


    File folder1 = new File("C:/Users/akash/Desktop/javasource/java/lang");
     File[] listOfFiles = folder1.listFiles();

    for (int i = 0; i < listOfFiles.length; i++) {
      if (listOfFiles[i].isFile()) {
        System.out.println("File " + listOfFiles[i].getName());
      } else if (listOfFiles[i].isDirectory()) {
        System.out.println("Directory " + listOfFiles[i].getName());
      }
    }
   
  }
}