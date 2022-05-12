package lesson12.cornercase;

import lesson12.exception.UnnamedException;

public class InitializingBlock {

    private final String name;
/*
    {
        name = "Example пример";
    }
*/
    public InitializingBlock() {
//        throw new UnnamedException("Задайте имя объекту");
        this.name = "неизвестный Unknown";
    }

    public InitializingBlock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
