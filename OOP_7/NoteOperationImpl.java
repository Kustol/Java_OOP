package OOP_7;

import java.util.ArrayList;
import java.util.List;

public class NoteOperationImpl implements NoteOperation {

    private List<Note> notes;

    public NoteOperationImpl() {
        this.notes = new ArrayList<Note>();
    }

    @Override
    public Note addNote(String title, String text) {
        int newId = notes.size() + 1;
        Note note = new Note(title, text);
        note.setId(newId);
        return note;

    }

    @Override
    public void updateNote(Integer id, String title, String text) throws Exception {
        try {
            for (Note note : notes) {
                if (note.getId() == id) {
                    note.setTitle(title);
                    note.setText(text);
                }
            }
        } catch (Exception e) {
            throw new Exception("id not found");
        }
    }

    @Override
    public void deleteNote(Integer id) throws Exception {
        for (Note note : notes) {
            if (note.getId() == id) {
                notes.remove(note);
            }
        }
    }

    @Override
    public Note readNote(Integer id) throws Exception {
        for (Note note : notes) {
            if (note.getId() == id) {
                return note;
            }
        }
        return null;

    }

    @Override
    public List<Note> readAllNotes() {

        return notes;
    }

}