import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Sortbyroll implements Comparator<Employee> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Employee a, Employee b) 
    { 
        return a.id - b.id; 
    } 
} 

class Sortbyname implements Comparator<Employee> 
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(Employee a, Employee b) 
    { 
        return a.name.compareTo(b.name); 
    } 
} 
public class SortingClass implements Comparator<Employee>{
	
    @Override
    public int compare(Employee customer1, Employee customer2) { 

        // for comparison 
        int NameCompare = customer1.getName().compareTo(customer2.getName()); 
        int AgeCompare = customer1.getId().compareTo(customer2.getId()); 

        // 2-level comparison using if-else block 
        if (NameCompare == 0) { 
            return ((AgeCompare == 0) ? NameCompare : AgeCompare); 
        } else { 
            return NameCompare; 
        } 
    } 
    
    public static void main(String args[])
    {

	ArrayList<Employee> details = new ArrayList<Employee>();

	details.add(new Employee(1,"ross"));
	details.add(new Employee(2,"chandler"));
	details.add(new Employee(3,"monica"));
	details.add(new Employee(4,"rachel"));
	details.add(new Employee(5,"pheobe"));
	details.add(new Employee(6,"joey"));

	
    //Collections.sort(details, new Sortbyroll()); 
	Collections.sort(details, new Sortbyname()); 
	//Collections.sort(details, new SortingClass()); 

            for(int i = 0;i < details.size();i++)
            {
                int value = details.get(i).id;
                String count = details.get(i).name;

                System.out.print(count+" "+value+" ");
                System.out.println();
            }

    }
}