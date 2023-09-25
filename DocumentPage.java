public class DocumentPage {
    private int pageNumber;
    private String content;

    public DocumentPage(int pageNumber, String content) {
        this.pageNumber = pageNumber;
        this.content = content;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getContent() {
        return content;
    }
}
