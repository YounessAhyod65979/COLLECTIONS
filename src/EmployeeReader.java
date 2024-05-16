import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeeReader {

    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();


        try (BufferedReader br = new BufferedReader(new FileReader("listofEmployees.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Size of the collection: " + employees.size());


        System.out.println("Contents using a for-each loop:");
        for (String employee : employees) {
            System.out.println(employee);
        }


        System.out.println("\nContents using an Iterator:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        String sampleEmployee = "John Doe";
        if (employees.contains(sampleEmployee)) {
            System.out.println("\n" + sampleEmployee + " exists in the collection.");
        } else {
            System.out.println("\n" + sampleEmployee + " does not exist in the collection.");
        }
    }
}
