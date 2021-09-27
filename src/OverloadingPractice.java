public class OverloadingPractice {
    OverloadingPractice()
    {
        this("Hii Everyone");
    }
    OverloadingPractice(String string)
    {
        System.out.println("From parameterized Constructor :"+string);
    }
    public static void main(String[] args) {
        OverloadingPractice overloadingPractice=new OverloadingPractice();
    }
}
