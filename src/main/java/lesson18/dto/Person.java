package lesson18.dto;

import lombok.*;

import java.io.Serial;

// аннотации плагина Lombok
@Data
@EqualsAndHashCode/*(exclude = "height")*//*(of = "name")*/
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor //конструктор для final полей
//@ToString

public class Person {

    @Serial
    private static final long serialVersionUID = 2L;

    private String name;
    private int age;
    private Sex sex;
    private double height;

    public Person(String name) {
        this.name = name;
    }

    public void beOlder() throws Exception {
        this.age++;
    }

//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeObject(this);
//    }
//
//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//
//    }
}
