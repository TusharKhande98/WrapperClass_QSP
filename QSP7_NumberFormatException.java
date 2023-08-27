public class QSP7_NumberFormatException
{
    public static void main(String[] args)
    {
        String s = "Flash1991";
        int i = Integer.parseInt(s);
        System.out.println(i);
        // when we have string+integer & try it to covert in int, we get NFE.

    }
}
