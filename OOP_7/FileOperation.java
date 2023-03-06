package OOP_7;


import java.util.List;
public interface FileOperation {

    void WriteToFile(List<Note> notes)throws Exception;

    List<Note> ReadFromFile()throws Exception;
}