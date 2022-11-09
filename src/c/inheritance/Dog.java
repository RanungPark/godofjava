package c.inheritance;

public class Dog extends Animal {
    public String character;

    public Dog(String character, String name, String kind, int legCount, int iq) {
        this.character = character;
        this.name = name;
        this.kind = kind;
        this.legCount = legCount;
        this.iq = iq;
    }
    public Dog(String character, String name, String kind, int legCount, boolean hasWing) {
        this.character = character;
        this.name = name;
        this.kind = kind;
        this.legCount = legCount;
        this.hasWing = hasWing;
    }
    public Dog (String character,String name,String kind) {
        this.character = character;
        this.name = name;
        this.kind = kind;
    }

//    @Override
//    public void move(){
//        System.out.println("이 동물은 멍멍짖으면서 움직인다");
//    }
    @Override
    public void eatFood(){
        System.out.println("이 동물은 사료를 먹는다");
    }

    public static void main(String[] args) {
        Dog retriever = new Dog("affable", "park", "retriever");
        System.out.println("강아지의 이름은"+retriever.name);
        System.out.println("강아지의 종류는"+retriever.kind);
        System.out.println("강아지의 성격은"+retriever.character);
        retriever.move();
        retriever.eatFood();
    }
}