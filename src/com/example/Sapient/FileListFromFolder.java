package com.java.File;

import java.io.File;

//How to get list of all file objects from a folder in java? 
/*Description:

Below example shows how to get list of all file objects from the given folder. 
First create File object by passing folder path.
 Call listFiles() method on file object to get list of file names in the given folder.
*/


  public class FileListFromFolder {
     
    public static void main(String a[]){
       // File file = new File("C:/MyFolder/");
       // G:\ANDROID_STUDY_MATERIAL\Content Providers
        File file = new File("G:/ANDROID_STUDY_MATERIAL/Content Providers/");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
    }
}
