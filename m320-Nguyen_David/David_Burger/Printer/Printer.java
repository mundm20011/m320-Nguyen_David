package Printer;

public class Printer implements Task {
    Task printer;
    public Printer(Task printer) {
        this.printer = printer;
    }
    @Override
    public void print() {
        this.printer.print();
    }
}
