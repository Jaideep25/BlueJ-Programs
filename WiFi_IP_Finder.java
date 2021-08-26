import java.io.IOException;
import java.net.InetAddress;

public class WiFi_IP_Finder {

    /**
     * By : Jaideep25@Github.io
     */
    public static void main(String[] args) throws IOException {

        InetAddress localhost = InetAddress.getLocalHost();
        // this code assumes IPv4 is used
        byte[] ip = localhost.getAddress();
        InetAddress address = InetAddress.getByAddress(ip);
        if (address.isReachable(1000))
            System.out.println("Your Wireless network IP address = " + address);
    }
}