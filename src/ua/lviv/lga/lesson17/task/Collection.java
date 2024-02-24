package ua.lviv.lga.lesson17.task;

class Collection {
    private static Integer[] arr;

    public Collection(Integer[] arr) {
        Collection.arr = arr;

    }


    public class Forward implements Iterator {
        private int count = 0;

        @Override
        public boolean hasNext() {
            return count < arr.length;
        }

        @Override
        public Integer next() {
            return arr[count++];
        }
    }

    public Forward createForward() {
        return new Forward();
    }

    public class Backward implements Iterator {
        private int count = arr.length;

        @Override
        public boolean hasNext() {
            count--;
            return count >= 0;
        }

        @Override
        public Integer next() {

            return arr[count--];

        }

    }

    public Backward createBackward() {
        return new Backward();
    }

    //Local class
    public Iterator localCreator() {
        class LocalClass implements Iterator {
            private int count = 0;

            @Override
            public boolean hasNext() {
                count += 4;
                return count < arr.length;
            }

            @Override
            public Integer next() {
                return arr[count++];
            }
        }

        return new LocalClass();
    }

    //Anonym class
    public Iterator createAnonymous() {
        return new Iterator() {
            private int count = arr.length - 1;

            @Override
            public boolean hasNext() {
                count -= 2;
                return count >= 0;
            }

            @Override
            public Integer next() {
                return arr[count--];
            }
        };
    }

    //static class
    private static class StaticClassIterator implements Iterator {
        private int count = 0;

        @Override
        public boolean hasNext() {
            count++;
            return count < arr.length;
        }

        @Override
        public Integer next() {
            return arr[count++];
        }
    }

    public static StaticClassIterator createStaticClass() {
        return new StaticClassIterator();
    }
}
