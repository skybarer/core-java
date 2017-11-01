package utils;

import java.io.File;
import java.io.IOException;

public class RecursiveFileReader {
	
	public void displayDirectoryContents(File dir) throws IOException {

		File[] files = dir.listFiles();

		for (File file : files) {
			if (file.isDirectory()) {
				System.out.println("directory:" + file.getName());
				
				displayDirectoryContents(file);
			} else {
				System.out.println("     file:" + file.getName());
				

				/*FileUtils.writeFile("C:/Users/myworld/Desktop/meta.txt",
						file.getName() + "--->" + file.toURI() + "--->" + file.length() / 1024 + "KB" + "--->"
								+ "fields:"  + listFields(file.getClass()) + "--->"  
								+ "Methods:" + listMethods(file.getClass()));*/
				
			
			}
		}

	}

}
