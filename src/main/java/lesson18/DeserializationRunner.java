package lesson18;

import lesson18.dto.Person;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationRunner {

    @SneakyThrows
    public static void main(String[] args) {
//        чтение из файла R:\Test\person.dat
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("R:\\test\\person.dat"))) {
            Person person = (Person) ois.readObject();
            System.out.println(person);
        }
    }
}
