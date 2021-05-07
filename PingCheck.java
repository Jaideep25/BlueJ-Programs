import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.net.*;
import java.net.InetAddress;
public class PingCheck {

    public static void runSystemCommand(String command) {
        /**
         * By Jaideep25@Github.io
         */
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            // reading output stream of the command
            while ((s = inputStream.readLine()) != null) {
                System.out.println(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) 
    throws UnknownHostException{
        Scanner in = new Scanner(System.in);
        // The URL for which IP address needs to be fetched
        String s = "";
        System.out.println("Enter the URL, for which you want to check the IP address");
        s = in.nextLine();
        /**
         * By Jaideep25@Github.io
         */
        try {
            // Fetch IP address by getByName()
            InetAddress ip = InetAddress.getByName(new URL(s)
                    .getHost());

            // Print the IP address
            System.out.println("Public IP Address of: " + ip);
        }
        catch (MalformedURLException e) {
            // It means the URL is invalid
            System.out.println("Invalid URL");
        }
        System.out.println("Enter the IP address given above (IP address is the digits given after the link), to show the ping of the above link!");
        String ip = "";
        ip = in.nextLine();
        in.close();
        runSystemCommand("ping " + ip);
    }
}