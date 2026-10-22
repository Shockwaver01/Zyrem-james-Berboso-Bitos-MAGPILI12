public class AccessCheck {
    public static void main(String[] args) {
        int userAge = 17;
        int securityPin = 4321;

      
        if (userAge >= 18) {
            System.out.println("Adult Account Verified.");
        }


        if (securityPin == 4321) {
            System.out.print("Access Granted");
        } else {
            System.out.print("Access Denied: Invalid PIN");
        }
    }
}
