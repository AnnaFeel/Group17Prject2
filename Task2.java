package Group17Project2;

public class Task2 {
    public static void main(String[] args) {
        Marks studentA = new A(78, 87, 83);
        studentA.getPercentage();
        Marks studentB = new B(90, 95, 96, 99);
        studentB.getPercentage();
    }
}

abstract class Marks {
    int mark1;
    int mark2;
    int mark3;
    int mark4;

    abstract void getPercentage();
}

class A extends Marks {
    A(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    void getPercentage() {
        int averageA = (mark1 + mark2 + mark3) / 3;
        System.out.println("An average mark for a student A is " + averageA);
    }
}

class B extends Marks {
    B(int mark1, int mark2, int mark3, int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    void getPercentage() {
        int averageB = (mark1 + mark2 + mark3 + mark4) / 4;
        System.out.println("An average mark for a student B is " + averageB);
    }
}
