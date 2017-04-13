package net;

public class lingxing {

	public static void main(String args[] ) {
		
		int width = 5;
		
		int start = 0;
		int end = 0;
		char space=' ';
		char point ='*';
		
		for(int i=0;i<width;i++){
			start = width-1 -i;
			end = start + i*2;
			for(int j=0;j<=end;j++){
				if(j==start){
					System.out.print(point);
					
				}else if(j==end){
					System.out.print(point);
				}else{
					System.out.print(space);
				}
				
			}
			System.out.print("\n");
		}
		
		
		for(int i=width-1;i>=0;i--){
			start = width-1 -i;
			end = start + i*2;
			for(int j=0;j<=end;j++){
				if(j==start){
					System.out.print(point);
					
				}else if(j==end){
					System.out.print(point);
				}else{
					System.out.print(space);
				}
				
			}
			System.out.print("\n");
		}

	}
}

