package OOP_7;

import java.util.List;

public class Operate implements NoteOperation {
    FileOperation fileOperation;
    NoteOperation noteOperation;

    public Operate(FileOperation fileOperation, NoteOperation noteOperation) {
        this.fileOperation = fileOperation;
        this.noteOperation = noteOperation;
    }

    @Override
    public Note addNote(String title, String text) throws Exception {
        List<Note> notes = readAllNotes();
        notes.add(noteOperation.addNote(title, text));
        System.out.println(notes);
        fileOperation.WriteToFile(notes);
        return noteOperation.addNote(title, text);
    }

    @Override
    public void updateNote(Integer id, String title, String text) throws Exception {
        List<Note> notes = readAllNotes();
        noteOperation.updateNote(id, title, text);
        fileOperation.WriteToFile(notes);
    }

    @Override
    public void deleteNote(Integer id) throws Exception {
        List<Note> notes = readAllNotes();
        noteOperation.deleteNote(id);
        fileOperation.WriteToFile(notes);
    }

    @Override
    public Note readNote(Integer id) throws Exception {
        return noteOperation.readNote(id);
    }

    @Override
    public List<Note> readAllNotes() {
        return noteOperation.readAllNotes();
    }

}