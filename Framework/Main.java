import java.util.ArrayList;
import java.util.*;
class Main{
	public static void main(String[] args){
		ArrayList<String> languages = new ArrayList<>();

		languages.add("Java"); 
		languages.add("Kotlin");
		languages.add ("C++"); 
		languages.add("C");
		languages.add ("Python");
		languages.add ("ML");
		System.out.println("ArrayList: \n" + languages + "\n");


		ArrayList<String> languages2=new ArrayList<String>();
		languages2.add("Nodejs");
		languages2.add("SQL");
		languages2.add("Flutter");
		languages.addAll(languages2);
		System.out.println("After invoking addAllNewList \n"+languages+ "\n");

	
		System.out.println("Size of ArrayList at creation: " +languages.size() );
		System.out.println("ArrayList: " + languages);

		System.out.println("\nSorted array:");
		Collections.sort(languages);

		for(String lang:languages){
			System.out.print(" " +lang);
		}
		
		String str = languages.get(1);
		System.out.println("Element at index 1: " + str+ "\n");
				
		System.out.println("Changing one element: ");
		languages.set(2, "JavaScript");
		System.out.println("\nModified ArrayList: " + languages+ "\n");


		str = languages. remove (2);
		System.out.println("Updated ArrayList: " + languages+ "\n");
		System.out.println("Removed Element: " + str+ "\n");

		languages.removeAll (languages2);
		System.out.println("After invoking removeAll method: " + languages+ "\n");

		languages.retainAll (languages2);
		System.out.println("After retaining: ");
		System.out.println("First Contains :" + languages);
		System.out.println("Second Contains :" + languages2);
		languages.clear();
		System.out.println("After invoking clear() method: "+languages);
		
		}
}
