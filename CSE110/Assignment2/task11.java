import java.util.Scanner;
public class task11
{
    public static void main(String[] task11)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("The customer need to pay(Taka): ");
        int need_to_pay = x.nextInt();
        System.out.print("Customer gave(Taka): ");
        int Customer_gave = x.nextInt();
        x.close();
        int diff = Customer_gave-need_to_pay;
        int diff2 = diff;
        int hundred=0, fifty =0, twenty=0, ten =0, five=0, two=0, one=0;
        if (diff==0)
        {
        	System.out.print("No returns :D");
        } 
        else if(diff<0)
        {
        	System.out.print("Please pay "+Math.abs(diff)+" taka more");
        }
        if(diff>0)
        {	
        	System.out.println("The returned amount is: "+diff+" taka");
        	while (diff > 0) 
        	{
            	if (diff >= 100) 
            	{
                	diff -= 100;
                	hundred++;
            	} 
            	else if (diff >= 50) 
            	{
            	    diff -= 50;
           		    fifty++;
           	    } 
            	else if (diff >= 20) 
           		{
            	    diff -= 20;
            	    twenty++;
            	} 
            	else if (diff >= 10) 
            	{
            	    diff -= 10;
            	    ten++;
            	} 
	           	else if (diff >= 5) 
	            {
           	        diff -= 5;
           	        five++;
           		} 
           		else if (diff >= 2) 
           	 	{
           	   		diff -= 2;
           	  	    two++;
        	    } 
        	    else if (diff >= 1) 
        	    {
        	        diff -= 1;
        	        one++;
       		    } 
        	    else 
        	    {
                	break;
                	
         	    }
       		}
        }       
        if(diff2>0)
        {
        	System.out.print("100 taka note: "+hundred+"\n50 taka note: "+fifty+"\n20 taka note: "+twenty+"\n10 taka note: "+ten+"\n5 taka coin: "+five+"\n2 taka coin: "+two+"\n1 taka coin: "+one);
        }       
    }
}    
    
 
