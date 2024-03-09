package CreationalUltimateDesignPatterns.builder.word;

public class Text implements Element {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
