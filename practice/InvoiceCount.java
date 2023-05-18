package practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceCount {	
	     	       
public static void main(String[] args) 
  {
	 String[] arrayString = {"'01772201'","'01797201'","'01798901' (EDI)","'01802902'","'01803801'","'01806901'","'01816501'","'01818401'","'01818801' (EDI)","'01819101'","'01820201'","'01820301'","'01822401'","'01824101'","'01824701' (EDI)","'01825301' (EDI)","'01826401'","'01826701'","'01826902'","'01836101' (EDI)","'01836201'","'01836701'","'01838501'","'01839701'","'01841001'","'01841701'","'01844601'","'01848901'","'01849201' (EDI)","'01849301' (EDI)","'70047001'"};
	    
	
	 int count = 0;
	 List<String> remainingNumber = new ArrayList<String>();
	    	        
	 for (String str : arrayString) 
	 {
	   if (!str.contains("(EDI)")) 
	   {
	    	remainingNumber.add(str);
            count++;
	   }
     }
     System.out.println("Total are " + remainingNumber.size() + ", EDI= " + (arrayString.length - count));
	 System.out.println("Remaining numbers: " + remainingNumber);
	
	 
  }
	     
}
