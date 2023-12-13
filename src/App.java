import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //A
        Scanner tangentbord = new Scanner(System.in);
        System.out.print("Användarnamn: ");
        String namn = tangentbord.nextLine();
        System.out.print("Lösenord: ");
        String lösenord = tangentbord.nextLine();
        if (namn.equals("root") && lösenord.equals("pass")) {
            System.out.println("Ditt bankkonto har 0 SEK.");
        }else{
            System.out.println("Fel namn eller lösenord.");
        }

        //B
        int tal = tangentbord.nextInt();
        tangentbord.nextLine();
        if (tal==10) {
            System.out.println("Talet är lika med eller större än 10");
        }else{
            System.out.println("Talet är lika med eller mindre än 10");
        }
        tangentbord.close();
    }
}
