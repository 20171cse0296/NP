import java.net.*;
public class ip
{
public static void main(String[] args)
{
try
{
InetAddress address=InetAddress.getLocalHost();
System.out.println(address);
}
catch(UnknownHostException uhEx)
{
System.out.println("could not find local address!");
}}}