package arrayDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];//declaration and instantiation  
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		//traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]);  
		
		
		int a2[]={33,3,4,5};//declaration, instantiation and initialization  
		//printing array  
		for(int i=0;i<a2.length;i++)//length is the property of array  
		System.out.println(a2[i]);  

		
		int arr[]={33,3,4,5};  
		//printing array using for-each loop  
		for(int i:arr)  
		System.out.println(i);  
		
	}

}
