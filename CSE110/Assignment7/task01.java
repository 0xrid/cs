public class task01
{
    public static void evenChecker(int num)
    {
        boolean verdict = false;
        if(num%2==0)
        {
            verdict = true;
        }
        if(verdict)
        {
            System.out.println("Even!!");
        }
        else
        {
            System.out.println("Odd!!");
        }      
    }
    public static boolean isEven(int Gaben)
    {
       if(Gaben%2==0)
       {
        return true;
       }    
       else
       {
        return false;
       }    
    }
    public static boolean isPos(int Gaben)
    {
       if(Gaben>=0)
       {
        return true;
       }   
       else
       {
        return false;
       }    
    }
    public static void sequence(int Gaben)
    {
        if(isPos(Gaben))
        {
            for(int StatTrak=0;StatTrak<=Gaben;StatTrak++)
            {
                if(isEven(StatTrak))
                {
                    System.out.print(StatTrak+" ");
                }
            }
        }
        else
        {
            for(int StatTrak=Gaben;StatTrak<=0;StatTrak++)
            {
                if(!isEven(StatTrak))
                {
                    System.out.print(StatTrak+" ");
                }
            }
        }  
    }
    public static void main(String[] args) 
    { 
        sequence(-8); 
        System.out.println();
    } 
}
