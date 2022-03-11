package lib;

public class Human {
    public String name;
    public static int age;
    public static String city;

    public Human(String _name, int _age, String _city)
    {
        name = _name;
        age = _age;
        city = _city;
    }
    public void Print(int age_second)
    {
        String text = age <= age_second ? name+" is younger ":name+" is elder";
        System.out.println(text);
    }
    @Override
    public String toString() {
        return "This is "+name+", "+age+" years old, live in "+city;
    }
}
