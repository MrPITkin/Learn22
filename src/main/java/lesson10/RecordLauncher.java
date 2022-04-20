package lesson10;

public class RecordLauncher {
    public static void main(String[] args) {
        PrinterRecord objectPR = new PrinterRecord("этава", "самава");
        System.out.printf("запись %s %<s %2$s %<s\n", objectPR.text(), objectPR.source());

    }
}
