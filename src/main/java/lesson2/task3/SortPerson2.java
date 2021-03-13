package task3;

public class SortPerson2 extends SortPerson {
    
    public static Person[] sort(Person[] Persons) { 
        Person[] newPersons = new Person[Persons.length];
        for (int i = 0; i < Persons.length; i++) {
            newPersons[i] = Persons[i];
        }
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int left = 0; left < newPersons.length; left++) {
                int minInd = left;
                for (int i = left; i < newPersons.length; i++) {
                    if (newPersons[i].name.compareTo(newPersons[minInd].name) < 0) {
                        minInd = i;
                    }
                }
                SortPerson.swap(newPersons, left, minInd);
            }
        }

        needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int left = 0; left < newPersons.length; left++) {
                int minInd = left;
                for (int i = left; i < newPersons.length; i++) {
                    if (newPersons[i].age > newPersons[minInd].age) {
                        minInd = i;
                    }
                }
                SortPerson.swap(newPersons, left, minInd);
            }
        }

        needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int left = 0; left < newPersons.length; left++) {
                int minInd = left;
                for (int i = left; i < newPersons.length; i++) {
                    if (newPersons[i].sex.gender.compareTo(newPersons[minInd].sex.gender) < 0) {
                        minInd = i;
                    }
                }
                SortPerson.swap(newPersons, left, minInd);
            }
        }

    return newPersons; 
    }

}