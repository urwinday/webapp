package lesson02;

import com.urwinday.webapp.model.Link;

/**
 * urwinday
 * 07.12.2017.
 */
public class Main {
    public static void main(String[] args) {
        Link l1 = new Link("name", "url");
        System.out.println(l1);
        System.out.println(l1.getClass());

        System.out.println(Link.EMPTY);
        System.out.println(l1.empty());
        Integer obj = 5;
        printInt(obj);
    }

    static void printInt(int i) {
        System.out.println(i);
    }


}
