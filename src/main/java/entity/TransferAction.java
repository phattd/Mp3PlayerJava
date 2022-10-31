package entity;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class TransferAction {
    private static ControlCommand controlCommand = ControlCommand.NONE;
    private static final PropertyChangeSupport support = new PropertyChangeSupport(TransferAction.class);

    public static void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
    public static void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public static void setControlCommand(ControlCommand newControlCommand) {
        ControlCommand oldValue = TransferAction.controlCommand;
        TransferAction.controlCommand = newControlCommand;
        support.firePropertyChange("value", oldValue, newControlCommand);
    }

    public static ControlCommand getControlCommand() {
        return controlCommand;
    }
}
