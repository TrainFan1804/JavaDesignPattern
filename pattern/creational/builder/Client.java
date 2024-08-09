package creational.builder;

class Client {

    public static void main(String[] args) {
       
        Builder builder = new Builder();

        ComplexObject object = builder
                                .withFirstPartAs("Hello")
                                .withSecondPartAs(5)
                                .getResult();
        
        System.out.println(object);
    }
}
