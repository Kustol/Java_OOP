package OOP_7;


public class Main {
    public static void main(String[] args) throws Exception {
        NoteOperation noteOperation = new NoteOperationImpl();
        NoteMapper noteMapper = new NoteMapper();
        FileOperation fileOperation = new FileOperationImpl(
                "C:\\Users\\smert\\Desktop\\Work\\Java\\Java_4\\src\\main\\java\\OOP_7\\notes.txt", noteMapper);
        Operate operate = new Operate(fileOperation, noteOperation);
        NoteCreator noteCreator = new NoteCreator();
        View view = new View(noteCreator, operate);
        view.run();

    }
}