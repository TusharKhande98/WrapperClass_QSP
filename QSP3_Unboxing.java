public class QSP3_Unboxing
{
 
    public static void main(String[] args)
    {
        Integer i1 = new Integer(678); // boxing
        int i = i1.intValue(); // unboxing
        System.out.println(i);

        Character c1 = new Character('t'); // boxing
        char ch = c1.charValue(); // unboxing
        System.out.println(ch); // non-primitive

        Double d = new Double(345.123); // boxing
        double d1 = d.doubleValue(); // unboxing
        System.out.println(d1);

    }
}
