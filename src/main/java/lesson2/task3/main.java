package task3;

import java.util.Random;

public class main {
    static int amount = 10000; 
    static Person[] Persons = new Person[amount];
    static Person[] result = new Person[amount];
    static Random random = new Random();
    
    public static void main(String [] args) {

        main.generatePersons();

        long before = System.currentTimeMillis();
        result = SortPerson1.sort(Persons);
        long after = System.currentTimeMillis();
        
        for (int i = 0; i<amount; i++) {
            System.out.println(result[i].sex.gender + " - " + result[i].age + " - " + result[i].name); 
        }
        
        System.out.println("Bubble Sort = " + (after - before) + " мс.");

        before = System.currentTimeMillis();
        result = SortPerson2.sort(Persons);
        after = System.currentTimeMillis();
        System.out.println("Selection sort = " + (after - before) + " мс.");


    }

    public static void generatePersons() {
        String newName;
        
        for (int i = 0; i<amount; i++) {

            String genName = random.ints(96, 123)
                .filter(j -> (j < 57 || j > 65) && (j < 90 || j > 96))
                .mapToObj(j -> (char) j)
                .limit(5 + random.nextInt(8))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
            newName = genName.substring(0, 1).toUpperCase() + genName.substring(1);

            int newAge = 1 + random.nextInt(98);
            char gender = (random.nextInt(2) > 0) ? 'f' : 'm'; 
            Persons[i] = new Person(newName,new Sex(gender),newAge);
        }
    }

}