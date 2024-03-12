//Andrew Semchishin
//Tues March 12

public class Main {
    public static void main(String[] args) {
        BabyGronkLivyDunnRizz gyatt = new BabyGronkLivyDunnRizz("rizzlord87@gmail.com");
        gyatt.contact();
        OhioGrimaceShakeSkibidiToilet thatsLitt = new OhioGrimaceShakeSkibidiToilet("123-456-7890");
        thatsLitt.contact();
    }
}

abstract class Rizzler{
    public abstract void contact();
    private String name;
}

class BabyGronkLivyDunnRizz extends Rizzler{
    private String email;

    public BabyGronkLivyDunnRizz(String email) {
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Email: "+ email);
    }
}

class OhioGrimaceShakeSkibidiToilet extends Rizzler{
    private String phoneNumber;

    public OhioGrimaceShakeSkibidiToilet(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void contact() {
        System.out.println("Phone Number: " + phoneNumber);
    }
}