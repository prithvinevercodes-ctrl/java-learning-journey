public class InterfacesDemo {
    public static void main(String[] args) {

        // -----------------------------------------
        // 1. Vehicle Interface Example
        // -----------------------------------------
        System.out.println("===== VEHICLE INTERFACE EXAMPLE =====");
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.stop();

        System.out.println();

        v2.start();
        v2.stop();

        // -----------------------------------------
        // 2. Payment Interface Example
        // -----------------------------------------
        System.out.println("
===== PAYMENT INTERFACE EXAMPLE =====");
        Payment p1 = new UPIPayment();
        Payment p2 = new CardPayment();

        p1.pay(500);
        p2.pay(1200);

        // -----------------------------------------
        // 3. Multiple Interface Example
        // -----------------------------------------
        System.out.println("
===== MULTIPLE INTERFACE EXAMPLE =====");
        MultiFunctionMachine m1 = new MultiFunctionMachine();

        m1.printDocument();
        m1.scanDocument();
    }
          }
