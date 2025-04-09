/*4) Product Inventory (Collections) 
Question: A product inventory system needs to handle item names, including removing 
duplicates when generating a report. Develop a Java program that: 
1. Uses an ArrayList<String> to store product names (with duplicates). 
2. Converts the list to a HashSet<String> (or LinkedHashSet) to remove 
duplicates. 
3. Demonstrates list operations (add(), remove(), etc.) and set operations 
(size(), contains()). 
4. Prints the final distinct product list.  */

package programs;
import java.util.*;;
public class ProductInventory {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i =0;i<n;i++)
        {
            list.add(sc.next());
        }

        System.out.println("Originaal Lit");
        System.out.println(list);

        HashSet<String> hs = new HashSet<>(list);
        System.out.println("List without duplicates");
        System.out.println(hs);

        System.err.println("Enter your option: 1 for add items in list and 2 for remove items in list");
        int option = sc.nextInt();
        System.out.println("Enter your product");
        String str = sc.next();
        switch (option) {
            case 1 -> list.add(str);
            case 2 -> list.remove(str);
            default -> System.out.println("Enter a valid number !! Your operation is wrong");
        }
        sc.close();

        System.out.println("Your list after operation");
        System.out.println(list);
    }
    
}
