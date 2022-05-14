package hw12ivanoff.exception;

import static hw12ivanoff.Matrix.*;

public class MyArraySizeException extends RuntimeException{
//    private final int wrongRows;
//    private final int wrongColumns;

    public MyArraySizeException(int wrongRows, int wrongColumns, String message) {
        super(String.format("%s\nКоличество строк в матрице ожидалось равным %d," +
                " а количество колонок, равным %d.\nЗапрошена генерация матрицы" +
                " размером %d x %d", message, ROWS, COLUMNS, wrongRows, wrongColumns));
//        this.wrongRows = wrongRows;
//        this.wrongColumns = wrongColumns;
    }
/*

    public int getWrongRows() {
        return wrongRows;
    }

    public int getWrongColumns() {
        return wrongColumns;
    }
*/
}
