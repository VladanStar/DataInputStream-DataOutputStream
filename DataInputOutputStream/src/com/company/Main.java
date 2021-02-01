package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // Kreiranje izlaznog toka za datoteku temp.dat
        DataOutputStream output
                = new DataOutputStream(new FileOutputStream("temp.dat"));

        // Pisanje ocena studentskog testa u datoteku
        output.writeUTF("John");
        output.writeDouble(85.5);
        output.writeUTF("Susan");
        output.writeDouble(185.5);
        output.writeUTF("Kim");
        output.writeDouble(105.25);

        // Zatvaranje izaznog toka
        output.close();

        // Kreiranje ulaznog toka za datoteku temp.dat
        DataInputStream input
                = new DataInputStream(new FileInputStream("temp.dat"));

        // Čitanje ulaznog toka za datoteku temp.dat
        System.out.println(input.readUTF() + " " + input.readDouble());
        System.out.println(input.readUTF() + " " + input.readDouble());
        System.out.println(input.readUTF() + " " + input.readDouble());
    }
}
