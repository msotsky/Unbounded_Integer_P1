
public class TestUnboundedInteger{
    public static void main(String[] args)
    {
        UnboundedInteger<Integer> ubInt1 = UnboundedInteger.assignValue("295");
        System.out.println("295 as unboundedInteger: " + ubInt1.toString());

        UnboundedInteger<Integer> ubInt2 = UnboundedInteger.assignValue("-5731");
        System.out.println("-5731 as unboundedInteger: " + ubInt2.toString());
    }
}
