package net;

public class aaa {



		public static void main(String args[]) {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j <5; j++) {

					if (i >= j) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				}System.out.print("\n");
			}
		
		
					for(int a=4;a<=9;a++){
						for(int b=4;b<=9;b++){
				
					if (a <= b) {
					System.out.print("*");
				} else {
						System.out.print(" ");
					}
				
				}	System.out.print("\n");
					}
		}
}