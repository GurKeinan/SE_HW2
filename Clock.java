class Clock {
    private int hour;
    private int minute;

    final int legnth_of_toString_Clock= 5;
    final int legnth_of_toString_AcClock= 8;


    /**
     * constructor of new clock
     * @param hour- the hour on the clock
     * @param minute- the minute on the clock
     */
    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    /**
     * comparing this to other clock according to the asked method-
     * the hours and minutes on the 2 clocks should be identical
     * first we check if the given object is clock, llater we overrule AccurateClock by comparing the lengths of the to
     * strings- clock-5 , AccurateClock- 7
     * @param object- comparing this to object
     * @return true if equals or false otherwise
     */
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

    /**
     * hashcode for clock
     * @return number of minutes after midnight
     */
    @Override
    public int hashCode()
    {
        return (this.hour * 60 + this.minute);
        //number of minutes after midnight

    }

    /**
     * toString for clock
     * @return string in format HH:MM when the hours represented in HH and the minutes in MM
     */
    @Override
    public String toString()
    {
        return ("" + (this.hour / 10) + (this.hour%10) + ":" + (this.minute/10) + (this.minute%10));

    }

    /**
     * get method for hour
     * @return this' hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * get method for minutes
     * @return this' minutes
     */
    public int getMinute() {
        return minute;
    }



    /*
    Additional methods...
     */
}

class AccurateClock extends Clock {
    private int seconds;

    /**
     * constructor for AccurateClock
     * @param hour- the new clock's hour
     * @param minute- the new clock's minutes
     * @param seconds- the new clock's seconds
     */
    public AccurateClock(int hour, int minute, int seconds) {
        super(hour, minute);
        this.seconds = seconds;

    }

    /**
     * get method for seconds
     * @return this' seconds
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * comparing this to other AccurateClock according to the asked method-
     * the hours, minutes and seconds on the 2 clocks should be identical
     * first we check if the given object is AccurteClock
     * @param object- comparing this to object
     * @return true if equals or false otherwise
     */
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

    /**
     * hashcode for AccurateClock
     * @return the number of seconds after midnight
     */
    @Override
    public int hashCode()
    {
        return (this.getHour() * 3600 + this.getMinute() * 60 + this.seconds);
        //number of seconds after midnight
    }


    /**
     * toString for AccurateClock
     * @return string in HH:MM:SS format where the HH represent hours, MM minutes and SS seconds
     */
    @Override
    public String toString()
    {
        return (super.toString() + ":" + (this.seconds/10) + (this.seconds %10));
    }

    /*
    Additional methods...
     */
}


