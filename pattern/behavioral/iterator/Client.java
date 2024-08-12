package behavioral.iterator;

class Client {

    public static void main(String[] args) {
   
        int[] data = createData(); 

        Aggregate aggregate = new ConcreteAggregate(data);
        Iterator iterator = aggregate.createIterator();
        
        while(iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }

    private static int[] createData() {

        int[] data = new int[10];

        for (int i = 0; i < data.length; i++) {

            data[i] = i+1;
        }
        
        return data;
    }
}
