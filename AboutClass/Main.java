
package AboutClass;

class Student {
    private String name;
    private int rolling;

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setRollno(int r) {
        if (r <= 50) {
            this.rolling = r;
        } else {
            System.out.println("Roll number is Invalid");
        }
    }

    public int getRollno() {
        return rolling;
    }
}

public class Main {
    public static void main(String[] args) {
        Student g1 = new Student();

        g1.setName("Meron");
        System.out.println(g1.getName());

     //   g1.setRollno(51);
       System.out.println(g1.getRollno());
    }
}

