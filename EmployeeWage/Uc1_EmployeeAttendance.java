package EmployeeWage;

public class Uc1_EmployeeAttendance {

        public static void main(String[] args) {
            int workHrs;
            int empAttendance =(int)(Math.random()*10)%2;

            if(empAttendance == 1) {
                workHrs=8;
                System.out.println("Employee is present Today an will work for " + workHrs + " hours");
            }
            else {
                System.out.println("Employee is absent today");
            }
        }
}
