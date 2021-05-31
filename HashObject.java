package collectionpackage;

public class HashObject {
	String Name;
	int Age;
public HashObject(String Name,int Age)
{
	this.Name= Name;
	this.Age = Age;
	
}

/*
 * public boolean equals(Object o) { HashObject t =(HashObject)o;
 * if(this.Age==t.Age) return true;
 * 
 * return false; }
 */
public boolean equals(Object o) 
{ 
	HashObject t =(HashObject)o;
    int result =this.Name.compareTo(t.Name); 
	if(result==0)
	{
		return true;
	}
 
 return false; 
 }

public int hashCode()
{
	return 1;
}

 public String toString()
 { return this.Name+" "+this.Age;
  
  }
 

	
}
