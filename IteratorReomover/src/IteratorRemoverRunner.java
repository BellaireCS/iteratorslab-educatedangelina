import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IteratorRemoverRunner {
public static void main(String[] args ) throws FileNotFoundException { 
	File a = new File("IteratorRemover.txt"); 
	Scanner doc= new Scanner(a);  
	String line= "";  
	String input="";  
	IteratorRemover test = null; 
	while(doc.hasNextLine()) {  
		input=""; 
		
		String[] words =doc.nextLine().split(" ");  
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(words)); 
		for(int i=0;i<list.size()-4;i++) {  input+=list.get(i); }  
		 
        test = new IteratorRemover(input,list.get(list.size()-1)); 
        System.out.println(test.toString()); 
      
		
	}
	
}
}