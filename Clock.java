class Clock {
    private int hour;
    private int minute;

    final int legnth_of_toString_Clock= 5;
    final int legnth_of_toString_AcClock= 8;



    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public boolean equals(Object object)
    {
        Clock clock;
        if (object instanceof Clock){
            clock = (Clock) object;
            if (clock.toString().length() != legnth_of_toString_Clock) return false;
            if ((this.hour == clock.getHour()) && (this.minute == clock.getMinute())) return true;
        }
        return false;

    }


    @Override
    public int hashCode()
    {
        return (this.hour * 60 + this.minute);
        //number of minutes after midnight

    }


    @Override
    public String toString()
    {
        return ("" + (this.hour / 10) + (this.hour%10) + ":" + (this.minute/10) + (this.minute%10));

    }


    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
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

    public int getSeconds() {
        return seconds;
    }

    @Override
    public boolean equals(Object object)
    {
        AccurateClock clock;
        if (object instanceof AccurateClock){
            clock = (AccurateClock) object;
            if (clock.toString().length() != legnth_of_toString_AcClock) return false;
            if ((this.getHour() == clock.getHour()) && (this.getMinute() == clock.getMinute()) &&
                    (this.seconds == clock.getSeconds())) return true;
        }
        return false;

    }


    @Override
    public int hashCode()
    {
        return (this.getHour() * 3600 + this.getMinute() * 60 + this.seconds);
        //number of seconds after midnight
    }


    @Override
    public String toString()
    {
        return (super.toString() + ":" + (this.seconds/10) + (this.seconds %10));
    }

    /*
    Additional methods...
     */
}


