public class UnRedoListCommand implements Command{
    private CareTaker caretaker;

    public UnRedoListCommand(CareTaker caretaker) {
        this.caretaker = caretaker;
    }

    @Override
    public void execute() {
        caretaker.displayUnRedoList();
    }
}
