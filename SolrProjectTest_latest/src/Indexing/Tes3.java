package Indexing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Arrays;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class Tes3 {

	public static void main(String[] args) throws IOException, SAXException, TikaException {
		
		
		/* Path path = new File("C:\\Users\\arun_abraham06\\Desktop\\mongo.pdf").toPath();
		
		 long time = System.currentTimeMillis();
		    FileTime fileTime = FileTime.fromMillis(time);
		 Files.setAttribute(path, "basic:Name", "mongodb.pdf");
		 System.out.println(Files.getAttribute(path, "Name"));*/
	/*	File file=new File("mongo.pdf");
				System.out.println(file.getPath());
		*/
		 
		 //create a file object and assume sample.txt is in your current directory
	      File file = new File("C:\\Users\\arun_abraham06\\Desktop\\mongo.pdf");

	      //Parser method parameters
	      Parser parser = new AutoDetectParser();
	      BodyContentHandler handler = new BodyContentHandler();
	      Metadata metadata = new Metadata();
	      FileInputStream inputstream = new FileInputStream(file);
	      ParseContext context = new ParseContext();

	      //parsing the document
	      parser.parse(inputstream, handler, metadata, context);

	      //list of meta data elements before adding new elements
	      System.out.println( " metadata elements :"  +Arrays.toString(metadata.names()));

	      //adding new meta data name value pair
	    //  metadata.add("Field","IT");
	     // metadata.set("Fields", "IT_Industry");
	      System.out.println(" metadata name value pair is successfully added");
	      
	      //printing all the meta data elements after adding new elements
	      System.out.println("Here is the list of all the metadata elements  after adding new elements ");
	      System.out.println( Arrays.toString(metadata.names()));
	      String[] metadataNames = metadata.names();
	      for(String name : metadataNames) {		        
	          System.out.println(name + ": " + metadata.get(name));
	       }
	}

}
