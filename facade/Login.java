import java.util.Scanner;

public class Login {
public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    String username;
    String password;
    System.out.println("LogIn: ");
    System.out.println("Username:");
    username= input.next();
    System.out.println("Password: ");
    password=input.next();
    if(username.equals(username) && password.equals(password))
System.out.println("you are logged in successfully");
}
}
