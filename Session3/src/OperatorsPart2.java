
public class OperatorsPart2 {

	public static void main(String[] args) {
		
		// 5. Bitwise Operators
		//    &, |, ^
		int num1 = 8;				// 1 0 0 0
		int num2 = 10;				// 1 0 1 0
		
		int result1 = num1 & num2;	// 1 0 0 0 -> 8	
		int result2 = num1 | num2;	// 1 0 1 0 -> 10 	
		int result3 = num1 ^ num2;	// 0 0 1 0 -> 2
		
		System.out.println("result1 is: "+result1);
		System.out.println("result2 is: "+result2);
		System.out.println("result3 is: "+result3);
		
		// SE: Where and all we can implement bitwise operators :)
		
		// 6. Shift Operators
		// >>, <<, >>>
		
		int x = 8; // data
		int y = 3; // key
		int z = x >> y; // x / 2powery    8 / 2power3
		System.out.println("z rt shift is: "+z);
		
		z = x << y;  // x * 2powery   8 * 2power3
		System.out.println("z lt shift is: "+z);
		
		int result = z >> y;
		System.out.println("Result is: "+result);
		
		// 8 >> 3
		// 0 0 0 0  1 0 0 0
		// >> 3
		// _ _ _ 0  0 0 0 1
		// 0 0 0 0  0 0 0 1  -> 1
		
		// 8 << 3
		// 0 0 0 0  1 0 0 0
		// << 3
		// 0 1 0 0  0 _ _ _
		// 0 1 0 0  0 0 0 0  -> 64
		
		x = -11;
		y = 2;
		z = x >> y;
		System.out.println("z now is: "+z);
		
		// 0 0 0 0 	1 0 1 1
		// 1 1 1 1  0 1 0 0
		//				+ 1
		// 1 1 1 1  0 1 0 1 -> -11
		// >> 2
		// _ _ 1 1  1 1 0 1
		// 1 1 1 1  1 1 0 1
		// 0 0 0 0  0 0 1 0
		//				+ 1
		// 0 0 0 0  0 0 1 1 -> -3
		
		// SE: see of you can do it with other methods :)
		//     work with right shift for negative numbers
		
		
		// 7. Ternary Operator
		String name = "John Watson";
		int eWallet =  300;
		int cabFare = 500;
		
		
		String message = (eWallet > cabFare) ? "Cab Booked" : "Please recharge your wallet";
		System.out.println("message is: "+message);
		

	}

}
