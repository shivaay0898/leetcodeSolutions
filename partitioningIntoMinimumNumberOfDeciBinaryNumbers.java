public class partitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static int minPartitions(String n) {
       return Character.getNumericValue(n.chars().max().getAsInt());
    } 
    public static void main(String[] args) {
        System.out.println(minPartitions("238"));
    }
}
