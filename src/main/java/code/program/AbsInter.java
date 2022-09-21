package code.program;

/**
 * 출력
 * 사번 : 1 , 이름 : lji , 봉급 : 100
 * 사번 : 2 , 이름 : kcs , 봉급 : 110
 *
 */


abstract class Employee {
    int sabun;
    String name;

    abstract int getSalary();

    void printEmployeeInfo() {
        System.out.println("사번 : " + sabun + " , 이름 : " + name + " , 봉급 : " + getSalary());
    }
}


class Permenent extends Employee {
    int getSalary() {
        return 100;
    }
}


class SalesMan extends Permenent {
    int getSalary() {
        return 10 + super.getSalary();
    }
}


public class AbsInter {
    public static void main(String[] args) {
        Employee one = new Permenent();
        Employee two = new SalesMan();

        one.sabun = 1;
        one.name = "lji";
        two.sabun = 2;
        two.name = "kcs";

        one.printEmployeeInfo();
        two.printEmployeeInfo();

    }
}
