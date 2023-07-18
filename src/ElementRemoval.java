import java.util.Arrays;
import java.util.Scanner;

public class ElementRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println(findElementRemoval(array,size));
    }
    public static int findElementRemoval (int array[],int size)
    {
        Arrays.sort(array);
        for(int i=0;i<size/2;i++)
        {
            int temp=array[i];
            array[i]=array[(size-1)-i];
            array[(size-1)-i]=temp;
        }
        int cost=0;
        for(int i=0;i<size;i++)
        {
            cost+=array[i]*(i+1);
        }

        return cost;

    }
}
