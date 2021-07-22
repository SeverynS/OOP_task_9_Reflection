import java.lang.reflect.Field;

/*
* 1) напиши программу, в которой попробуй сделать так чтобы ты смогу к строке добавить символы(модифицировать строку)
* и при этом чтобы hashcode данной строки не изменился, и изменения остались (адрес памяти не поменялся) -
* используй для этого рефлексию
* String str = "test";
* int hashBeforeChanges = str.hash();
* ...//модификация строки
* int hashAfterChanges = str.hash();
* sout(hashBeforeChanges == hashAfterChanges);//должно вернуть true
* */
public class Task1 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        String str = "test";
        int hashBeforeChanges = str.hashCode();
        String hackedString = "hacked";

        Class forHacking = str.getClass();

        Field field = forHacking.getDeclaredField("value");
        field.setAccessible(true);
        field.set(str, hackedString.toCharArray());

        int hashAfterChanges = str.hashCode();
        System.out.println(str + " " + (hashBeforeChanges == hashAfterChanges));
    }
}
