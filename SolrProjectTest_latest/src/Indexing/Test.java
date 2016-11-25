package Indexing;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Test {
	
	
	static int counts=0;
	
	
	

	public static void main(String[] args) throws IOException {
		
			
		/* String text = "how hellohello hello how ;how are, you how how how how";
		    String query = "how hello";
		    	
		    String[] words = text.split(" ");
		    
		 
		    List<String> wordsList = Arrays.asList(words);
		    System.out.println(wordsList);
		    String[] matches = query.split(" ");
		    for (String match : matches) {
		        System.out.println(match + " occurs " + Collections.frequency(wordsList, match) + " times");
		        counts++;
		        System.out.println(counts);
		        
		    }
		System.out.println("counts: "+counts);*/
		
		
		/*
		String str = "for every complex problem for every complex problem";
		String findStr = "";
		List<Integer> sum=new ArrayList<Integer>();
		List<String> items = new ArrayList<String>(Arrays.asList(findStr.split(" ")));
		items.add(findStr);
		int sums=0;
		for(int i=0;i<items.size();i++){
			//System.out.println(items.get(i));
			String indexWord=items.get(i);
			int lastIndex = 0;
			int count = 0;
			while(lastIndex != -1){
			    lastIndex = str.indexOf(indexWord,lastIndex);
			    if(lastIndex != -1){
			        count ++;
			        lastIndex += indexWord.length();
			    }
			    
			}
			System.out.println("Count for word "+indexWord+" is : "+count);
			sum.add(count);

			 sums = sum.stream().mapToInt(Integer::intValue).sum();
			
		
	}
		System.out.println(sums);	*/
		
		
		
		String str = "for every complex problem";
		String findStr = "Complex problem";
		
		int lastIndex = 0;
		int count = 0;
		while(lastIndex != -1){

		    lastIndex = str.indexOf(findStr,lastIndex);

		    if(lastIndex != -1){
		        count ++;
		        lastIndex += findStr.length();
		        //System.out.println("a");
		    }
		}
		System.out.println(count);
		

		   

	}

}
