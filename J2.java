package quiz02;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class J2 {

	public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("rand.txt");
        int r =(int)(Math.random()*10);
        fw.write(r);
        fw.flush();
        fw.close();

	}

}
