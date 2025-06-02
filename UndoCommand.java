public class UndoCommand implements Command{
    private CareTaker caretaker;

    public UndoCommand(CareTaker caretaker) {
        this.caretaker = caretaker;
    }

    @Override
    public void execute() {
        caretaker.undo();
    }
}
