import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest {
public static void main(String[] args) throws IOException {
	InputStream is=new FileInputStream("./src/FileInputstream.java");
	int hasRead;
	byte[]bt=new byte[1024];
	while((hasRead = is.read(bt) )>0) {
		System.out.println(new String(bt,0,hasRead));
	}
}
}
