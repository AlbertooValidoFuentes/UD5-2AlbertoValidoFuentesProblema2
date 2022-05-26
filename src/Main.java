public class Main {
    public static void main(String[] args) {
        VeredaGT veredaGT = new VeredaGT("ABC123", 50.0f);

        veredaGT.move();
        veredaGT.move();

        System.out.println(veredaGT.energyLevel());

        veredaGT.recharge();

        System.out.println(veredaGT.status());
    }
}