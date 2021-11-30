package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main extends JFrame {

    public Main() throws HeadlessException {
        this("untitled");
    }

    public Main(String title) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 250, 500, 350);
    }

    public static void main(String[] args) {

        Passwords passwords = new Passwords();
        Dialog dialog = new Dialog();
        dialog.communicateWithUser(passwords);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Wpisz hasło dla: ");
//        String haslo = sc.nextLine();

//        // zmienny string w zależności od nazwy użytkownika !!!
//        if((passwords.getDataBase().get(haslo).toString()).equals("Leszek Sikacki"))
//            System.out.println("HASŁO POPRAWNE");
//        else{
//            System.out.println("HASŁO NIEPOPRAWNE");
//        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }

    public void buildFrame(){

    }
}
