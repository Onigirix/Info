public class Main{
    public static void main(String[] args){
        String toCheck = "Efim";
        boolean found = false;
        String[] Patienten = {"Peter", "Efim", "Simon"};
        for(String Patient : Patienten){
            if(Patient.compareToIgnoreCase(toCheck) == 0){
                System.out.println("Patient " + toCheck + " gefunden");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Patient " + toCheck + " nicht gefunden");
        }
    }
}