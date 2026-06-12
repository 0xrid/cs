public class task02
{
    public static void main(String[] task02)
    {  	
		int j = 1, i;
       for(i= 18;i <63;i+=9)
	   {   
		   System.out.print(i*(int) Math.pow(-1, j + 1)+ ", ");	
			j++;
	   }
			System.out.print(i*(int) Math.pow(-1, j + 1));	
    }
}    
    