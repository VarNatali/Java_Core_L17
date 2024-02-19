package ua.lviv.lga.lesson17.task;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {10, 12, 33, 44, 52, 50, 57, 82, 97, 85, 111, 112, 94, 88, 101};
        Collection collection = new Collection(array);
        Iterator forward = collection.createForward();

        System.out.println("Elements forward without odd");
        while (forward.hasNext()) {
            Integer it = forward.next();
            if (it % 2 == 0) System.out.println(it.toString());
            else System.out.println("0");

        }

        System.out.println();
        System.out.println("Every 2-nd from end");
        Iterator back = collection.createBackward();
        while (back.hasNext()) {
            System.out.println(back.next());
        }

        System.out.println();
        System.out.println("Anonymous class");
        Iterator itAnonym = collection.createAnonymous();
        System.out.println("Every odd 3-rd number from the end : ");
        while (itAnonym.hasNext()) {
            Integer it = itAnonym.next();
            if (it % 2 != 0) System.out.println(it);
        }

        System.out.println();
        System.out.println("Local class");
        System.out.println("Every 5-s element if even  - 100 : ");
        Iterator itLocal = collection.localCreator();
        while (itLocal.hasNext()) {
            Integer it = itLocal.next();

            if (it % 2 == 0) {
                it -= 100;
                System.out.println(it);
            }
        }

        System.out.println();
        System.out.println("Static class");
        Iterator itStatic = Collection.createStaticClass();
        System.out.println("Make every 2-nd even number as odd : ");
        while (itStatic.hasNext()) {
            Integer it = itStatic.next();
            if (it % 2 == 0) {
                it += 1;
                System.out.println(it);
            }
        }


    }
}
