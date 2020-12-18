
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test test = new Test();
		
		int n = test.test1.length;
		int tempValue = 0;
		
		while(n > 1) {
			
			n -= 1;
			
			for(int i = 0; i < n ; i++) {
				if(test.test1[i] > test.test1[i + 1]) {
					tempValue = test.test1[i];
		    		test.test1[i] = test.test1[i + 1];
		    		test.test1[i + 1] = tempValue;
				}
			}
			
			for(int i = 0; i < test.test1.length; i++) {
			System.out.print(test.test1[i] + " ");
		}
			
			
			System.out.println();
			
		}
		
		
		
		
		
	}

}
