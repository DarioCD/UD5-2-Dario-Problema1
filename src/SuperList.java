import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class SuperList extends ListManager<Integer> {
    private int contador = 0;
    @Override
    public void addElement(Integer element) {
        list.add(contador, element);
        contador++;
    }

    @Override
    public Integer removeElement(int position) {
        System.out.println(list.remove(position));
        return contador --;
    }

    @Override
    public void showElements() {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            Integer list = it.next();
            System.out.println(list);
        }
    }

    @Override
    public void showReversedElements() {
        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }
    }

}
