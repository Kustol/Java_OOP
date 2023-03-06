package OOP_7;

import java.util.List;

public class View {
    NoteCreator noteCreator;
    Operate operate;

    public View(NoteCreator noteCreator, Operate operate) {
        this.noteCreator = noteCreator;
        this.operate = operate;
    }

    public void run() {
        Commands com = Commands.NONE;
        showCommands();

        while (true) {
            String command = noteCreator.promptString("Введите команду: ");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Неопознанная команда");
            }
            if (com == Commands.EXIT)
                return;
            try {
                switch (com) {
                    case CREATE:
                        operate.addNote(noteCreator.promptString("Заголовок: "), noteCreator.promptString("Текст: "));
                        break;
                    case READ:
                        caseRead();
                        break;
                    case LIST:
                        caseList();
                        break;
                    case UPDATE:
                        caseUpdate();

                        break;
                    case DELETE:
                        caseDeleted();
                        break;
                    case EXIT:
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    private void showCommands() {
        System.out.println("Список команд:");
        for(Commands c : Commands.values()) {
            System.out.println(c);

        }
    }

    private void caseRead() throws Exception {
        Integer findId = noteCreator.promptInteger("Введите ID для поиска: ");
        System.out.println(operate.readNote(findId));
    }

    private void caseList() {
        List<Note> notes = operate.readAllNotes();
        for (Note note : notes) {
            System.out.println(note);
            System.out.println();
        }
    }

    private void caseUpdate() throws Exception {
        Integer findIdforUpdate = noteCreator.promptInteger("Введите ID для поиска: ");
        String titleForUpdate = noteCreator.promptString("Заголовок: ");
        String textForUpdate = noteCreator.promptString("Текст: ");
        operate.updateNote(findIdforUpdate, titleForUpdate, textForUpdate);
    }

    private void caseDeleted() throws Exception {
        Integer findIdforDel = noteCreator.promptInteger("Введите ID для удаления: ");
        operate.deleteNote(findIdforDel);
    }

}