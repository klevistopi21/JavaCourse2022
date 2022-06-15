package generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

//        ArrayList <String>mylist = new ArrayList();
//       mylist.add("hello");
////        mylist.add(100);
////        mylist.add(false);
//
//
//        String val1 = (String) mylist.get(0);
//       // System.out.println(val1);
////        Integer val2 = (Integer) mylist.get(1);
////        System.out.println(val2);

        Container<Integer,String> container = new Container<>(12,"hello");
         int var1 =  container.getItem1();
         String var2 = container.getItem2();

         Set <String> myset1  = new HashSet<String>();
         myset1.add("first");
         myset1.add("second");
         myset1.add("whatever");

        Set <String> myset2  = new HashSet<String>();
        myset1.add("first");
        myset1.add("second");
        myset1.add("computer");

        Set<String> resultSet= union(myset1,myset2);

        Iterator <String> itr = resultSet.iterator();
        while (itr.hasNext()){
            String var =  itr.next();
            System.out.println(var);
        }

    }

    public static <E> Set <E> union(Set <E> set1, Set <E> set2){
        Set <E> result = new HashSet <E> (set1);
        result.addAll(set2);
        return result;

    }
}
