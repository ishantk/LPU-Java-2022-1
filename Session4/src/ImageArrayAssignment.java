
public class ImageArrayAssignment {

	public static void main(String[] args) {
		
		
		int[] pixel1 = {12, 45, 78};
	 	int[] pixel2 = {34, 12, 90};
	 	int[] pixel3 = {0, 234, 56};
	 	
	 	int[] pixel4 = {12, 45, 78};
	 	int[] pixel5 = {12, 45, 78};
	 	int[] pixel6 = {12, 45, 78};
	 	
	 	int[] pixel7 = {12, 45, 78};
	 	int[] pixel8 = {12, 45, 78};
	 	int[] pixel9 = {12, 45, 78};
	 	
	 	// Representation of an Image
	 	int[][][] image = {
	 						{pixel1, pixel2, pixel3},
	 						{pixel4, pixel5, pixel6},
	 						{pixel7, pixel8, pixel9},
	 					};
	 	
	 	// Assignment: 1. Rotate the Image to Right -> 90 degrees
	 	//			   2. Rotate the Image to Left  -> 180 degrees
	 	//			   3. GrayScale the image
	 	//					for a pixel sum up all values and divide by 3
	 	//				    eg: for pixel1 -> 12+45+78/3 -> 45
	 	//					pixel1 = {45, 45, 45}
	 	//					do it for all pixels on the image
	 	// 			   Hint: Use For Loops :)
	 	

	 	image[0][0][0] = 45;
	 	image[0][0][1] = 45;
	 	image[0][0][2] = 45;
	 	
	 	for(int i=0;i<3;i++) {
	 		System.out.println(image[0][0][i]);
	 	}
	 	
	}

}
