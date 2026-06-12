public class task20
{
    public static void main(String[] task20)
    {
    	float a = 4.5f; 
    	float b = 9.5f; 
    	float c =(float)(Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
         
        

        float sina = a/c;
        float cosa = b/c;
        float sinb = b/c;
        float cosb = a/c;

        System.out.print("sin(A)= "+sina+"\ncos(A)= "+cosa+"\nsin(B)= "+sinb+"\ncos(B)= "+cosb);
        

    }
}    
    
 
