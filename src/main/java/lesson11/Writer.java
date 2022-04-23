package lesson11;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Writer {

    public void writeMethod(PrintStream arg, String str) throws IOException {
        System.out.println(" russian язык передаст ?");
        arg.write(str.getBytes());
        arg.write(str.getBytes(StandardCharsets.UTF_8));
        arg.write(str.getBytes("WinDoWs-1251"));
        arg.write(str.getBytes(Charset.forName("KOI8-R")));
        arg.write(str.getBytes(Charset.defaultCharset()));
        System.out.println(Charset.availableCharsets());
    }
}
