package org.read.file;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class ReadingTextFiles {
	public static void main(String[] args)   {
		File f = new File("C:\\Users\\Parthi Rajan\\Desktop\\parthi.txt");
		
		try {
			 List<String> r= FileUtils.readLines(f);
				System.out.println(r);

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
