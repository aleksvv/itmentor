package task3;

public abstract class SortPerson {

    public Person[] sort(Person[] Persons, int j) { return Persons; }

    protected static void swap(Person[] newPersons, int ind1, int ind2) {
        Person tmp = newPersons[ind1];
        newPersons[ind1] = newPersons[ind2];
        newPersons[ind2] = tmp;
    }
}