package Introduction_to_Java_6;

public class Array2DDemo {

	public static void main(String[] args) {
		
		int[][] arr;
		arr = new int[3][4];

		System.out.println(arr);
		
		System.out.println("Rows " + arr.length);
		System.out.println("Cols " + arr[0].length);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[0][3]);
		arr[0][3] = 10;
		System.out.println(arr[0][3]);
		
		System.out.println("---------JA--------");
		int[][] jarr;
		jarr = new int[3][];
		
		System.out.println(jarr);
		System.out.println(jarr[0]);
		System.out.println(jarr[1]);
		System.out.println(jarr[2]);
		
		jarr[0] = new int[4];
		jarr[1] = new int[3];
		jarr[2] = new int[2];
		
		System.out.println(jarr[0]);
		System.out.println(jarr[1]);
		System.out.println(jarr[2]);
		
		System.out.println(jarr[1].length);
	}

}
