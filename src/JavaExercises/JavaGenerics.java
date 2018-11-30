package JavaExercises;

public class JavaGenerics {
//only solution posted here stash 

    public <E> void printArray(E[] array){
        for (E e:array){
            System.out.println(e);

        }

    }
}
