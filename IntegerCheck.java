package numbergame;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class IntegerCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int [][] num = {{10,20,30,40,40 },{20,30,60,70,80},{40,30,20,90,15}};
  HashMap <Integer,Integer>h = new HashMap<Integer,Integer>();
   for(int i=0;i<3;i++)
			
	{
	for(int j=0;j<5;j++)
		{
		 if(h.containsKey(num[i][j])!=true)
		 {
			 h.put(num[i][j],1);
		 }
		 else
		 {
			 int val = h.get(num[i][j]);
			 h.put(num[i][j],val+1);
		 }
				
			}
		}

   Set<Entry<Integer, Integer>> s = h.entrySet();
   //getting when we give it as Map.Entry
   for(Entry<Integer,Integer> entry:s)
   {
	   if(entry.getValue()==3)
	   {
		   System.out.println("No repeats in 3 rows are "+entry.getKey());
	   }
	   
   }
   

	}

}
