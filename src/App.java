import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args){
		getSumInFile("file/test.txt");
	}

	private static void getSumInFile(String path){
		try {
			File file = new File(path);
			
			if(!file.exists()) {
				throw new FileNotFoundException();
			}
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line = "";
			int sum = 0;
			
			while((line = br.readLine())!=null) {
				System.out.println(line);
				sum += Integer.parseInt(line);
			}
			br.close();
			System.out.println("Sum = "+sum);
		}catch(Exception e) {
			System.err.println("File not found or have error!");
		}
	}
}

