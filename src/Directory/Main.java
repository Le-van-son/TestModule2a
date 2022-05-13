package Directory;

import manage.DirectoryManage;
import model.FileDocGhi;
import model.PhoneDirectory;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) throws IOException {
        DirectoryManage directoryManage1 = new DirectoryManage();
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        do {
            System.out.println("<-------------Menu-------------->");
            System.out.println("1.Display");
            System.out.println("2.add");
            System.out.println("3.Edit");
            System.out.println("4.Delete");
            System.out.println("5.Find");
            System.out.println("6.Write to file");
            System.out.println("7.Read from file");
            System.out.println("8.Exit");
            System.out.println("Enter your choice: ");
            do {
                if (choice < 1 || choice > 8) {
                    System.out.println("SOS!!!! not find choice ");
                }
                try {
                    choice = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Only EnterNumber: ");
                    sc.nextLine();
                    choice = -1;
                }
            } while (choice < 1 || choice > 8);

            if (choice == 1) {
                directoryManage1.display();
            }
            if (choice == 2) {
                boolean flag = true;
                while (flag) {
               try {
                   System.out.println(ANSI_BLUE + "Add---Phonenumber" + ANSI_RESET);
                   System.out.println("Enter name : ");
                   sc.nextLine();
                   String name = sc.nextLine();
                   System.out.println("Enter address: ");
                   String address = sc.nextLine();
                   System.out.println("Enter Email: ");
                   String email = directoryManage1.checkEmail();
                   System.out.println("Enter Facebook: ");
                   String facebook = sc.nextLine();
                   System.out.println("Enter sex: ");
                   String sex = sc.nextLine();
                   System.out.println("Group: ");
                   String group = sc.nextLine();
                   System.out.println("Enter birdth: ");
                   String birdth = sc.nextLine();
                   System.out.println("Enter phonenumber:");
                   String phonenumber = directoryManage1.checkPhoneNumber();
                   PhoneDirectory phoneDirectory = new PhoneDirectory(name, address, email, facebook, sex, group, birdth, phonenumber);
                   directoryManage1.add(phoneDirectory);
                   System.out.println(ANSI_BLUE + "Add Successfull" + ANSI_RESET);
                   flag=false;
               }catch (InputMismatchException e){
                   System.out.println("InputMismatchException");
                   sc.nextLine();
               }
                }
            }
            if (choice == 3) {
                System.out.println("Enter phonenumber need edit");
                String phonenumber1 = directoryManage1.checkPhoneNumber();
                sc.nextLine();
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                System.out.println("Enter address: ");
                String address = sc.nextLine();
                System.out.println("Enter Email: ");
                String email = directoryManage1.checkEmail();
                System.out.println("Enter Facebook: ");
                String facebook = sc.nextLine();
                System.out.println("Enter sex: ");
                String sex = sc.nextLine();
                System.out.println("Group: ");
                String group = sc.nextLine();
                System.out.println("Enter birdth: ");
                String birdth = sc.nextLine();
                System.out.println("Enter phonenumber:");
                String phonenumber = directoryManage1.checkPhoneNumber();
                PhoneDirectory num = new PhoneDirectory(name, address, email, facebook, sex, group, birdth, phonenumber);
                directoryManage1.edit(phonenumber1, num);
                System.out.println(ANSI_BLUE+"Successfull"+ANSI_RESET);
                FileDocGhi.writerToFile(directoryManage1.phoneDirectoryList);
            }
            if (choice == 4) {
                System.out.println("Enter phonenumber need remove");
                sc.nextLine();

                String number = sc.nextLine();
                    directoryManage1.delete(number);
                    FileDocGhi.writerToFile(directoryManage1.phoneDirectoryList);

            }
            if (choice == 5) {
                System.out.println("Enter phonenumber need find");
                String num = directoryManage1.checkPhoneNumber();
                directoryManage1.findByPhoneNumber(num);
            }
            if (choice == 6) {
                FileDocGhi.writerToFile(directoryManage1.phoneDirectoryList);
                System.out.println("Done !!");
            }
            if (choice == 7) {
                FileDocGhi.readFromFile(directoryManage1.phoneDirectoryList);
            }
        } while (choice != 8);
    }
}
