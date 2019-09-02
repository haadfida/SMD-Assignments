package assignment1;

public abstract class Shape {
    static int numOfObjects;
    private String name;
    public abstract void draw();
    public abstract void hasEdges();

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
