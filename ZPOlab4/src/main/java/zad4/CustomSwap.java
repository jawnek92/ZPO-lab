package zad4;
import java.util.List;
import java.util.RandomAccess;

public class CustomSwap implements RandomAccess {
    public static <T> void swap(List<T> list, int i, int j) throws NoneFreeAccessException{

        if(list instanceof RandomAccess){
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }else{
            throw new NoneFreeAccessException();
        }

    }
}
