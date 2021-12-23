package javaBasics;

// In this assignment , while and Do-while loops are demonstrated
public class LoopsDemo {

	public void whileTest1() {
		int i = 10;
		while (i > 1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void infiniteWhileTest()
	{
		int i=10;
        while(i>1)
        {
            System.out.println(i);
             i++;
        }
   }
	
	
	public void whileWithArray()
	{
		int arr[]={2,11,45,9};
        //i starts with 0 as array index starts with 0 too
        int i=0;
        while(i<4){
             System.out.println(arr[i]);
             i++;
        }
	}
	
	public void doWhileTest()
	{
		int i=10;
        do{
             System.out.println(i);
             i--;
        }while(i>1);
   }
	
	public void doWhileWithArray()
	{
		int arr[]={2,11,45,9};
        //i starts with 0 as array index starts with 0
        int i=0;
        do{
             System.out.println(arr[i]);
             i++;
        }while(i<4);
	}
	
	public static void main(String args[]) {
		LoopsDemo objLoop = new LoopsDemo();
		objLoop.whileTest1();
//		objLoop.infiniteWhileTest();
		objLoop.whileWithArray();
		objLoop.doWhileTest();
		objLoop.doWhileWithArray();
	}

}
