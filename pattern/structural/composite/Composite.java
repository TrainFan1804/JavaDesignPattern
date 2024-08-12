package structural.composite;

class Composite implements Component {

    private Component[] children;
    private int size;

    public Composite() {

        this.children = new Component[5];
        this.size = 0;
    }

    @Override
    public void operation() { 
    
        System.out.println("Do something.."); 
        
        for (int i = 0; i < this.size; i++) {

            this.children[i].operation();
        }        
    }

    public void addChild(Component child) { this.children[this.size++] = child; }

    public Component getChild(int index) { return this.children[index]; }
}
