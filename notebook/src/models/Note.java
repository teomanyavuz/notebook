package models;

public class Note {
    private int id;
    private String title;
    private String content;

    // Yapıcı metod: sadece content alır
    public Note(String content) {
        this.content = content;
    }

    // Yapıcı metod: id, content alır
    public Note(int id, String content) {
        this.id = id;
        this.content = content;
    }

    // Yapıcı metod: id, title, content alır
    public Note(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // id, title, content için getter ve setter metodları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Notu yazdırmak için bir toString metodu (isteğe bağlı)
    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
