package ua.opnu;

public class TimeSpan {

    int hours;
    int minutes;

    public TimeSpan(int hours, int minutes) {
        if (hours >= 0 && minutes >= 0 && minutes < 60) {
            this.hours = hours;
            this.minutes = minutes;
        }
    }

    public TimeSpan() {
        this.hours = 0;
        this.minutes = 0;
    }

    public TimeSpan(int minutes) {
        this.hours = 0;
        this.minutes = minutes;
    }

    public TimeSpan(TimeSpan timeSpan) {
        this.hours = timeSpan.getHours();
        this.minutes = timeSpan.getMinutes();
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void add(int hours, int minutes) {
        if (!(hours < 0 || minutes < 0 || minutes > 59)) {
            if (this.minutes + minutes > 60) {
                ++hours;
                minutes -= 60;
            }
            this.hours += hours;
            this.minutes += minutes;
        }
    }

    public void add(int minutes) {
        if (!(minutes < 0 || minutes > 59)) {
            if (this.minutes + minutes > 60) {
                ++this.hours;
                minutes -= 60;
            }
            this.minutes += minutes;
        }
    }

    public void add(TimeSpan timespan) {
        if (getMinutes() + timespan.getMinutes() > 60) {
            ++timespan.hours;
            timespan.minutes -= 60;
        }
        this.hours += timespan.getHours();
        this.minutes += timespan.getMinutes();
    }

    public double getTotalHours() {
        return getHours() + (double) getMinutes() / 60;
    }

    public int getTotalMinutes() {
        return getMinutes() + getHours() * 60;
    }

    public void subtract(TimeSpan span) {
        if ((getHours() - span.getHours() > 0) || ((getHours() - span.getHours() == 0)
                && (getMinutes() - span.getMinutes() > -1))) {
            if (getMinutes() - span.getMinutes() < 0) {
                --this.hours;
                this.minutes += 60;
            }
            this.hours -= span.getHours();
            this.minutes -= span.getMinutes();
        }
    }

    public void subtract(int minutes) {
        if (this.minutes - minutes < 0 && this.hours > 0) {
            --this.hours;
            this.minutes += 60;
        }
        if (this.minutes - minutes > 0)
            this.minutes -= minutes;
    }

    public void subtract(int hours, int minutes) {
        if ((this.hours - hours > 0) || ((hours - this.hours == 0)
                && (this.minutes - minutes > -1))) {
            if (this.minutes - minutes < 0) {
                --this.hours;
                this.minutes += 60;
            }
            this.hours -= hours;
            this.minutes -= minutes;
        }
    }

    public void scale(int factor) {
        if (factor > 0) {
            long newTotalMinutes = (long) getTotalMinutes() * factor;
            this.hours = (int) newTotalMinutes / 60;
            this.minutes = (int) newTotalMinutes % 60;
        }
    }
}
