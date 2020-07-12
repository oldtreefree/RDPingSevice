package com.rd;

import java.io.IOException;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) throws IOException {
        String ipAddress = "mail.ru";
        InetAddress inetAddress = InetAddress.getByName(ipAddress);
        System.out.println("Пингую сервер " + ipAddress);
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(inetAddress.isReachable(5000) ? "Хост " + ipAddress + " доступен" : "Хост не доступен");
            } catch (InterruptedException ex) {
            }
        }
    }
}
