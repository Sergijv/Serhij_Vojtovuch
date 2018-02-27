import java.util.TreeSet;

public class MySet {
    public static class  UnionClass {
        public static<T> void union(java.util.Set<T> s1, java.util.Set<T> s2) {
            s1.addAll(s2);
        }
    }
    public static class  InterSetClass {
        public static <String> java.util.Set<String> intersect(java.util.Set<String> s1, java.util.Set<String> s2){

            java.util.Set<String> s3=new TreeSet<>();
            for (String t:s1) {
                if (!s2.contains(t))s3.add(t) ;
            }
            s1=s3;
            return s1;
        }
    }
}
