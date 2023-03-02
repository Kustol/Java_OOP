package OOP_5.views;



import OOP_5.controllers.UserController;
import OOP_5.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;

    public static  boolean output;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;
        showCommands();

        while (true) {
            output = false;
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        output = choice("Список будет записан через ';' - true, через ', ' - false: ");
                        caseCreate();
                        break;
                    case READ:
                        caseRead();
                        break;
                    case LIST:
                        caseList();
                        break;
                    case DELETE:
                        caseDeleted();
                        break;
                    case UPDATE:
                        caseUpdate();
                        break;
                }
            }
            catch  (Exception ee){
                System.out.printf("%s Произошла ошибка \n ", ee.getMessage());
            }
        }
    }

    private void caseUpdate() throws Exception {
        String id = prompt("Введите id пользователя: ");
        try {
            User user = userController.readUser(id);
            System.out.println(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        userController.deleteUser(id);
        caseCreate();
    }

    private void showCommands() {
        System.out.println("Список команд:");
        for(Commands c : Commands.values()) {
            System.out.println(c);
        }
    }

    private void caseDeleted() {
        String id = prompt("Введите ID пользователя, которого надо удалить: ");
        userController.deleteUser(id);
        System.out.println("Пользователь удалён");
    }

    private void caseCreate() throws Exception {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        userController.saveUser(new User(firstName, lastName, phone));
    }

    private void caseRead() {
        String id = prompt("Идентификатор пользователя: ");
        try {
            User user = userController.readUser(id);
            System.out.println(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void caseList() {
        List<User> usersList = userController.readUsers();
        for (User user : usersList) {
            System.out.println(user);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private boolean choice(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextBoolean();
    }

}