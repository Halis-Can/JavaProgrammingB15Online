package day32;

public class Method_Practice1 {
    public static int add2Numbers(int num1, int num2) {
        // int sum = num1+num2;
        // return sum ;
        return num1 + num2;
    }
    public static int doubleTheNumber(int num) {
        //System.out.println("I am going to double the value of " + num);
        int result = num * 2;
        return result;
    }
    public static String giveMeMyName() {
        return "Halis";
    }
    public static void main(String[] args) {
        String name=giveMeMyName();
              System.out.println(name);
        int doubleResult=doubleTheNumber(10);
              System.out.println(doubleResult);
        int addResult=add2Numbers(12,22);
              System.out.println(addResult);
    }

}
