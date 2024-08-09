package creational.multiton;

class Client {

    public static void main(String[] args) {
        
        Multiton multitonOne = Multiton.getInstace("First");
        Multiton multitonTwo = Multiton.getInstace("Second");
        
        System.out.println(multitonOne == multitonTwo);
    }
}
