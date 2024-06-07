import java.util.Arrays; 

public class Arraysoncomp { 
	public static void main(String[] args) 
	{ 

		// Get the Array 
		int intArr[] = { 10, 20, 15, 22, 35 }; 

		// Get the second Array 
		//int intArr1[] = { 10, 15, 22 }; 
        Arrays.sort(intArr,1,3);

		// To compare both arrays 
		//System.out.println("Integer Arrays on comparison: "
						//+ Arrays.compare(intArr, intArr1));
                        
        System.out.println("sorted array"+Arrays.toString(intArr));
	} 
}
