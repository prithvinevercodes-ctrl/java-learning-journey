public class MultiFunctionMachine implements Printer, Scanner {

    @Override
    public void printDocument() {
        System.out.println("Printing the document...");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning the document...");
    }
}
