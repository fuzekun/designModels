package strategy;


//直接使用策略模式

/*
* 不仅需要传入比较的数组而且需要比较的策略。
* */
public class Sorter<T>{

    public Sorter(){

    }
    //先使用冒泡排序
    public static <E>void sort(E o[], Comparator<E> comparator){       //因为是静态的所以没法使用T
        int n = o.length;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n - 1; j++){
                if(comparator.compare(o[j], o[j + 1]) == 1){          //升序排序
                    E tmp = o[j];
                    o[j] = o[j + 1];
                    o[j + 1] = tmp;
                }
            }
        }
    }
}
