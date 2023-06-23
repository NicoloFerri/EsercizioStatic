package co.develhope.introduction._18;

import java.util.Random;

public class Badge {

    private static int totalNumberOfEmployee;
    private String badgeIdCode;
    public Employee employee;
    private static void keepTrackOfEmployeeNumber(){
        totalNumberOfEmployee++;
    }

    private String generateBadgeIdCode(String name , String surname){
        String prefix = generateRandomString(3);
        String suffix = generateRandomString(3);
        return prefix + name + surname + suffix;
    }
    private String generateRandomString(int length){
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();

        for ( int i=0; i<length ; i++){
            char randomChar = alfabeto.charAt(random.nextInt(alfabeto.length()));
            randomString.append(randomChar);
        }
        return randomString.toString();
    }

public void showBadgeDetails(){
    System.out.println("Total number of employee tracked = " +totalNumberOfEmployee);
    employee.getEmployeeDetails();
    System.out.println(badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBagde){
        employee=employeeThatNeedsBagde;
        badgeIdCode=generateBadgeIdCode(employeeThatNeedsBagde.getName(),employeeThatNeedsBagde.getSurname());
        keepTrackOfEmployeeNumber();

    }


}
