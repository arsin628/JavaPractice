import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.SortedMap;

public class JavaInterviewQ {

	public static void main(String[] args) {
	
		
		//reverse String
		
		String a = "hello java";
		
		String revA = "";
		
		for(int i = a.length()-1; i >= 0 ; i--) {
			
			revA = revA + a.charAt(i);
		}
				System.out.println(revA);
		
		
		
		
	
//Clearing the extra parts of the String	
	
			String b = "hfdjk67&*^&fdfd67f&*f";
				
			String trimedB = b.replaceAll("[^a-zA-Z0-9]", "");
			
			System.out.println(trimedB);
	
	
	//Reversing interger
	
			int x =  45612348 ;
				
			int revx	 = 0;
			
			while(x != 0) {
				
				revx = revx*10 + x%10;
				x = x/10;
			}
			System.out.println(revx);
	
// Finding the missing number from the Array
			
			
			int num[] = { 1,2,3,5,6,7,8};
			
			int sum1 = 0;
			
			for(int i = 0; i < num.length; i++) {
				
				sum1 = sum1  + num[i];
				
			}
			System.out.println(sum1);
			
		int 	sum2 = 0 ;
		
		for(int j = 0 ; j <= num.length +1; j++) {
			
			sum2 = sum2 + j;
		}
		
		System.out.println(sum2 - sum1);
			
			
			
			
			
		
					
					// Finding duplicate object in the array
					
	
		String ar1[] = { "java","ruby" ,"python","C#" , "javascript", "core java","java","C#" };
		
		for(int i = 0; i< ar1.length; i++) {
			
			for(int j = i+1; j< ar1.length;j++){
				
				if(ar1[i].equals(ar1[j])) {
					
					System.out.println(ar1[i]);
				}
			}
		}
		
		//using hashset 
		
		Set<String>	set = new HashSet<String>();
			
			for(String names: ar1) {
				
				if(set.add(names) == false) {
					
					System.out.println(names);
					
					
				}
				
				
			}
		
	}
	
	
}
