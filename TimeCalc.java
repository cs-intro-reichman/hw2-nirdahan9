public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt(""+args[0].charAt(0)+args[0].charAt(1));
        int minutes = Integer.parseInt(""+args[0].charAt(3)+args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int hoursToAdd = minutesToAdd/60;
        minutesToAdd%=60;
        minutes+=minutesToAdd;
        hours+=hoursToAdd+(minutes/60);
        hours%=24;
        minutes%=60;
        String hourString="", minuteString="";
        if(hours<10) hourString="0"+hours;
        else hourString = "" + hours;
        if(minutes<10) minuteString="0" +minutes;
        else minuteString = "" + minutes;
        System.out.println(hourString+":"+minuteString);
    }
}
