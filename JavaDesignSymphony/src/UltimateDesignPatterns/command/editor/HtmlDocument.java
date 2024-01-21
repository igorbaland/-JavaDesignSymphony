package UltimateDesignPatterns.command.editor;

public class HtmlDocument {
    private String content;

    public void makeBolt() {
        content = "<b>" + content + "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
