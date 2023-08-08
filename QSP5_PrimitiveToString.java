// Example:- Convert primitive type of data into String using an inbuilt method--> 'valueOf()'
public class QSP5_PrimitiveToString
{
    public static void main(String[] args)
    {
        System.out.println("We will add '10' to every data to check whether its converted to string or not");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        int a = 2143;
        System.out.println("\tAdded '10' updated value of "+a+ " will be:- " + (a+10));

        String str1 = String.valueOf(a);
        System.out.println("\tAdded '10' updated value of "+str1+ " will be:- " + (str1+10));

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        String str2 = String.valueOf(34.54f);
        System.out.println("\tAdded '10' updated value of "+str2+ " will be:- " + (str2+10));
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        char ch []  = {'w', 'h', 'a', 't'};
        String str3 = String.valueOf(ch);
        System.out.println("All character had been converted to string with method ie.:- " + str3);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        System.out.println("See Output & observe");
        char[] ch1 = {'F', 'l', 'a', 's', 'h'};
        System.out.println("return reference:- " + ch1);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");

        int i [] = {1,2,3,4,5};
        System.out.println("it will give reference, cauz array is a object & it is stored in memory so that reference will be returned here:- " + i);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");



    }
}
