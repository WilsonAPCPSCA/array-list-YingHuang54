/* Ying Huang
 * 1-11-2018
 * Array List - Programming
 */
import java.util.ArrayList;
public class randomZeros {

	public static void main(String[] args) {
		ArrayList<Integer> numsRandom = new ArrayList<Integer>();
		for(int i = 0; i<10; i++){
			numsRandom.add((int)(Math.random()*99+1));
		}
		System.out.println("Random List: ");
		System.out.println(numsRandom);
		for(int i = 0; i<numsRandom.size(); i++){
			numsRandom.set(i, 0);
		}
		System.out.println("Modified List:");
		System.out.println(numsRandom);
	}

}
