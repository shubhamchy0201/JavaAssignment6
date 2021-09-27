public class ConstructorRefrence {
    ConstructorRefrence(String string)
    {
        System.out.println("Hii "+string);
    }
    public static void main(String[] args) {
    ConstructorRefrence[] array=new ConstructorRefrence[2];
    array[0]=new ConstructorRefrence("Shubham");
    array[1]=new ConstructorRefrence("Everyone");

        System.out.println(array[0]);
    }
}
