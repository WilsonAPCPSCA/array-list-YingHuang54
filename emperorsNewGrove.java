/* Ying Huang
 * 1-11-2018
 * Array List - Programming
 */
import java.util.ArrayList;
public class emperorsNewGrove {

	public static void main(String[] args) {
		ArrayList<String> emperorCast = new ArrayList<String>();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		System.out.println("Original Array List: ");
		System.out.println("  "+emperorCast);
		emperorCast.remove(1);
		emperorCast.add(2,"Tipo");
		emperorCast.add(2,"Chaca");
		emperorCast.add("Bucky");
		emperorCast.add("Pacha");
		System.out.println("Modified Array List: ");
		System.out.println("  "+emperorCast);
	}

}
