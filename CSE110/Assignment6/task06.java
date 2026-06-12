import java.util.Scanner;
public class task06
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        double[] nArr = new double[x.nextInt()];
        for(int StatTrak=0; StatTrak<nArr.length; StatTrak++)
        {
            System.out.print("Enter a number: ");
            nArr[StatTrak] = x.nextDouble();
        }
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        int maxIndex=-1,minIndex=-1;
        for(int StatTrak=0; StatTrak<nArr.length; StatTrak++)
        {
            if(nArr[StatTrak]>max)
            {
                max=nArr[StatTrak];
                maxIndex=StatTrak;
            }
            if(nArr[StatTrak]<min)
            {
                min=nArr[StatTrak];
                minIndex=StatTrak;
            }
            sum +=nArr[StatTrak];
        }
        System.out.print("Maximum element "+ max +" found at index "+maxIndex+" \nMinimum element "+min+" found at index "+minIndex+"\nSummation: "+sum+"\nAverage: "+sum/nArr.length);
    }
}