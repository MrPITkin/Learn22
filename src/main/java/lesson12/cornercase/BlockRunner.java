package lesson12.cornercase;

import lesson12.exception.UnnamedException;

public class BlockRunner {

    public static void main(String[] args) {
        System.out.println("Пытаемся инициализировать блок");
        String name = null;
//        if (name == null) throw new UnnamedException("3*4*5");
        InitializingBlock initializingBlock = new InitializingBlock();
        System.out.println(initializingBlock.getName());
    }
}
