//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public enum FieldStrings {
    ACCEPT_URL("Принять URl"),
    ACCEPT_PATH("Принять путь"),
    DOWNLOAD("СКАЧАТЬ"),
    PATH_TO_DOWNLOAD("Путь к файлу,куда будет скачано видео"),
    LINK_ON_YOUTUBE("Ссылка на видео,которое будет скачано");

    String string;

    private FieldStrings(String string) {
        this.string = string;
    }

    public String toString() {
        return this.string;
    }
}
