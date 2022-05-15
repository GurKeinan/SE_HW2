class Clock {
    private int hour;
    private int minute;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    /*
    Additional methods...
     */
}

class AccurateClock extends Clock {
    private int seconds;

    public AccurateClock(int hour, int minute, int seconds) {
        super(hour, minute);
        this.seconds = seconds;
    }

    /*
    Additional methods...
     */
}


