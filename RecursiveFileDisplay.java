package parser;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import object.Java;
import utils.FileUtils;

public class RecursiveFileDisplay {

	static int folderCount = 0;
	static int fileCount = 0;
	static Java response = new Java();

	public static void main(String[] args) throws IOException {
		// File currentDir = new File("."); // current directory
		
		String currentDir = "C:/Users/myworld/Desktop/java/";
		displayDirectoryContents(new File(currentDir));
		System.out.println("Total Folders : " + folderCount);
		System.out.println("Total Files :" + fileCount);
		

	}

	public static void displayDirectoryContents(File dir) throws IOException {

		File[] files = dir.listFiles();

		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println("directory:" + file.getName());
				folderCount = folderCount + 1;
				displayDirectoryContents(file);
			} else {
				System.out.println("     file:" + file.getName());
				fileCount = fileCount + 1;

				/*FileUtils.writeFile("C:/Users/myworld/Desktop/meta.txt",
						file.getName() + "--->" + file.toURI() + "--->" + file.length() / 1024 + "KB" + "--->"
								+ "fields:"  + listFields(file.getClass()) + "--->"  
								+ "Methods:" + listMethods(file.getClass()));*/
				
				response = new Java();
				response.setFields(listMethods(file.getClass()).toString());
				response.setMethods(listFields(file.getClass()).toString());
				response.setFilePath(file.toURI().toString());
				response.setSize(file.length() / 1024 + "KB");
				response.setFilename(file.getName());
				
				FileUtils.writeFile("C:/Users/myworld/Desktop/meta.js", response.toString());
			}
		}

	}

	public static <T> Integer listFields(Class<T> clazz) {

		Field[] allFields = clazz.getDeclaredFields();
		return allFields.length;

	}

	public static <T> Integer listMethods(Class<T> clazz) {

		Method[] allMethods = clazz.getDeclaredMethods();
		return allMethods.length;

	}

}
