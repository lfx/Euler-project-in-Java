package test;

import java.net.*;

public class test {
	public static void main(String[] args) throws SocketException {
	

    NetworkInterface networkInterface =
            NetworkInterface.getByName("eth0");

    byte[] b1 = networkInterface.getHardwareAddress();
    System.out.print("Hardware Address = ");
    for (int i = 0; i < b1.length; i++) {
        System.out.print(b1[i]);
    }
	
	}
	
}
