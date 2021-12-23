package javaBasics;

public class ForLoopDemo {
	
	public static void main(String args[]){
        for(int i=10; i>1; i--){
             System.out.println("The value of i is: "+i);
        }
        
        // simple for loop for int type Array
        int arr[]={2,11,45,9};
        //i starts with 0 as array index starts with 0 too
        for(int i=0; i<arr.length; i++){
             System.out.println(arr[i]);
        }
        
        // enhanced for loop for int type Array
        int arr2[]={2,11,45,9};
        for (int num : arr2) {
           System.out.println(num);
        }
        
     // enhanced for loop for String type Array
        String arr3[]={"hi","hello","bye"};
        for (String str : arr3) {
                 System.out.println(str);
        }
        
   }

}
