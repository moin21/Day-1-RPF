package EmployeeWage;

public class Uc1_EmployeeAttendance {

        public static void main(String[] args) {
            int workHrs = 8;
            int perHrWage = 20;
            int dayWage = workHrs * perHrWage;
            int empAttendance =(int)(Math.random()*10)%2;

            if(empAttendance == 1) {

                int empWorking = (int) (Math.random() * 10) % 2;   //emoWorking =1 (Full Time), else part-time
                if (empWorking == 1) {
                    System.out.println("Employee is present Full Time Today an will work for " + workHrs + " hours");
                    System.out.println("Today's wage is " + dayWage + " Rupees");
                } else {
                    workHrs = 4;
                    System.out.println("Employee is present Full Time Today an will work for " + workHrs + " hours");
                    System.out.println("Today's wage is " + dayWage/2 + " Rupees");
                }

            }
            else {
                System.out.println("Employee is absent today, and total wage is zero");
            }
        }
}
