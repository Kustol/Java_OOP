package OOP_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileOperationImpl implements FileOperation {
    private String fileName;
    NoteMapper noteMapper;
    NoteOperation noteOperation;

    public FileOperationImpl(String fileName, NoteMapper noteMapper) {
        this.fileName = fileName;
        this.noteMapper = noteMapper;
    }

    @Override
    public void WriteToFile(List<Note> notes) throws Exception {
        try {
            FileWriter writer = new FileWriter(fileName, false);
            for (Note note : notes) {
                writer.append(noteMapper.map(note));
                writer.write("\n");
            }
            writer.flush();
        } catch (Exception e) {
            throw new Exception("can`t write file");
        }

    }

    @Override
    public List<Note> ReadFromFile() throws Exception {
        List<String> lines = new ArrayList<>();
        List<Note>notes = noteOperation.readAllNotes();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            if (line != null) {
                lines.add(line);
            }
        } catch (Exception e) {
            throw new Exception("can`t read file");
        }

        for (String line : lines) {
            notes.add(noteMapper.map(line));
        }

        return notes;
    }

}