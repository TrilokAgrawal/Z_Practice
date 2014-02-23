import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;


public class FileGenerator {
	
	private static Vector<String[]> vector = new Vector<String[]>();
	
	private  final String HEADER = "HEADER|HEADER|HEADER|HEADER";
	private final String FOOTER = "(Total)";
	private int COUNT_PER_FILE = 6;
	private final String FILE_NAME_PREFIX = "output.bak";
	
	//Just for dummy initialization
	static {
		for(int i=0; i<10; i++) {
			String[] arr = {"Dada", "Bengali", "Kala Gadura", 
					"Bhur Bandar", "Radhey", "Muttu"};
			vector.add(arr);
		}
		vector.add(new String[]{});
	}
	
	public void generate() throws IOException {
		
		if(null == vector || vector.size() < 1)
			throw new IllegalStateException("Vector is null or has no element");
		
		int i = 0; //for file numbering
		int j = 0; //for vector count
		while(j<vector.size()) {
			long timeinMillis = System.currentTimeMillis();
			File f = new File("c:\\test\\" + FILE_NAME_PREFIX + "_" + i);
			FileWriter fw = new FileWriter(f);
			BufferedWriter writer = new BufferedWriter(fw);
			writer.write(HEADER);
			writer.write("\n");
			int actualNumberOfRecordsWrittenInThisFile = 0;
			for(int c = 0; c<COUNT_PER_FILE; c++, actualNumberOfRecordsWrittenInThisFile = c) {
				if(j<vector.size()) {
					String[] arr = vector.get(j);
					for(int p = 0; p<arr.length; p++) {
						writer.write(arr[p]);
						if(arr.length-1 > p)
							writer.write("|");
					}
					writer.write("\n");
					j++;
				} else {
					actualNumberOfRecordsWrittenInThisFile = c;
					break;
				}
			}
			writer.write(FOOTER + actualNumberOfRecordsWrittenInThisFile);
			writer.flush();
			writer.close();
			fw.close();
			i++;
			System.out.println("Time elapsed in one file creation " + (System.currentTimeMillis() - timeinMillis));
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		FileGenerator fg = new FileGenerator();
		fg.generate();
	}
	

}
