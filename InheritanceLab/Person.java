public class Person {
    private String firstName, lastName;

    public Person() {
        this.firstName = "my name's";
        this.lastName = "jefff";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirst(){return firstName;}
    public String getLast(){return lastName;}

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printLastFirst() {
        System.out.println(lastName + ", " + firstName);
    }

    public void print() {
        System.out.println(firstName + " " + lastName);
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Object o) {
        if(!(o instanceof Person)) return false;
        Person p = (Person) o;
        return p.getFirst().equals(this.firstName) && p.getLast().equals(this.lastName);
    } 

    public void copy(Person p) {
        this.firstName = p.firstName;
        this.lastName = p.lastName;
    } 

    public Person getCopy(){
        return new Person(this.firstName,this.lastName);
    }
}
