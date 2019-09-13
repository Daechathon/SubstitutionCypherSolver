import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CypherSolver {

    public static void main(String[] args) {

        java.util.Scanner sc = new Scanner(System.in);

        System.out.println("Enter the substitution cypher");
        Cypher cypher = new Cypher(sc.nextLine());
    }
}
