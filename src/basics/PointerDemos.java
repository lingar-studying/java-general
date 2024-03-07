package basics;

public class PointerDemos {
	
	public static void main(String[] args) {
		System.out.println("Array pointers: ");
		
		int[] arr1 = {1,2,3};//
		int x = arr1[0];
		
		int[] arr2 = arr1;
		
		arr1[0] = 6;
		
		for(int i : arr1) {
			System.out.println("Arr1 " + i );//pointer
		}
		
		for(int i : arr2) {
			System.out.println("Arr2 " + i );//pointer 
		}
		
		System.out.println("x = " + x);//not pointer
		int y = x;//not pointer 
		
		y = 20;
		x=10;
		System.out.println("x = " + x);
		
		System.out.println("y = " + y); 
		
		//data primitive types aren't pointer. 
		
		//but the array elements can be primitives, so they will be pointers. 
		
		int[] arr3 = new int[3];//not pointer - data primitive //
		arr3 [0] = arr1[0];
		
		arr1[0] = 100;
		
		System.out.println("arr3 [0] = " + arr3[0]);


	}

}
