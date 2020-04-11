public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year){
        if (month == 12) {
            if (day == getDayOfMonth(month)){
                day = 1;
                month = 1;
                year = year + 1;
            } else {
                day += 1;
            }
        } else if (month == 2) {
            if (isLeapYear(year)){
                if ( day == getDayOfMonth(month)){
                    day += 1;
                } else {
                    day = 1;
                    month = month + 1;
                }
            } else {
                day = 1;
                month = month + 1;
            }
        } else {
            if ( day == getDayOfMonth(month)){
                day = 1;
                month = month + 1;
            } else {
                day = day + 1;
            }
        }
        return day + "/" + month + "/" + year;
    }
    public static int getDayOfMonth(int month){
        int dayOfMonth;
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfMonth = 30;
                break;
            case 2:
                dayOfMonth = 28;
                break;
            default:
                dayOfMonth = 31;
                break;
        }
        return dayOfMonth;
    }

    public static boolean isLeapYear(int year){
        boolean isLeapYear = false;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }
}
