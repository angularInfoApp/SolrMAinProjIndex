package Indexing;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FilenameUtils;


public class Test1 {

	public static void main(String[] args) throws IOException {
		
		/*   //text file, should be opening in default text editor
        File file = new File("C:\\newFiles\\word\\new\\dirPagination");
        System.out.println(file);
        
        //first check if Desktop is supported by Platform or not
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);*/
		File file = new File("C:\\newFiles\\word\\latest\\video\\videoform.mp4");
		try
		{
		        Desktop.getDesktop().open(file);
		}
		catch (IOException ex) 
		{
		}
      
        
        
       /* try{
        	String ext = FilenameUtils.getExtension("C:\\newFiles\\data\\docs\\TOC -  Turnover Checklist_Lite Version.xlsx");
        	System.out.println(ext);
        	System.out.println(ext.equals("js"));
        	if(ext.equals("js")){
        		
        		 if ((new File("C:\\Users\\arun_abraham06\\Desktop\\sticky notes.txt")).exists()) {

                     Process p = Runtime
                        .getRuntime()
                        .exec("C:\\Program Files (x86)\\Notepad++\\notepad++.exe C:\\Users\\arun_abraham06\\Desktop\\sticky notes.txt");
                     p.waitFor();

                 } else {

                     System.out.println("File does not exist");

                 }	
        		
        	}
        	else{

            if ((new File("C:\\newFiles\\data\\docs\\TOC -  Turnover Checklist_Lite Version.xlsx")).exists()) {

                Process p = Runtime
                   .getRuntime()
                   .exec("rundll32 url.dll,FileProtocolHandler C:\\newFiles\\data\\docs\\TOC -  Turnover Checklist_Lite Version.xlsx");
                p.waitFor();
                System.out.println("texst");

            } else {

                System.out.println("File does not exist");

            }
        	}
          } catch (Exception ex) {
            ex.printStackTrace();
          }*/
	}

}
