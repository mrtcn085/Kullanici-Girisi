import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userName, password;

        System.out.print("Kullanıcı Adınız : ");
        userName=keyboard.nextLine();

        System.out.println("Şifrenizi Giriniz : ");
        password=keyboard.nextLine();

        if(userName.equals("patika") && password.equals("java101")){
            System.out.println("Giris Yaptınız");
        } else if (userName.equals("patika") && !password.equals("java101")) {
            System.out.println("Şifrenizi Sıfırlamak İstermisiniz ? (yes/no)");
            String x=keyboard.nextLine();
            String newPassword=keyboard.nextLine();
            if(newPassword==password){
                System.out.println("Şifre Oluşturulamadı, lütfen başka şifre giriniz.");
            }

            else{
                System.out.println("Şifre Oluşturuldu ! ");
            }
        }

    }
}