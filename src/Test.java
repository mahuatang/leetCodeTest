public class Test {

    public static void main(String[] args) {
        Person p = new Person("zhangdan", "wuhan");
        System.out.println(p.toString());
    }
}

class Person {
    private String userName;
    private String location;

    public Person(String userName, String location) {
        this.userName = userName;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
