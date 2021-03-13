package task3;

public class SortPerson1 extends SortPerson {
    
    public static Person[] sort(Person[] Persons) { 
        Person[] newPersons = new Person[Persons.length];
        for (int i = 0; i < Persons.length; i++) {
            newPersons[i] = Persons[i];
        }
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < Persons.length; i++) {
                if (newPersons[i].name.compareTo(newPersons[i-1].name) < 0) {
                    SortPerson.swap(newPersons, i, i-1);
                    needIteration = true;
                }
            }
        }

        needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < Persons.length; i++) {
                if (newPersons[i].age > newPersons[i-1].age) {
                    SortPerson.swap(newPersons, i, i-1);
                    needIteration = true;
                }
            }
        }

        needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < Persons.length; i++) {
                if (newPersons[i].sex.gender.compareTo(newPersons[i-1].sex.gender) < 0) {
                    SortPerson.swap(newPersons, i, i-1);
                    needIteration = true;
                }
            }
        }

    return newPersons; 
    }

}