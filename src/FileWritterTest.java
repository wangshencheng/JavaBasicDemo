import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileWritterTest {

	public static void main(String[] args) throws IOException {
		Writer writer=new FileWriter("./src/a2.txt");
		Reader reader=new FileReader("./src/FileWritterTest.java");
		int hasRead;
		char[] ch=new char[1024];
		while((hasRead=reader.read(ch))>0) {
			writer.write(ch, 0, hasRead);
		}
		writer.close();
		reader.close();
	}
}
