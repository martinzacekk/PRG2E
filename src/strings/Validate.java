package strings;

import javax.swing.*;
import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        String input = JOptionPane.showInputDialog("Zadej IP");
        System.out.println("Zadal jsi: " + input);

        //spocitej tecky:
        String[] parts = input.split("\\.");
        if (parts.length == 3){
            System.out.println("Delka OK");
        }
    }
}
