import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static volatile String path = "C:\\Новая папка\\video.mp4";
    static volatile String url = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
    static final String ytDlpPath = System.getProperty("user.dir") + "\\src\\yt-dlp";
    public Main() {
    }

    public static void main(String[] args) {
        MyField myField = new MyField(350, 350);
    }

    public static void downloadVideo() {
        try {
            ProcessBuilder pb = new ProcessBuilder(ytDlpPath, url, "-o", path);
            pb.redirectErrorStream(true);
            Process process = pb.start();
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while((line = in.readLine()) != null) {
                System.out.println(line);
            }

            process.waitFor();
        } catch (Exception var4) {
            Exception e = var4;
            e.printStackTrace();
        }

    }
}
