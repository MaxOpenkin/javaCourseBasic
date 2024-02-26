package lessons.lesson_30_treeSet_compareSort.compareObjects.comparable;

public class Person implements Comparable<Person>{

    private String firstName;
    private String lastName;

    public Person(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public int compareTo(Person personForCompare) {
        int compareResult = lastName.compareTo(personForCompare.getLastName());

        if (compareResult == 0) {
            compareResult = firstName.compareTo(personForCompare.firstName);
        }
        return compareResult;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + lastName + '\'' +
                ", lastName='" + firstName + '\'' +
                '}';
    }
}
