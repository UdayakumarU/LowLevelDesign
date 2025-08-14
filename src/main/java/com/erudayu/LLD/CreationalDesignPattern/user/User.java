package com.erudayu.LLD.CreationalDesignPattern.user;

public class User {
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private int age;
    private Gender gender;

    User(UserBuilder userBuilder){
        this.firstname = userBuilder.firstname;
        this.lastname = userBuilder.lastname;
        this.email = userBuilder.email;
        this.phoneNumber = userBuilder.phoneNumber;
        this.age = userBuilder.age;
        this.gender = userBuilder.gender;
    }

    @Override
    public String toString(){
        return String.format("%s, %s, %s, %s, %d, %s", firstname, lastname, email, phoneNumber, age, gender);
    }

    public static class UserBuilder{
        private String firstname;
        private String lastname;
        private String email;
        private String phoneNumber;
        private int age;
        private Gender gender;

        public UserBuilder(String firstname, String email){
            this.firstname = firstname;
            this.email = email;
        }

        public UserBuilder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
