package modifiers.nonaccess.abstractmodifier;
// this is not cleared/understood to me
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.File;

public class Sample {

	public static void main(String[] args) throws IOException {
		
		InputStream is = new ObjectInputStream(new FileInputStream(new File("")));
	}

}
