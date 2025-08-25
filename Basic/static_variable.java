
class staticvariabletest {
    int num;
    staticvariabletest(int n) {
        num = n;
    }

    static int cout = 0; // Static variable

    void show() {
        System.out.println("the value of n is " + num);
        cout++; // Increment static variable
    }
}

public class static_variable {
    public static void main(String[] args) {
        staticvariabletest test1 = new staticvariabletest(75);
        test1.show();
        
        staticvariabletest test2 = new staticvariabletest(90);
        test2.show();
        
        System.out.println("the value of the cout is " + staticvariabletest.cout); // ✅ Correct way
    }
}