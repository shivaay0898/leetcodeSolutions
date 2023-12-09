public class towerOfHanoi {
    public static void tower(int x, String Source, String Destination, String Aux) {
        if (x == 0) {
            return;
        }
        tower(x - 1, Source, Aux, Destination);
        System.out.println("Move Disk" + x + "from" + Source + "to" + Destination);
        tower(x - 1, Aux, Destination, Source);
    }

    public static void main(String[] args) {
        tower(1, "A", "C", "B");
    }
}
