package _04_Class_Object_java.exercise;

import java.util.Date;

public  class StopWatch {
   private Date startTime;
   private Date endTime;
   public StopWatch() {

   }
    Date startTime() {
       return startTime= new Date();
    }
    public Date start() {
        return startTime= new Date();
    }
    public Date end() {
        return endTime= new Date();
    }
    public long getElapsedTime() {
        long date1= endTime.getTime();
        long date2 = startTime.getTime();
       long date= endTime.getTime() - startTime.getTime();
       return date;
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.getElapsedTime());
    }
}
