
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IteratorReplacerRunner {

	public static void main(String[] args) throws FileNotFoundException {
		File a = new File("IteratorReplacer"); 
		Scanner doc= new Scanner(a); 
		String line= "";  
		String input="";  
		IteratorReplacer test=null;  
		while(doc.hasNextLine()) { 
			line=""; 
			input="";
		String[] words =doc.nextLine().split(" ");  
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(words)); 
		for(int i=0;i<list.size()-9;i++) {  input+=list.get(i); }  
	    
	    test = new IteratorReplacer(input,list.get(list.size()-5),list.get(list.size()-1)); 
        System.out.println(test.toString()); 
	} 
	} 

} 
 