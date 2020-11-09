public class Account {

    String name;
    int age;
    public static void main(String[] args) {
        Account a = new Account();
        a.Setpars("pablo", 34);

        a.Print();
    }
    public  void Setpars(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public void Print(){
        System.out.println(name + "," + age);
    }
}