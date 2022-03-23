public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public boolean equals(Object o) {
    //     Student other = (Student) o;
    // }

    public static void main(String[] args) {
        Student alice = new Student("alice", 15);
        Student alice2 = new Student("alice", 15);

        System.out.println(alice == alice2);

        System.out.println(alice.equals(alice2));
    }
    
}
