public class PersonBuilder {

    protected String name;
    protected String surname;
    protected Integer age;
    protected String address;

    public PersonBuilder setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalStateException("Name is empty");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname.isEmpty()) {
            throw new IllegalStateException("Surname is empty");
        }
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        if (age < 0) {
            throw new IllegalStateException("Age is invalid");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        if (address.isEmpty()) {
            throw new IllegalStateException("Address is empty");
        }
        this.address = address;
        return this;
    }

    public Person build() {
        if ((name == null) || (surname == null)) {
            throw new IllegalStateException("Required argument is missing");
        }
        if (address == null) {
            if (age == null) {
                return new Person(name, surname);
            } else {
                return new Person(name, surname, age);
            }
        } else if (age != null) {
            return new Person(name, surname, age, address);
        } else throw new IllegalStateException("Age is missing");
    }
}