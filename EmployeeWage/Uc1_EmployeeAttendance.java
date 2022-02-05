package EmployeeWage;

public class Uc1_EmployeeAttendance {

        public static void main(String[] args) {
            int workHrs = 8;
            int perHrWage = 20;
            int dayWage = workHrs * perHrWage;
            int empAttendance =(int)(Math.random()*10)%2;

            if(empAttendance == 1) {
                System.out.println("Employee is present Today an will work for " + workHrs + " hours");
                System.out.println("Today's wage is " + dayWage + " Rupees");

            }
            else {
                System.out.println("Employee is absent today, and total wage is zero");
            }
        }
}
