import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class before {

    public static void main(String... args) throws Exception {

        Path path = Paths.get("test.txt");
        Charset charset = StandardCharsets.UTF_8;

        String content = new String(Files.readAllBytes(path), charset);

        String token = "_SPRING_VER_";
        String ver = "x.y.z.Final";

        content = content.replaceAll(token, ver);
        Files.write(path, content.getBytes(charset));
    }
}
