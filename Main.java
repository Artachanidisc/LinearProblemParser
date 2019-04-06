import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ObjectiveFunction o1 = new ObjectiveFunction();
		int nword = 0;
		int i = 0;
		int functionSize = 0;
		ArrayList<String>functionArray=new ArrayList<String>();

		try (Scanner scanner = new Scanner(new File("lp1.txt"));) {
			while (scanner.hasNext()) {
				String sent = scanner.nextLine();
				functionArray.add(sent);
				nword++;
			//	System.out.printf("%3d) %s%n", nword, sent);
			}
		}
	o1.testFunction(functionArray);
	}
}
