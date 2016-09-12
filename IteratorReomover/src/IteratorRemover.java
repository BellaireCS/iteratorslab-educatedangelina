//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	public IteratorRemover(String line, String rem)
	{ 
		setTest(line, rem); 
	}

	public void setTest(String line, String rem)
	{  list=new ArrayList<String>(); 
		for(int i=0;i<line.length();i++) { list.add(line.substring(i,i+1));}  
		toRemove= rem; 
	}

	public void remove()
	{ 
		Iterator ita= list.iterator(); 
		
		while(ita.hasNext()) { 
			String line = (String) ita.next();  
			 
			if(line.equals(toRemove)) { 
				ita.remove(); 
				
			}
			
		}
	}

	public String toString()   
	{  remove(); 
		String[] words =new String[list.size()]; 
		for(int i=0;i<list.size();i++) { words[i]= list.get(i);}   
		
		return Arrays.toString(words);
	}
} 
