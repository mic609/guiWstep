package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Main extends JFrame {

    public Main() throws HeadlessException {
        this("Login");
    }

    //------------------------------------------------------------------------------------------------------------------

    public Main(String title) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 250, 500, 300);
    }

    //------------------------------------------------------------------------------------------------------------------

    public void buildFrame(Passwords passwords){

        //PANEL
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        panel.setLayout(null);

        //TEKST UŻYTKOWNIK
        JLabel user = new JLabel("Użytkownik");
        user.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        user.setBounds(50,50,100,20);

        //TEKST HASŁO
        JLabel password = new JLabel("Hasło");
        password.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        password.setBounds(50, 75, 100, 20);

        //POLE TEKSTOWE UŻYTKOWNIK
        JTextField userText = new JTextField();
        userText.setBounds(175, 50, 250, 20);

        //POLE TEKSTOWE HASŁO
        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(175, 75, 250, 20);

        // PRZYCISK LOGIN
        MyJButton login = new MyJButton();
        login.setBounds(50, 125, 90, 20);
        login.setText("Login");
        login.addActionListener(e -> login.onLogin(userText,passwordText,passwords,panel));

        // PRZYCISK WYCZYSC
        MyJButton clear = new MyJButton();
        clear.setBounds(335, 125, 90, 20);
        clear.setText("Wyczyść");
        clear.addActionListener(e -> clear.onClear(userText, passwordText, panel));

        // MENUBAR
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu = new JMenu("Menu");
        MyJMenuItem loginItem = new MyJMenuItem("Login");
        loginItem.addActionListener(e -> clear.onLogin(userText, passwordText, passwords, panel));
        MyJMenuItem clearItem = new MyJMenuItem("Wyczyść");
        clearItem.addActionListener(e -> clear.onClear(userText, passwordText, panel));

        //TOOLBAR
        JToolBar menutoolbar = new JToolBar();
        menutoolbar.setBounds(0,0,500,25);
        panel.add(menutoolbar);
        MyJButton loginT = new MyJButton();
        loginT.setText("Login");
        loginT.addActionListener(e -> loginT.onLogin(userText,passwordText,passwords,panel));
        MyJButton clearT = new MyJButton();
        clearT.setText("Wyczyść");
        clearT.addActionListener(e -> clearT.onClear(userText, passwordText, panel));
        menutoolbar.add(loginT);
        menutoolbar.add(clearT);

        panel.add(user);
        panel.add(userText);
        panel.add(password);
        panel.add(passwordText);
        panel.add(menu);
        menuBar.add(menu);
        menu.add(loginItem);
        menu.add(clearItem);
        panel.add(clear);
        panel.add(login);

    }

    //------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        Passwords passwords = new Passwords();
        Dialog dialog = new Dialog();
        dialog.communicateWithUser(passwords);

        SwingUtilities.invokeLater(() -> {
            try {
                Main frame = new Main();
                frame.buildFrame(passwords);
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace(System.err);
            }
        });
    }
}
