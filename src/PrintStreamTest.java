import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
public static void main(String[] args) throws FileNotFoundException {
	OutputStream os=new FileOutputStream("./src/a2.txt");
	PrintStream ps=new PrintStream(os);
	ps.print("好喜欢你啊");
}
}
