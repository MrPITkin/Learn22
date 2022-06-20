package lesson19;

//import org.apache.commons.io.FileUtils;
import lesson19.util.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;

public class FileRunner {

    public static void main(String[] args) {
        String fileLocation = "R:/tEst";
        String fileName = "TeSt.tXt";
//        String fileLocation = "R:\\tEst\\TeSt.tXt";
        File file = new File(fileLocation, fileName);
//        fileName = file.getName();
        System.out.println("Имя файла: " + fileName);
        System.out.println("Расширение файла: " + FileUtils.getFileExtension(fileName));
        System.out.println("Расширение файла: " + FilenameUtils.getExtension(fileName));
        System.out.println("Разделитель пути в текущей операционной системе: "
                + System.getProperty("file.separator"));
        System.out.println("Родительская директория файла: " + file.getParent());
        System.out.println("Существует ли файл ? " + (file.exists() ? "Да": "Нет"));
        System.out.println("Это файл ? " + (file.isFile() ? "Да": "Нет"));
        System.out.println("Создались ли промежуточные каталоги ? "
                + (file.mkdirs() ? "Да": "Нет"));
    }
}
