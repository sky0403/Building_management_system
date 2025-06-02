public class UndoCommandFac extends CommandFactory{
    public Command create() throws Exception {
        return new UndoCommand(caretaker);
    }
}
