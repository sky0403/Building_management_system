import java.util.*;
public class UnRedoListCommandFac extends CommandFactory{
    public Command create() throws Exception {
        return new UnRedoListCommand(caretaker);
    }
}
