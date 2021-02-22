package strategy;


//直接使用策略模式

/*
* 不仅需要传入比较的数组而且需要比较的策略。
* */
public class Sorter<T>{

    //使用快速排序吧
    public static <E>void sort(E o1[], Comparator<E> x){       //因为是静态的所以没法使用T

    }
}
