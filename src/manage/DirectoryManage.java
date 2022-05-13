package manage;

import model.PhoneDirectory;
import validate.Validate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectoryManage{
    public List<PhoneDirectory> phoneDirectoryList = new ArrayList<>();

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
    public int search(String phoneNumber){
        for (int i = 0; i < this.phoneDirectoryList.size(); i++) {
            if (this.phoneDirectoryList.get(i).getPhoneNumber().equals(phoneNumber)){
                return i;
            }
        }return -1;
    }
    public void edit(String phoneNumber, PhoneDirectory phoneDirectory){
        for (int i = 0; i < phoneDirectoryList.size() ; i++) {
            if (phoneDirectoryList.get(i).getPhoneNumber().equals(phoneNumber)){
                phoneDirectoryList.set(i,phoneDirectory);
            }
        }
    }
    public void delete(String phoneNumber){
        int indexOf = search(phoneNumber);
        if (indexOf == -1) {
            System.out.println( "Not find" );
        } else {
            phoneDirectoryList.remove(indexOf);
            System.out.println( "Successfull!" );
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
            System.out.println("not find");
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
    public String checkEmail(){
        String mail;
        while (true){
            String mail1 = sc.nextLine();
            if (!validate.validateEmail(mail1)){
                System.out.println("Không trùng");
            }else {
                mail = mail1;
                break;
            }
        }
        return mail;
    }
}
