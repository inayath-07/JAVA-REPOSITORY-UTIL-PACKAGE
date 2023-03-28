class student
{
    private String name;
    private String School_name ;

    public void setname(String setn)
    {
        name = setn;
    }
    public void setsname(String sc)
    {
        School_name = sc;
    }

    public String getname()
    {
        return name;
    }
    public String getschool()
    {
        return School_name;
    }
}

public class GETTER_AND_SETTER_02 
{
    public static void main(String[] args) 
    {
        //creating object of student
        student j = new student();
        //assign values to setter
        j.setname("inayath");
        j.setsname("mukarram jah");
        //displaying getter
        System.out.println(j.getname());
        System.out.println(j.getschool());
    }    
}
