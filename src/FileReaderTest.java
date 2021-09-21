import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {
public static void main(String[] args) throws IOException {
	Reader reader=new FileReader("./src/FileReaderTest.java");
	char[]ch=new char[1024];
	int hasRead;
	while((hasRead=reader.read(ch))>0) {
		System.out.println(new String(ch,0,hasRead));
	}
}
}
