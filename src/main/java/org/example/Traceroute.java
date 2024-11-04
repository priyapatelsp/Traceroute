package org.example;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Traceroute {
    private static final int TIMEOUT = 3000;
    private static final int MAX_HOPS = 30;
    private static final int UDP_PORT = 33434;

    public static void main(String[] args) {
        System.out.println("Usage: cctraceroute www.google.com");
        System.out.println("---------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("exit")) {
            System.out.println("THANKS :)");
            System.exit(1);
        }
        String[] partsInput = userInput.split(" ");
        String host = partsInput[1];

        try {

            ProcessBuilder processBuilder = new ProcessBuilder("traceroute", host);
            Process process = processBuilder.start();


            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            System.out.println("Traceroute to " + host + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            if (exitCode != 0) {
                System.err.println("Traceroute command failed with exit code: " + exitCode);
            }
        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Process was interrupted: " + e.getMessage());
        }
    }}
//
//    private static void traceRoute(InetAddress destination) {
//        for (int ttl = 1; ttl <= MAX_HOPS; ttl++) {
//            try (DatagramSocket socket = new DatagramSocket()) {
//                socket.setSoTimeout(TIMEOUT);
//
//                byte[] buffer = new byte[512];
//                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, destination, UDP_PORT);
//
//                socket.setTrafficClass(0x04);
//
//                socket.send(packet);
//                System.out.println("TTL " + ttl + ": sent packet");
//                DatagramPacket response = new DatagramPacket(new byte[512], 512);
//                try {
//                    socket.receive(response);
//                    InetAddress senderAddress = response.getAddress();
//                    System.out.println("TTL " + ttl + ": received response from " + senderAddress.getHostAddress());
//                } catch (IOException e) {
//                    System.out.println("TTL " + ttl + ": no response (timeout)");
//                }
//            } catch (SocketException e) {
//                System.out.println("Socket error: " + e.getMessage());
//            } catch (IOException e) {
//                System.out.println("I/O error: " + e.getMessage());
//            }
//        }
//    }
//}
