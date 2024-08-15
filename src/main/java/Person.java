public class Person {
    protected String name;
    protected String surname;
    protected Integer age;
    protected String address;

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAge(1)
                .setAddress(address);
    }

    public boolean hasAge() {
        return age != null;
    }

    public boolean hasAddress() {
        return (address != null) && (!address.isEmpty());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAddress()) {
            this.age++;
        }
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, Integer age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "name is " + name + "\n surname is " + surname + "\n age is " + age + "\n address is " + address;
    }

    @Override
    public int hashCode() {
        return (surname + name + age + address).hashCode();
    }
}
