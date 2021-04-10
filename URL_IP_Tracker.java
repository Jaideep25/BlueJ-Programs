// Java program to demonstrate
// how to fetch public IP Address
import java.net.*;
import java.net.InetAddress;

class URL_IP_Tracker {
    public static void main(String args[])
    throws UnknownHostException
    {
        // The URL for which IP address needs to be fetched
        String s = "";
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
        }
}
