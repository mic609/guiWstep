package com.company;

import javax.swing.*;
import java.awt.*;

public interface Click {

    default void onClear(JTextField userText, JPasswordField passwordText, JPanel panel){
        passwordText.setText("");
        userText.setText("");
        panel.setBackground(Color.GRAY);
        panel.repaint();
    }

    //------------------------------------------------------------------------------------------------------------------

    default void onLogin(JTextField userText, JPasswordField passwordText, Passwords passwords, JPanel panel){
        if (userText.getText().isEmpty()|| passwordText.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null,"Prosimy wpisać dane");
        }
        else{
            // zmienny string w zależności od nazwy użytkownika !!!
            if((passwords.getDataBase().containsKey(String.valueOf(passwordText.getPassword()))
                    &&((passwords.getDataBase().get(String.valueOf(passwordText.getPassword()))).toString()).equals(userText.getText()))){
                panel.setBackground(Color.GREEN);
                panel.repaint();
                JOptionPane.showMessageDialog(null,"Dane prawidłowe");
            }
            else{
                panel.setBackground(Color.RED);
                panel.repaint();
                JOptionPane.showMessageDialog(null,"Niepowodzenie logowania. Niepoprawna nazwa użytkownika lub hasło");
            }
        }
    }
}
