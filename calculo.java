package leetcode;

import java.util.Scanner;

	public class calculo {

		public static void main(String[] args) {
			Scanner e = new Scanner(System.in);
	
			int numA = 94947;
			int numB = 98561;
	
			int soma = numA + numB;
			//System.out.println(soma);
	
			int index = soma % 5 + 2;
			//System.out.println(index);
			
			for(int i = 0; i < 4;  i++) {
				System.out.println(index);
					index = (index + 2) % 9;
		}
	}
}