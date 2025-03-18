package recursions;

public class TowerOfHanoi {

    public static void towersOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        // move n-1 disks from source to auxiliary
        towersOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        // move nth disk from source to destination
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        // move n-1 disks from auxiliary to destination
        towersOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        int n = 4; // Number of disks
        towersOfHanoi(n, 'S', 'D', 'I'); // A, B and C are names of rods
    }
}
