import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public class StringReaderTest {
public static void main(String[] args) throws IOException {
	String src="从今天起，做一个幸福的人";
	int hasRead;
	char[]ch=new char[1024];
	Reader reader=new StringReader(src);
	while((hasRead=reader.read(ch))>0) {
		System.out.println(new String(ch,0,hasRead));
	}
	Writer writer=new StringWriter();
	writer.write("白日依山尽\n");
	writer.write("黄河入海流\n");
    System.out.println(writer.toString());
}
}
