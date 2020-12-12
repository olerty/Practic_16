package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> gamer1 = new ArrayList<>();
        ArrayList<Integer> gamer2 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            gamer1.add(scan.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            gamer2.add(scan.nextInt());
        }
        int count = 0;
        while (gamer1.isEmpty() == false && gamer2.isEmpty() == false && count < 106) {
            if (gamer1.get(0) == 0 && gamer2.get(0) == 9) {
                gamer1.add(gamer1.get(0));
                gamer1.add(gamer2.get(0));
            }
            else if (gamer2.get(0) == 0 && gamer1.get(0) == 9) {
                gamer2.add(gamer1.get(0));
                gamer2.add(gamer2.get(0));
            }
            else if (gamer1.get(0) > gamer2.get(0)) {
                gamer1.add(gamer1.get(0));
                gamer1.add(gamer2.get(0));
            }
            else {
                gamer2.add(gamer1.get(0));
                gamer2.add(gamer2.get(0));
            }
            gamer1.remove(0);
            gamer2.remove(0);
            count += 1;
        }
        if (count == 106) {
            System.out.println("botva");
        }
        else if (gamer1.isEmpty()) {
            System.out.print("second ");
            System.out.print(count);
        }
        else {
            System.out.println("first ");
            System.out.print(count);
        }
    }
}
