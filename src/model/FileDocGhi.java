package model;

import model.PhoneDirectory;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class FileDocGhi {
    public static void writerToFile( List<PhoneDirectory> phoneNumberList) throws IOException {
    File file = new File("E:\\HocCodegym\\TestMoodule2\\Test2.csv");
    PrintWriter pw = new PrintWriter(file);
        String str = "Name,Adsress,Email,Facebook,Sex,Gruop,Birdth,Numberphone\n";
        for (PhoneDirectory i: phoneNumberList) {
            str += i.getName() + "," + i.getAddress()+","+ i.getEmail()+","+ i.getFacebook()+","+ i.getSex()+"," + i.getGroup()+","+ i.getBirdth()+","+ i.getPhoneNumber() + "\n";
        }
        pw.write(str);
        pw.flush();
        pw.close();
    }
    public static void readFromFile(List<PhoneDirectory>phoneDirectoryList) throws IOException {
        File file1 = new File("E:\\HocCodegym\\TestMoodule2\\Test2.csv");
        Scanner scanner = new Scanner(file1);
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            } else {
                String arr[] = line.split(",");
                PhoneDirectory phone = new PhoneDirectory(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6],arr[7]);
                phoneDirectoryList.add(phone);
                System.out.println(phone);
            }
        }
    }
}
