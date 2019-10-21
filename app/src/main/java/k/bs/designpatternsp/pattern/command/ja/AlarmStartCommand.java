package k.bs.designpatternsp.pattern.command.ja;

public class AlarmStartCommand implements Command {
    private Alarm theAlarm;

    public AlarmStartCommand(Alarm theAlarm) {
        this.theAlarm = theAlarm;
    }

    public void execute() {
        theAlarm.start();
    }
}
