package model;

public class PhoneDirectory {
    private String name,address,email,facebook,sex,group,birdth;
    private String phoneNumber;

    public PhoneDirectory() {
    }

    public PhoneDirectory(String name, String address, String email, String facebook, String sex, String group, String birdth, String phonenumber) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.facebook = facebook;
        this.sex = sex;
        this.group = group;
        this.birdth = birdth;
        this.phoneNumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getBirdth() {
        return birdth;
    }

    public void setBirdth(String birdth) {
        this.birdth = birdth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "PhoneDirectory{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", facebook='" + facebook + '\'' +
                ", sex='" + sex + '\'' +
                ", group='" + group + '\'' +
                ", birdth='" + birdth + '\'' +
                ", phonenumber=" + phoneNumber +
                '}';
    }
}
