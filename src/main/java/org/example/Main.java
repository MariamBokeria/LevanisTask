package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("გამარჯობა, როგორ მოგმართოთ? ");
        Scanner enterName = new Scanner(System.in);
        String myName = enterName.next();
        System.out.println("ერთ შეკითხვას დაგისვამთ, მზად ხარ " + myName + "? :)");
        Scanner enterInfo = new Scanner(System.in);
        String myInfo = enterInfo.next();
        System.out.println("რამდენია 5-ის კვადრატი? ");
        Scanner answer = new Scanner(System.in);
        int ans = 25;
        int myAnswer = answer.nextInt();
        if (myAnswer != ans){
            System.out.println("სამწუხაროდ თქვენი პასუხი არასწორია :/ შეიყვანეთ თავიდან");
            answer.nextInt();
        }
        else {
            System.out.println("გილოცავთ, თქვენი პასუხი სწორია :)");
        }
    }
}