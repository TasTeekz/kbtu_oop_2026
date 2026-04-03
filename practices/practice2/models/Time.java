package practices.practice2.models;

public class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public int compareTo(Time other) {
        if (this.hour != other.hour) {
            return Integer.compare(this.hour, other.hour);
        }
        if (this.minute != other.minute) {
            return Integer.compare(this.minute, other.minute);
        }
        return Integer.compare(this.second, other.second);
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}