package lesson10;

public record PrinterRecord(String text, String source) {
// record - неизменяемые объекты единожды инициализированные
    public void print() {
        System.out.printf("из record PrinterRecord метод print\n", text());
    }
}
