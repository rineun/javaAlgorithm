package code.program;

public class PerSon {

    int no=10;
    String name;

    PerSon(int no){
        this.no= no;
        System.out.println("Person(int no) 호출됨");
    }

    PerSon(int no, String name){
        this(no);
        this.name=name;
        System.out.println("PerSon(int no, String name) 호출됨");

    }


    public static void main(String[] args) {
        PerSon one = new PerSon(100, "김철수");
        System.out.println(one.no);
    }
}
