import java.io.IOException;
import java.util.Scanner;

public class Paragraph {
	
	public static void fha(String is1, String is2) throws IOException {
	    Scanner sc1 = new Scanner(is1);
	    Scanner sc2 = new Scanner(is2);
	    while (sc1.hasNext() && sc2.hasNext()) {
	        String str1 = sc1.next();
	        String str2 = sc2.next();
	        if (!str1.equals(str2))
	            System.out.println(str1 + " != " + str2);
	    }
	    while (sc1.hasNext())
	        System.out.println(sc1.next() + " != EOF");
	    while (sc2.hasNext())
	        System.out.println("EOF != " + sc2.next());
	    sc1.close();
	    sc2.close();
	}
}
