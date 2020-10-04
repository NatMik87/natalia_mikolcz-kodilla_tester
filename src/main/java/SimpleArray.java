public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[] {"dog" , "cat" , "parrot" , "hamster" , "horse"};
        String animal = animals[2];
        System.out.println(animal);

        int numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera:");
        System.out.println(numberOfElements);
    }
}
