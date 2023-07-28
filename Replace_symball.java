public class Replace_symball
{
    public static void main(String[] args) {
        String name = "WE@@###$LL@!@#$%^&*COME";

        name = name.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(name);
    }
}