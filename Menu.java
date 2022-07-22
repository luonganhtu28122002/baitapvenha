package baitap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("Nhap ten File: ");
        String tenFile = scanner.nextLine();
        Application feature = new Application();

        do {
            System.out.println("----------MENU----------");
            System.out.println("1. load Data : ");
            System.out.println("2. them 1 JSON : ");
            System.out.println("3. them 1 XML : ");
            System.out.println("4. tim kiem theo ten : ");
            System.out.println("5. EXit : ");

            choice = scanner.nextInt();
            switch (choice){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;

                default:
                    break;
            }
            scanner.nextLine();
        }while (choice!=0);
    }
}
