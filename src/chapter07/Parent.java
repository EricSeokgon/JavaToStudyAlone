package chapter07;

public class Parent {
    public String nation;

    public Parent() {

        this("대한민국");
        System.out.println("parent() call");

    }

    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parentp(String nation) call");
    }
}
