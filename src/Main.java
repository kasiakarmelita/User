import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String login=scanner.next();
        String firtname=scanner.next();
        String email=scanner.next();

        try {
            System.out.println(User.create(login,email,firtname));
        } catch (NullParameterException e) {
            e.printStackTrace();
            System.out.println("Próba stworzenia użytkownika nie powiodła się");
        } finally {
            System.out.println("Koniec programu");
        }



    }
}
