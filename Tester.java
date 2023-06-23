package co.develhope.introduction._18;

public class Tester {
    public static void main(String[] args) {
        Employee lavoratore1 = new Employee("Andrea" , "Rossi" , "Via Roma 10");
        Employee lavoratore2 = new Employee("Antonio" , "Esposito" , " Via Milano 5");

        Badge badge1 = new Badge(lavoratore1);
        badge1.showBadgeDetails();
        System.out.println(" ");
        Badge badge2 = new Badge(lavoratore2);
        badge2.showBadgeDetails();



    }
}
