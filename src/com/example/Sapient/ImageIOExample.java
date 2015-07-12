package com.example.Sapient;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;


public class ImageIOExample {    

    public static void main( String[] args ){
      imageIoWrite();
    }
    
    public static void imageIoWrite() {
    	 BufferedImage bImage = null;
         try {
             File initialImage = new File("C://Users/Rou/Desktop/image.jpg");
             bImage = ImageIO.read(initialImage);

             ImageIO.write(bImage, "gif", new File("C://Users/Rou/Desktop/image.gif"));
             ImageIO.write(bImage, "jpg", new File("C://Users/Rou/Desktop/image.png"));
             ImageIO.write(bImage, "bmp", new File("C://Users/Rou/Desktop/image.bmp"));

         } catch (IOException e) {
               System.out.println("Exception occured :" + e.getMessage());
         }
         System.out.println("Images were written succesfully.");
    }

}