package com.company;

import java.util.Scanner;

public class Dialog {

    public void communicateWithUser(Passwords passwords){

        System.out.println("Witaj! Na samym wstępie prosimy o wpisanie nazwy użytkownika (w formie imienia i nazwiska) i hasła do bazy danych: ");
        add(passwords);
        System.out.println("Dostępni użytkownicy: ");
        passwords.showDataBase();

    }

    //------------------------------------------------------------------------------------------------------------------

    public void add(Passwords passwords){

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String command;

        while(true){
            Person person = new Person();
            person.setImie(sc.nextLine());
            person.setNazwisko(sc.nextLine());

            String tab = sc.nextLine();

            passwords.addUserAndPassword(person,tab);

            System.out.println("Zakończyć dodawanie danych? (jeśli tak wpisz 1): ");
            command = sc2.nextLine();

            if (command.equals("1")) break;
            System.out.println("Podaj dane: ");
        }
    }
}
