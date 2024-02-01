class Operators19 {
    Operators18(int i)
    {
        System.out.println("Int-arg Constructor ");
    }

    public static void main(String[] args) throws Exception {
        Object o=class.forName(args[0].newInstance());
        System.out.println("Object created for : "+o.getClass().getName());
    }
}
