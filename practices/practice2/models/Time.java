package practices.practice2.models;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        if (!isValid(hour, minute, second)) {
            throw new IllegalArgumentException("Invalid time provided");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public boolean isValid(int hour, int minute, int second) {
        return (hour >= 0 && hour <= 23) &&
                (minute >= 0 && minute <= 59) &&
                (second >= 0 && second <= 59);
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        String period = (hour >= 12) ? "PM" : "AM";
        int standardHour = hour % 12;
        if (standardHour == 0)
            standardHour = 12;

        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }

    public void add(Time other) {
        int totalSeconds = this.hour * 3600 + this.minute * 60 + this.second + other.hour * 3600
                + other.minute * 60 + other.second;
        this.hour = (totalSeconds / 3600) % 24;
        this.minute = (totalSeconds % 3600) / 60;
        this.second = totalSeconds % 60;
    }
}
