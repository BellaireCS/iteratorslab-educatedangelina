//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Iterator;

import static java.lang.System.*;

public class IteratorReplacer
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public IteratorReplacer(String line, String rem, String rep)
	{ 
		setEmAll(line,rem,rep); 
	}

	public void setEmAll(String line, String rem, String rep)
	{  list = new ArrayList<String>(); 
		for(int i=0;i<line.length();i++) { list.add(line.substring(i,i+1));}   
	   toRemove=rem; 
	   replaceWith=rep;
	}

	public void replace()
	{  ListIterator  ita = list.listIterator();
		while(ita.hasNext()) { 
			String line = (String) ita.next(); 
			if(line.equals(toRemove)) {  
				 ita.set(replaceWith);
			}
		}
	}

	public String toString()
	{ replace(); 
		return list.toString()+"\n\n";
	}
} 
