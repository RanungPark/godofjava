package c.inheritance;

public class Animal {
    public String name;
    public String kind;
    public int legCount;
    public int iq;
    public boolean hasWing;

    public void move(){
        System.out.println("이 동물은 걸어간다");
    }
    public void eatFood(){
        System.out.println("이동물은 고기를 먹는다");
    }
}
