package creacionales.prototype;

public class Contract implements DocumentPrototype{

    private String title;
    private String content;

    public Contract(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Constructor de clonación
    public Contract(Contract prototype) {
        this.title = prototype.title;
        this.content = prototype.content;
    }

    @Override
    public DocumentPrototype clone() {
        return new Contract(this);
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

    @Override
    public String toString() {
        return "Contract{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
