package OOP_7;

import java.util.List;

public interface NoteOperation {
    Note addNote(String title, String text) throws Exception;

    void updateNote(Integer id, String title, String text) throws Exception;

    void deleteNote(Integer id) throws Exception;

    Note readNote(Integer id) throws Exception;

    List<Note> readAllNotes();


}