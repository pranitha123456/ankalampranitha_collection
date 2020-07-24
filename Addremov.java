import java.util.*;
class Addremov{
public static void main(String args[]){
ArrayList<String> alist=new ArrayList<String>();
alist.add("A");
alist.add("B");
alist.add("C");
alist.add("D");
alist.add("E");
alist.add("F");
alist.add("G");
alist.add("H");
alist.add("I");
alist.add("J");
System.out.println(alist);
alist.remove(2);
alist.remove(5);
System.out.println(alist);
}
}