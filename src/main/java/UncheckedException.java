import java.util.ArrayList;
import java.util.List;

public class UncheckedException {
    public static void throwRuntimeError() {
        List<String> list = new ArrayList<>();
        list.add("item-1");
        list.add("item-2");
        list.add("item-3");
        var result = list.get(list.size()); // throw unchecked exception
    }
}
