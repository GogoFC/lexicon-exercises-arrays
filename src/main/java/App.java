import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        String[] names = {"Fredrik"};
        String[] moreNames = {"Erik", "Ulf", "Simon", "Kent"};
        names = arrayConcat(names,moreNames);
        System.out.println(Arrays.asList(names));
    }

    public static String[] arrayConcat(String[] source, String[] elementsToAdd) {
            String[] combined = Arrays.copyOf(source, source.length + elementsToAdd.length);
            for (int i = source.length, j=0; i<combined.length; i++, j++) {
                combined[i] = elementsToAdd[j];
        }
            return combined;
    }
}








