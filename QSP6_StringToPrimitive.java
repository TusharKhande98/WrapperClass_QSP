// Parsing:- Convert String type of data into Primitive using an inbuilt method of 'parsing'--> 'Integer.parseInt(num)'
public class QSP6_StringToPrimitive
{
    public static void main(String[] args)
    {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        String no = "9000000";
        System.out.println("After adding '54321' to 'string' data, " + no +" will be :- " +(no+54321));
        int ans1 = Integer.parseInt(no);
        System.out.println("After adding '54321' to 'int' data, " + no +" will be :- " +(ans1+54321));
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        String no2 = "123f";
        System.out.println("After adding '321' to 'string' data, " + no2 +" will be :- " +(no2+321));
        float ans2 = Float.parseFloat(no2);
        System.out.println("After adding '321' to 'float' data, " + no2 +" will be :- " +(ans2+321));
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        String str2 = "true";
        boolean ans4 = Boolean.parseBoolean(str2);
        System.out.println("Convert string value to boolean:-" + ans4);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        String no3 = "97654321";
        System.out.println("After adding '54321' to 'string' data " + no3 +" will be :- " +(no3+54321));
        long ans3 = Long.parseLong(no3);
        System.out.println("After adding '54321' to 'long' data " + no3 +" will be :- " +(ans3+54321));
        System.out.println("data will loss here in 'long'");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        String str = "Flash";
        int a= 4;
        char ch = str.charAt(a);
        System.out.println("it will directly print character at " +a+"th position:- " + ch);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

    }
}
