package danhba;

import validate.Validate;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectoryManage{
    List<PhoneDirectory> phoneDirectoryList = new ArrayList<>();


    public DirectoryManage() {

    }

    public void display(){
        for (int i = 0; i < this.phoneDirectoryList.size(); i++) {
            System.out.println(this.phoneDirectoryList.get(i));
        }
    }
    public void add(PhoneDirectory phoneNumber){
        phoneDirectoryList.add(phoneNumber);
    }
    public int search(int phoneNumber){
        for (int i = 0; i < this.phoneDirectoryList.size(); i++) {
            if (this.phoneDirectoryList.get(i).getPhoneNumber().equals(phoneNumber)){
                return i;
            }
        }return -1;
    }
    public void edit(int phoneNumber, PhoneDirectory phoneDirectory){
       int indexOf = search(phoneNumber);
       if (indexOf == -1){
           System.out.println("ko có");
       }else {
           phoneDirectoryList.set(indexOf,phoneDirectory);
       }
    }
    public void delete(int phoneNumber){
        for (int i = 0; i < this.phoneDirectoryList.size(); i++) {
            if (search(phoneNumber)!= -1){
                phoneDirectoryList.remove(search(phoneNumber));
            }else
                System.out.println("Không có");
        }
    }
    public void findByPhoneNumber(String phoneNumber){
        int dem = 0;
        for (PhoneDirectory phoneDirectory : this.phoneDirectoryList) {
            if (phoneDirectory.getPhoneNumber().equals(phoneNumber)) {
                System.out.println(phoneDirectory);
                dem++;
            }
        }if (dem==0){
            System.out.println("Không tìm thấy số điện thoại nào");
        }
    }
    Validate validate = new Validate();
    Scanner sc = new Scanner(System.in);
    public String checkPhoneNumber(){
        String num;
        while (true){
            String phone = sc.nextLine();
            if (!validate.validatePhone(phone)){
                System.out.println("Không trùng");
            }else {
                num = phone;
                break;
            }
        }
        return num;
    }

}
