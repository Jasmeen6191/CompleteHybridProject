package HashMap;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class HashMap {

	public Map<String, String> readfile(String Filename) {
		Map<String, String> map = (Map<String, String>) new HashMap();
		try {
			Scanner in = new Scanner(new File(Filename));
			String line;
			while(in.hasNext()) {
				line = in.next();
				String[] kayvalue = line.split(":");
				map.put(kayvalue[0], kayvalue[1]);

			} 
		} catch (IOException ie) {

		}
		return map;
	}

	private void put(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		HashMap obj = new HashMap();
		obj.readfile("data.txt");
	}
}
