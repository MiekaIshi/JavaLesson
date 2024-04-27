package practics05;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex111 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>(Arrays.asList(0, 3, 1, 4, 1, 5, 9, 2, 6));

Iterator<Integer> iterator = list.iterator();
while (iterator.hasNext()) {
	int num = iterator.next();
	if (num == 0) {
		// 0 は削除
	
		iterator.remove();
    }
}

System.out.println(list); // -> [3, 1, 4, 1, 5, 9, 2,
	}

}
