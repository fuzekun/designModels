package strategy;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(2, 3);
        Cat cat1 = new Cat(1,2);
        Cat[] cats = {cat, cat1};
        //两个必要的组件
        Sorter<Cat> sorter = new Sorter<Cat>();
        CatComparator catComparator = new CatComparator();
        sorter.sort(cats, catComparator);
        for(Cat tmp: cats){
            System.out.println(tmp.getWeight());
        }
    }
}
