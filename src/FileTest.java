import java.io.File;
import java.io.IOException;

public class FileTest {
public static void main(String[] args) throws IOException {
	File file=new File(".");
//	System.out.println(file.getName());
	//System.out.println(file.getAbsolutePath());
	//System.out.println(file.getParent());
	//System.out.println(file.getAbsoluteFile());
	//System.out.println(file.getAbsoluteFile().getParent());

File temFile=File.createTempFile("aaaa", ".txt", file);
temFile.deleteOnExit();
File newFile=new File(System.currentTimeMillis()+"");
System.out.println(newFile.exists());
newFile.mkdir();
String[] fileNameList=file.list();
for (String string : fileNameList) {
	System.out.println(string);
	
}
File [] FileList=file.listFiles();
for (File file2 : FileList) {
	System.out.println(file2);
}
}
}
