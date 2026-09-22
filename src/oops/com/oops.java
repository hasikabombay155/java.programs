package oops.com;

class Student implements Cloneable {
    int sid;
    String sname;
    Address address;

    public Student(int sid, String sname, Address address) {
        this.sid = sid;
        this.sname = sname;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Address {
    String city;
    public Address(String city) {
        this.city = city;
    }
}

public class oops {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("main method started");
        Address address = new Address("hydrabad");
        Student s1 = new Student(101, "hasika", address);
        System.out.println(s1.sid);
        System.out.println(s1.sname);
        System.out.println(s1.address);

        Student s2 = (Student) s1.clone();
        System.out.println(s2.sid);
        System.out.println(s2.sname);
        System.out.println(s2.address);
    }
}