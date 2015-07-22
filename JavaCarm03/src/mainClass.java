
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a= "Incommensurabile";
      String b= "Incommensulabile";
      System.out.println("lower case: "+a.toLowerCase()+"\nupper case: "+a.toUpperCase());
      
      System.out.println(a.equals(b));
      
      int[] array= new int[10];
      
      String StrArray[]=new String[10];
      
      System.out.println(array.length);
      
      for(int i=0; i<array.length;i++){
    	  System.out.println(array[i]);
    	  
      }
      
      int valore=10;
      CambiaValore cv=new CambiaValore(valore);
      
      System.out.println(valore);
      


	}

}

/**
 * 
 * 
 */
