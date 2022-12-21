public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4.0;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес " + totalWeight + " кг.");
        var differenceWeight = secondBoxer - firstBoxer;
        System.out.println("Разница в весе " + differenceWeight + " кг.");

        var differenceWeight1 = firstBoxer - secondBoxer;
        System.out.println("Ваниант 1. Разница в весе " + differenceWeight1 + " кг.");
        var differenceWeight2 = (secondBoxer - firstBoxer) % totalWeight;
        System.out.println("Ваниант 2. Разница в весе " + differenceWeight2 + " кг.");

    }

}