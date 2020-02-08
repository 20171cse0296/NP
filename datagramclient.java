import java.io.*;
import java.net.*;
public class datagramclient
 {
   public static DatagramSocket ds;
   public static byte buffer[]=new byte[1024];
   public static int clientport=1789,serverport=1790;
   public static void main(String[] args)throws Exception 
	{
	   ds=new DatagramSocket(clientport);
           System.out.println("client is waiting for server to send data");
	   System.out.println("press ctrl+c to come out");
		while(true)
			{
			     DatagramPacket dp=new DatagramPacket(buffer,buffer.length);
			     ds.receive(dp);
    			     String Pdata=new String(dp.getData(),0,dp.getLength());
			     System.out.println(Pdata);
}
}
}
