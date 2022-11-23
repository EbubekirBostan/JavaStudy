package Gun02_EmailCreation;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EmailApp {
    String firstName;
    String lastName;
    String passWord;
    String department;
    String email;
    String emailSuffix="clarusway.com";//şirket domaini
    int mailBoxCapacity=1000;
    int defaultPasswordLenght=12;

    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department=setDepartmant();
        this.passWord=setRandomPassword(defaultPasswordLenght);
        email=firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + emailSuffix;
    }



    public String setDepartmant(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Departmanınızı seçiniz...\n"+"\n1 Test automation \n2 Full Stack Developer \n3 Salesforce \n0 Hicbiri\nGiriş = ");
        int options=scanner.nextInt();
        if (options==1){
            return "testautomation";
        } else if (options==2) {
            return "fullstackdeveloper";
        } else if (options==3) {
            return "salesforce";
        }else return "";

    }
    public String setRandomPassword(int lenght){
        String passWordSet="ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";
        char[]password=new char[lenght];
        for (int i = 0; i <lenght ; i++) {
         int random=(int)(Math.random()*passWordSet.length());
         password[i]=passWordSet.charAt(random);
        }
        return new String(password);
    }
    public String showInfo(){
        return "Ad-Soyad: " + firstName + " " + lastName + "\n"+
                "Sirket Email: " + email + "\n"+
                "Capacity: " + mailBoxCapacity + "mb \n"+
                "Password: " + passWord;
    }
}
