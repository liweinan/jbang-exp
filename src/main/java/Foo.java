import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Foo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("foo.txt");
        System.out.println(path.toAbsolutePath());

        Charset charset = StandardCharsets.UTF_8;
        String content = new String(Files.readAllBytes(path), charset);
        System.out.println(content);
        System.out.println(content.replaceAll("_SPRING_VER", "1.0.0"));


    }
}
