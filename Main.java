import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Date(int year, int month, int date)
        Date birthDate = new Date(1987,0,22); //Remember to subtract 1 to the month
        Date expirationDate = new Date(2019,10,13);
        long id = 1287564540101L;
        Passport myPassport = new Passport(id, "Conny", "Smith", "Indian", birthDate, expirationDate, 'F');
        boolean passportExpired = myPassport.isExpired();
        
        if (passportExpired == true) {
            System.out.println("You need to renew your passport");
        } else {
            System.out.println("Your passport is still valid");
        }
    }
}
