import java.util.*;
import java.io.*;

public class AddCommandFac extends CommandFactory{
    Vector _buildings;

    public AddCommandFac() {
		_buildings = null;
	}

	public void setBuildings(Vector buildings) {
		this._buildings = buildings;
	}

	public Command create() throws Exception {
        return new AddCommand(_buildings,caretaker);
	}
}
