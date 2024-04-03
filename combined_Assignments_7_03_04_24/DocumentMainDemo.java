abstract class Document {
    abstract public void getDocumnetType();

    public void documentSize(int x) {
        System.out.println("The Size of the Document is " + x + " Kb");
    }
}

class PdfDocument extends Document {
    public void getDocumnetType() {
        System.out.println("This is a pdf Document");
    }
}

class TextDocument extends Document {
    public void getDocumnetType() {
        System.out.println("This is a text Document");
    }
}

class ImageDocument extends Document {
    public void getDocumnetType() {
        System.out.println("This is a image Document");
    }
}

public class DocumentMainDemo {
    public static void main(String[] args) {
        PdfDocument pd = new PdfDocument();
        TextDocument td = new TextDocument();
        ImageDocument id = new ImageDocument();
        pd.getDocumnetType();
        pd.documentSize(752);
        td.getDocumnetType();
        td.documentSize(688);
        id.getDocumnetType();
        id.documentSize(968);
    }
}