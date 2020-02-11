import java.io.*;
import java.net.*;
public class rapserver {
public static void main(String[] args)throws IOException {
			
ServerSocket ss=new ServerSocket(55);
Socket s=ss.accept();
DataInputStream in=new DataInputStream(s.getInputStream());
DataOutputStream out=new DataOutputStream(s.getOutputStream());
DataInputStream sysin=new DataInputStream(System.in);
System.out.println("enter an macc address");
String str=sysin.readLine();
out.writeBytes(str+"\n");
System.out.println("the string from tcp server"+in.readLine());

		

	}

}
