package Indexing;

public class Test4 {

	
	public static void main(String[] args){
		
		
		
		String hello="/@@@@@@@@@@@@soft skills study material info#$%@@sys global agile developer certification disclaimer the.............................................................................................................. 6 3.2 transforming from a traditional project team member to agile project team member";
		String subs=hello.substring(0,15);
		System.out.println(subs);
		String changed=hello.substring(0,15).replace("[$&+/,:;=%?@#|]+","");
		System.out.println(changed);
		
		/*  String strings = "@soft skills study material infosys global agile developer certification disclaimer the";
	      	Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
	  		System.out.println(strings.substring(0,1));
	      	Matcher matcher = pattern.matcher(strings.subSequence(0, 1));
	      	System.out.println(!matcher.matches());*/
	}
}
	

