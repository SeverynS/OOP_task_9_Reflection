import models.User;
import java.lang.reflect.Field;
/*
* 2) создай модель User, определи 2 приватных поля, и 2 конструктора: с параметрами и без
* 2.1) создай объект типа User с помощью рефлексии
* 2.2) поменяй каждое из полей на какие-либо новые значения посредством рефлексии
 * */

public class Task2 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Object user = new User();
        Class cl = user.getClass();
        Field[] fields = cl.getDeclaredFields();

        for(Field f : fields) {
            f.setAccessible(true);

            if(f.getType().equals(String.class)){
                f.set(user, "Ololosh");
            }
            else if(f.getType().equals(Integer.TYPE)){
                f.set(user, 77);
            }
            else
                System.out.println("Field is: " + f.getType());
        }
        System.out.println(user);
    }
}
