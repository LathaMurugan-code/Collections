package collectionpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntryMap {
	String Name;
	int Id;
	int Salary;
	public EntryMap(String Name,int Id,int Salary)
	{
		this.Name= Name;
		this.Id=Id;
		this.Salary= Salary;
		
	}
	public String toString()
	{
		return this.Name+" "+this.Id+" "+this.Salary;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntryMap e = new EntryMap("Latha",201,25000);
		EntryMap e2 = new EntryMap("Raja",202,25000);
		EntryMap e3 = new EntryMap("vidhu",203,25000);
		EntryMap e4 = new EntryMap("Vimal",204,25000);
				
		HashMap h = new HashMap();
		h.put(1, e);
		h.put(2, e2);
		h.put(3, e3);
		h.put(4, e4);
		System.out.println(h);
		//viewed as entries-key and values objects
		Set s=h.entrySet();
		Iterator i =s.iterator();
		
		
		 while(i.hasNext()) 
		 { 
		  Map.Entry m =(Map.Entry)i.next();
		  System.out.println(m.getKey());
		  System.out.println(m.getValue());
		  }
		  
		while(i.hasNext())
		{
			Map.Entry m =(Map.Entry)i.next();
			
			if(m.getKey().equals(3))
			{
				EntryMap et = new EntryMap("SriVidya",203,25000);
				m.setValue(et);
				}
		}
		System.out.println("After correction "+h);

	}

}
