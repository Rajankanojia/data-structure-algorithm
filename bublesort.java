
public class bublesort {
public static void RajanSort(int arr[]) {
	int n = arr.length; //this line is used for to get the length of the array
	int temp = 0;// initializing the variable temp for swapping
	for(int i=0; i<n;i++) // we are running 2 loops for the array 1st is i and 2nd is j 
	{
		for(int j=1; j<(n-i); j++) {
			if(arr[j-1]>arr[j]) {
				temp = arr [j-1]; // j-1 is the previous position of the jth position which will now storein temp
				arr[j-1] = arr[j]; // now j th value is given to j-1
				arr[j]=temp; // now j-1 value is fetch and stored at the jth location
			}
		}
	}
}
public static void main(String args[]) {
	int arr[] = {5,8,45,3,54,8,3,5,31,4,21,2,5,1}; //hardcode 
	System.out.print("Before  bubble sorting:");
	for(int i=0;i<arr.length;i++) {
		System.out.print(" " +arr[i]); //loop for printing array 
	}
	System.out.println(); // print statement for printing it on nextline; 
	RajanSort(arr);
	System.out.print("After bubble sorting:");
	for(int i=0;i<arr.length;i++) {
		System.out.print(" "+arr[i]);////loop for printing array 
	}
}
}
