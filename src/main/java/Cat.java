public class Cat extends Animal {

    Cat name;
    Cat age;

    public Cat getName() {
        return name;
    }

    public void setName(Cat name) {
        this.name = name;
    }

    public Cat getAge() {
        return age;
    }

    public void setAge(Cat age) {
        this.age = age;
    }

    public Cat(Cat name, Cat age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
