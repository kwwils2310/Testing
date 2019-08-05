package first;
import java.util.Arrays;

/*
* @author Kyle Wilson
*
*
*/
public class exampleone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int x = 10, y = 10;
		for (int i = 5; i < 10; i++)
		 y =2 * y;
		do {
		x += y;
		}while (y < 100);
 System.out.println(x); */
		System.out.println(11%2);
		String s1 = "hello" + " world";
		String s2 = new String("hello world");
		
		System.out.println(s1 + "   /////   " + s1);
		
		int a, b, x;
		a = 0;
		b= -5;
		x=0;
		
		if (a > 0)
			if (b < 0)
				x = x + 5;
				else
					if (a > 5)
						x = x + 4;
						else
							x = x + 3;
		else
		x = x + 2;
		System.out.println(x);
		
		int[] values= {9,4,12,2,6,8,20};
		System.out.println(values[2] + values[values.length-2]);
		System.out.println(values[values.length-5]);
		System.out.println(" ");
		
		for (int j = 0; j<values.length; j++) 
			values[j]++;
		System.out.println(Arrays.toString(values));
		// can also print a 1d array by System.out.println(values[j]);
		
		
		int[][] table = new int[2][10];
				
				for (int row=0; row < 2; row++){
					for (int col=0; col < table[row].length; col++)
					table[row][col] = 0;
				}
				System.out.println("******");
				System.out.println(Arrays.deepToString(table));
				
		int [] [] twoDArray = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
		System.out.println(twoDArray[1][2] + twoDArray[twoDArray.length-1][0]);
		System.out.println("    ");
		
		
		int[] array = {1, -2, 3, 4, -5, 6, 7, 8};
		/*
		for(int z =0; z<array.length; z++){
			array[z]++;
		}
		System.out.println(Arrays.toString(array) + "@@@@@@@@");
		*/
		int [] blank = new int[array.length*2];
		//System.out.println(Arrays.toString(array));
		int q = array.length;
		for (int j = q; j<=array.length && j>0; j--)
		
		if(array[array.length-j] < 0){
			array[array.length-j]=0;
			j = 0;
		}
		blank = array;
		
		System.out.println(Arrays.toString(array)+ "??????");
		System.out.println(Arrays.toString(blank) + "//////");
		
		System.out.println(Arrays.toString(array));
		int [] testArray = {3,5,6,7};
		int[] temp = new int[testArray.length * 2];
		for (int i= 0; i< testArray.length; i++)
		temp[i] = testArray [i];
		testArray = temp;
		System.out.println(Arrays.toString(testArray));

		System.out.println("   ");
///////////////////////////////////////////////////////////////////////////////
		int[][] array1 = {{1, 2, 3},{4, 5, 6}};
		int E = array1.length;
		for (int j = E; j<=array1.length && j>0; j--)
		
		if(array1[array1.length-j][1] == 6);
			array1[array1.length-2][0]= 6;
			array1[array1.length-1][2] =1;
		//}
		
		System.out.println(Arrays.deepToString(array1));
		//System.out.println(array1[array1.length-1][0]);
///////////////////////////////////////////////////////////////////////////////////
		
		int[] arrayOne = {1, -2, 3, 4, -5, 6, 7, 8};
		System.out.println(Arrays.toString(arrayOne) + " sdklfhv;kldjnvnjksdcnndk");
		int j =0;
		while(j<arrayOne.length){
			if(arrayOne[j] < 0){
				arrayOne[j] = 0;
				break;
			}
			j++;
		}
		
		System.out.println(Arrays.toString(arrayOne) + " fhgjhfgdsfafdgh");
//////////////////////////////////////////////////////////////////////////////////////////
		int toDArray[][]={{1, 2, 3}, {4, 5, 6}};
		int Max=0;
		int Min=0;
			for(int row=0; row<toDArray.length; row++){
				for(int col=0; col<toDArray[row].length; col++){
					if(toDArray[row][col]>=Max){
					 Max= (toDArray[row][col]);
					}
					if(toDArray[row][col]<=toDArray[0][0]){
						 Min= (toDArray[row][col]);
					}
				}
			}
			System.out.println(Arrays.deepToString(toDArray) + " >>>>>>>>>>>>>>>>>>>>>");
		for(int row=0; row<toDArray.length; row++){
			for(int col=0; col<toDArray[row].length; col++){
				if(toDArray[row][col] == Min){
					 toDArray[row][col] = Max;
					 
					 }
				
			}
		}
System.out.println(Arrays.deepToString(toDArray) + " >>>>>>>>>>>>>>>>>>>>>");
System.out.println(Max);
System.out.println(Min);
System.out.println(" ");
System.out.println("////////////////////////////////////////////////////////");
System.out.println(" ");
int [][] tdarray = {{1, 2, 3, 5},
					{2, 5, 6, 7},
					{3,8,9, 8},
					{5,8,4,7}};
//System.out.println(Arrays.deepToString(tdarray));

System.out.println(Arrays.deepToString(tdarray).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
System.out.println(tdarray[1][0]);
System.out.println(tdarray.length);
System.out.println(tdarray[0].length);
boolean check = false;
int column_sum =0;
int row_sum = 0;
for(int w =0; w<tdarray.length; w++) //row
	 column_sum += tdarray[0][w];
for(int k =0; k<tdarray[0].length; k++) //column
	row_sum += tdarray[k][0];
if(row_sum == column_sum){
	check = true;
	
	//Mod
	double n;
	n = 10 % 35;
	System.out.println("");
	System.out.println(n);
	System.out.println("");
}
System.out.println(check);
//System.out.println(toDArray.length);

	
	exampleone ex = new exampleone();
		ex.switchMaxMin();
		
		
	}	
///////////////////////////////////////////////////////////////////////////////////////////////

	
	
	public void switchMaxMin(){
		int[][] array = {{1, 2, 3},{4, 5, 6}};
		System.out.println("");
		System.out.println(array[array.length-1][0]);
		
		
		System.out.println("Hello World");
		//return;
	}
	
	//////////////////////////////////////////////////////////////////

		
	
	

}
