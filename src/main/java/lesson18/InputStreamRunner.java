package lesson18;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class InputStreamRunner {


    @SneakyThrows({IOException.class})
    public static void main(String[] args) {
        String outFile = "R:\\test\\teSt.txt";
        try (InputStream fileInputStream = InputStreamRunner.class.getResourceAsStream("/file.txt")) {
            byte[] bytes = fileInputStream.readAllBytes();
            System.out.println(new String(bytes));
        }
//        fileInputStream.close();

        try (InputStream inputStream = InputStreamRunner.class.getResourceAsStream("/file.txt");
             FileOutputStream out = new FileOutputStream(outFile)) {
            inputStream.transferTo(out);
        }
        System.out.println("Запись в файл произведена успешно");

        var buffer = new char[512];
        try (FileReader fileReader = new FileReader(outFile)) {
            String result = "";
            while (fileReader.read(buffer) != -1) {
                result += new String(buffer);
            }
//            в result добавился хлам из buffer
            System.out.println("\nЧтение файла завершено. Его содержимое:\n" + result);
        }
//        inputStream.close();
//        out.close();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(InputStreamRunner.class.getResourceAsStream("/file.txt")/*,
                        StandardCharsets.ISO_8859_1.name()*/))) {
            System.out.println("Кодировка иная:\n" + br.lines().collect(Collectors.joining()));
        }
    }
}
