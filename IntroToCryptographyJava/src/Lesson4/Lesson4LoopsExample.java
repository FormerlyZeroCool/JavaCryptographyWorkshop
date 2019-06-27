package Lesson4;

public class Lesson4LoopsExample {

	public static void main(String[] args)
	{
		   // sometimes you need to repeat code with tweaks
	    // especially when you're accessing elements in an array

	    // you can do this if you want, but its very inefficient
	    int arr[] = {1, 2, 3};

	    System.out.println(arr[0]);
	    System.out.println(arr[1]);
	    System.out.println(arr[2]);
	    System.out.println();
	    System.out.println();

	    arr[0] = arr[0] + 1; 
	    arr[1] = arr[1] + 1;
	    arr[2] = arr[2] + 1;

	    System.out.println(arr[0]);
	    System.out.println(arr[1]);
	    System.out.println(arr[2]);

	    System.out.println();
	    System.out.println();

	    // You can clearly see that code is repeated with minor 
	    // changes. We have something called loops for situations like this

	    // In for loops, within the brackets you usually do 3 things:
	    // 1) declare your iterator variable (i in the below example)
	    // 2) indicate when the loop should stop using a boolean expression
	    // 3) indicate what statement to run at the end of each iteration.
	    
	    // below, i is our iterator. We want the loop to keep going until 
	    // i is greater than or equal to 3 and then we want to increment i
	    // at the end of each iteration.
	    // therefore, because i starts at 0 and is incremented on each iteration,
	    // it will take 3 iterations before i is equal to 2 and the loop stops.
	    // this means that the code within the loop (within the curly brackets)
	    // will run 3 times
	    for (int i = 0; i<3; i++){

	    	System.out.println("The current value of i (our iterator) is: " + i);
	    }

	    System.out.println();
	    System.out.println();
	    // we can utilize loops to iterate over arrays. Below adds 5 to all the 
	    // elements or the array 'arr'

	    // sizeof returns the size of the element. In the case of an array, it returns
	    // the total size of the array. The total size of the array is essentially the
	    // size of a single element multiplied by the number of elements.
	    // to get the number of elements, you do the reverse

	    for (int i=0; i<arr.length; i++){
	    	System.out.println("The current value of the iterator i is: " + i);
	    	System.out.println("The current value of arr at index " + i + " is: " + arr[i]);
	        arr[i] = arr[i] + 5;
	        System.out.println("After modification the value of arr at index " + i + " is: " + arr[i]);    
	        System.out.println();
	    }
	}
}
