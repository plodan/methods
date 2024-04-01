import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main (String[] args ) {
        Printer printer = new Printer();
        printer.append("some text 133","Справка");
        printer.append("some text 210", 658);
        System.out.println(printer.getPagesCount());
        printer.print();
        printer.append("some text 8",530);
        printer.clear();
        printer.append("some text 33", "Договор", 312);
        printer.append("some text 11");
        printer.print();
        System.out.println(printer.getAllPagesPrinted());

    }

}


