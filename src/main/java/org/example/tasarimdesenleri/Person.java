package org.example.tasarimdesenleri;

public class Person {
    // Person sınıfının özellikleri
    private String firstName;
    private String lastName;
    private int age;

    // Private constructor, sadece Builder sınıfı kullanarak nesne oluşturulabilir
    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }

    // Getter metodları
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Builder sınıfı
    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;

        public Builder() {
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        // Builder sınıfının build metodu
        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
