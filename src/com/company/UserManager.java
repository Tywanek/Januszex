package com.company;

import java.util.Scanner;

public class UserManager {

    public JanuszUser loginNewUser() {
        JanuszTools.log("Podaj imię: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        JanuszUser januszUser = new JanuszUser(userName);
        return januszUser;

//        return new JanuszUser(
//                new Scanner(System.in).nextLine());
    }
}
