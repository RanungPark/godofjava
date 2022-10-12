public class OperatorCompound {
    public static void main(String[] args) {
        OperatorCompound value = new OperatorCompound();
        value.compound();
    }
    public  void compound() {
        int inValue = 10;
        inValue += 5;
        System.out.println(inValue);
        inValue -= 5;
        System.out.println(inValue);
        inValue *= 5;
        System.out.println(inValue);
        inValue /= 5;
        System.out.println(inValue);
        inValue %= 5;
        System.out.println(inValue);
    }
}
