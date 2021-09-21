import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputstreamReaderTest {
public static void main(String[] args) throws IOException {
	Reader reader=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(reader);
String line ;
while(((line=br.readLine())!=null)) {
	System.out.println(line);
	if(line.equals("exit")) {
		System.exit(1);
	}
}
}
}
