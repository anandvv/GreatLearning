
public class TableOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		//infinite for loop
		for (;; i++) {
			//continue if no doesn't come in table of 2
			if(i%2 != 0) {
				continue;
			}
			else if(i>20){
				break;
			}
			else {
				System.out.println(i);
			}
			
		}
	}

}
