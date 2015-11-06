import java.util.Arrays;
import java.util.Scanner;

public class _15RecursiveBinarySearch {

	public static void main(String[] args) {
		
		int target = 8;
		int[] numbers ={4,4,4,4,4,8,8,8};
		//int[] numbers ={1,2,3,4,5};
		Arrays.sort(numbers);
		int index=binarySearch(numbers,0,numbers.length,target);
        System.out.print(index);
	}
	public static int binarySearch(int[] arr,int startIndex,int endIndex, int target){
		int targetIndex = -1;
		
		int middleIndex = (startIndex + endIndex)/2;
		int middle = arr[middleIndex];
		if(startIndex < endIndex){
			if(target == middle){
				if((middle == arr[middleIndex-1])){
					if((middleIndex-1)==0){
						targetIndex = 0;
					}
					else{
						targetIndex = binarySearch(arr, 0, middleIndex, target);
					}
				}
				else{
						targetIndex = middleIndex;
				}
			}
			
			if (target > middle){
				targetIndex = binarySearch(arr, middleIndex +1,endIndex, target);
			}
			if (target < middle){
				targetIndex = binarySearch(arr, 0, middleIndex -1, target);
			}
		}
		return targetIndex;
	}
	
}
