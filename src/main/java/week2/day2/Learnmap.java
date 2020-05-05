package week2.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Learnmap {

	public static void main(String[] args) {
	
Map<String,Integer> map1=new HashMap<String,Integer>();
map1.put("id1", 101);
map1.put("id2", 102);
map1.put("id3", 103);
map1.put("id4", 104);
map1.put("id5", 105);
map1.put("id6", 106);
map1.put("id7", 107);
map1.put("id8", 108);

System.out.println(map1);
Integer getvalue=map1.get("id3");
System.out.println(getvalue);

if(map1.containsKey("id4"))
{
	System.out.println("the given id is present");
}
if(map1.containsValue(106))
{
	System.out.println("the given value is present");
}
if(map1.isEmpty())
{
	System.out.println("no contents");
}
else
{
	System.out.println("key-value pair");
}
/*if(map1.equals(102))
{
	System.out.println("hi understood" );
	
}*/

map1.remove("id1", 101);

if(map1.containsValue(101))
{
	System.out.println("removed");
}



map1.replace("id4", 104, 113);

if(map1.containsValue(113))
{
	System.out.println("replaced");
}

map1.replace("id6", 156 );

if(map1.containsValue(156))
{
	System.out.println("replaced");
}


//internal server error..we cant do like this
/*Integer removedvalue=map1.remove(156);

if(removedvalue!=null) {
	System.out.println(removedvalue+ "is removed");	
}*/


//entryset
Set<Map.Entry<String,Integer>> entries=map1.entrySet();
for(Map.Entry<String,Integer> each:entries)
{
	String identity=each.getKey();
	Integer number=each.getValue();
	
	System.out.println(identity+"......" +number);
}

//foreach
//map1.forEach((identity,number)->System.out.println(identity+"......" +number));

map1.clear();
if(map1.isEmpty())
{
	System.out.println("deleted");
}






	}

}
