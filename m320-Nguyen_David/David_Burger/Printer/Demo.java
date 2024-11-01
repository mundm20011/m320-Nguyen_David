package Printer;

public class Demo {
    public static void main(String[] args) {
        HP hp = new HP();
        Epson epson = new Epson();
        Printer printer = new Printer(hp);
        printer.print();
    }
}
