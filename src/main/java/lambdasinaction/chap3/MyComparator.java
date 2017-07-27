package lambdasinaction.chap3;

import java.util.Comparator;

/**
 * Created by wseng9 on 2017/7/27.
 */
@FunctionalInterface
public interface MyComparator extends Comparator {
    boolean equals(Object obj);

    public String toString();
}
