package OOP_5;

import OOP_5.model.*;
import OOP_5.controllers.UserController;
import OOP_5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("PhoneBook.txt");
        Repository repository = new RepositoryFile(fileOperation, new UserMapper());
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}