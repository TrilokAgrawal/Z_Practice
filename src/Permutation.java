import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Permutation {
	
	private List<String> tokens = new ArrayList<String>();
	
	public Permutation(String file)throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File(file)));
		String s = br.readLine();
		StringTokenizer tokenizer = new StringTokenizer(s, ",");
		while(tokenizer.hasMoreTokens()) {
			tokens.add(tokenizer.nextToken());
		}
	}
	public void generateCombinations() {
		int counter = 0;
		for(int i=0; i<tokens.size(); i++) {
			for(int j=0; j<tokens.size(); j++){
				System.out.println(tokens.get(i) + tokens.get(j));
				counter++;
			}
		}
		System.out.println(counter);
	}
	
	public static void main(String[] main)throws Exception {
		Permutation permutation = new Permutation("F:\\ISuite-code\\Java\\Z_Practice\\src\\token.txt");
		permutation.generateCombinations();
		
		//DefaultSelenium ds = new  DefaultSelenium("localhost", 8888,"*firefox", "http://www.gmail.com");
		//ds.start();
		//ds.windowMaximize();
	}

}
