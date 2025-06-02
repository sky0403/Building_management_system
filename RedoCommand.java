public class RedoCommand implements Command{
    private CareTaker caretaker;

    public RedoCommand(CareTaker caretaker) {
        this.caretaker = caretaker;
    }

    @Override
    public void execute() {
        caretaker.redo();
    }
}
