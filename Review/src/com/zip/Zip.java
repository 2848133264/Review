package com.zip;

import java.io.File;
import java.util.zip.ZipOutputStream;

public class Zip {
	/**
	 * 涉及到压缩文件，解压文件，API
	 * Zip，用到的是java.util.zip 这个包。
	 * ZipFile、ZipoutputStream\zipInputstream \ zipEntry 的几个类
	 * 
	 * ZipOutPutStream 是压缩文件的；
	 * 
	 * ZipinputStream 和 zipFile 是用来解压文件，在解压和压缩的过程中会使用到这个ZipEntry，在java的zip压缩文件中，每一个子文件都是一个ZipEntry对象。
	 * 
	 * 
	 */
	//压缩文件
	/*public static void zipFile(File inFile,ZipOutputStream zipOutputStream){
		
		if(inFile.isDirectory()){
			File[] files =inFile.listFiles();
			for (File file : files) {
				//如果是目录就递归的压缩
				zipFile(file, zipOutputStream);
			}
 		}
		
	}*/

}
