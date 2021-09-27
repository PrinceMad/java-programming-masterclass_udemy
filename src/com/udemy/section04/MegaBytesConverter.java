package com.udemy.section04;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0)
            System.out.println("Invalid Value");
        else {
            int x = kiloBytes/1024;
            int y = kiloBytes-(1024*x);

            System.out.println(kiloBytes+" KB = "+x+" MB and "+y+" KB");
        }
    }
}
