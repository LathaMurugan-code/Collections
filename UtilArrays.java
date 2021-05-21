package collectionpackage;
import java.util.Arrays;

public class UtilArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {10,45,8,32,9,5};
		Arrays.sort(a);
		System.out.println("Elements after sorting");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Element found At index "+Arrays.binarySearch(a,5));
        int[]b =Arrays.copyOf(a,3);
        System.out.println("Elements after copied");
        for(int i:b)
		{
			System.out.print(i+" ");
		}
        
	}

}
