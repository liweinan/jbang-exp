import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class after {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("test.txt");
        System.out.println("\n...content...\n");

        Charset charset = StandardCharsets.UTF_8;
        String content = new String(Files.readAllBytes(path), charset);

        System.out.println(content);


        String token = "_SPRING_VER_";
        String ver = "x.y.z.Final";

        // restore
        content = content.replaceAll(ver, token);
        Files.write(path, content.getBytes(charset));
    }
}
