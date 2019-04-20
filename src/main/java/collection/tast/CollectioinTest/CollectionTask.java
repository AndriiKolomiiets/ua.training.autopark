package collection.tast.CollectioinTest;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class CollectionTask {
    List dubles;
    public static void main(String[] args) {
        CollectionTask task = new CollectionTask();
//        task.dubles = task.numberOfDublicats();
        task.dubles.stream()
                .forEach(System.out::println);
    }

    ArrayList testArray ;
List<Integer> arrayToGroup = Arrays.asList(new Integer[]{4,5,-6,4,5,3,2,4,5,7,4});
/*
    public ArrayList getTestArray() {

        testArray.add(4);
        testArray.add(5);
        testArray.add(-6);
        testArray.add(4);
        testArray.add(5);
        testArray.add(3);
        testArray.add(2);
        testArray.add(4);
        testArray.add(5);
        testArray.add(7);
        testArray.add(4);
    }
*/
 /*   public List numberOfDublicats(){
        Set<Integer> dubl = new HashSet<>();
        *//*Set<Integer> dublicates = Arrays.stream(arrayToGroup)
        .filter
        ArrayList newArray = testArray.stream().filter(i->Collections.frequency(arrayToGroup, i)>1)
        .collect(Collectors.toSet());*//*
    List<Integer> dublicates = IntStream.of(4,5,-6,4,5,3,2,4,5,7,4)
            .boxed()
            .collect(Collectors.groupingBy(c->c, Collectors.counting()))
            .map(e->e.getKey())
            .merge(Function.identity(), )
            .entrySet()
            .stream()

            .collect(Collectors.toMap(Function.identity(),));
return dublicates;
    }
*/
/*    public Map nomberOfDublicatesMap(){
        List<Integer> dublicates = IntStream.of(4,5,-6,4,5,3,2,4,5,7,4);
    }*/
}
