import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOutputStreamTest {

	public static void main(String[] args) throws IOException {
		OutputStream os=new java.io.FileOutputStream("./src/a1.txt");
        InputStream is=new FileInputStream("./src/FileOutputStreamTest.java");
        byte[]bt=new byte[1024];
        int hasRead;
        while( (hasRead=is.read(bt))>0) {
        	os.write(bt,0,hasRead);
        }
	
	
	}
}
