package lib;
public class Student extends Human {

    public String univer;
    public int kurs;
    public Student(String _name, int _age, String _city, String _univer, int _kurs)
    {
        super(_name, _age, _city);
        univer = _univer;
        kurs = _kurs;
    }

    public void Say()
    {
        System.out.println("He said: I'm very very very tired. My university is cool");
    }
    @Override
    public String toString() {
        return "This is "+super.name+", he is "+age+" years old, live in "+city+". He study in "+univer+" on "+kurs+" course";
    }
}
