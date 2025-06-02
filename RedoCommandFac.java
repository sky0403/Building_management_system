public class RedoCommandFac extends CommandFactory{
    public Command create() throws Exception {
        return new RedoCommand(caretaker);
    }
}
