public class Dog {
    Dog name;
    Dog age;
    Dog por;

    public Dog(Dog name, Dog age, Dog por) {
        this.name = name;
        this.age = age;
        this.por = por;
    }

    public Dog getName() {
        return name;
    }

    public void setName(Dog name) {
        this.name = name;
    }

    public Dog getAge() {
        return age;
    }

    public void setAge(Dog age) {
        this.age = age;
    }

    public Dog getPor() {
        return por;
    }

    public void setPor(Dog por) {
        this.por = por;
    }
}
