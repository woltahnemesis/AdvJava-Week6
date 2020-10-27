import java.util.*;

public class SetsVsLists {
    public static void main(String [] args){
        Student student1 = new Student(23, "Fred","Flintstone");
        Student student2 = new Student(87, "Barney","Rubble");
        Student student3 = new Student(23, "Fred","Flintstone");

        ArrayList<Student> class1 = new ArrayList<>();
        class1.add(student1);
        class1.add(student2);
        class1.add(student3);

        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(student1);
        linkedList.add(student2);
        linkedList.add(student3);

        List<String> words = Arrays.asList("hello", "goodbye", "test");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(words);

        System.out.println(class1);
        Collections.sort(class1);
        System.out.println(class1);

        // Defining our own custom method by creating
        // an anonymous inner class
        Collections.sort(class1, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getFirstName().compareTo(s2.getFirstName());
            }
        });

        System.out.println(class1);

        // Defining our own custom sort using lambda expression
        Collections.sort(words, (word1, word2) -> {
            return word1.length() - word2.length();
        });

        System.out.println(words);

        // What's with Sets ... aren't they the same as a list?
        HashSet<Student> class2 = new HashSet();
        class2.add(student1);
        class2.add(student2);
        class2.add(student3);

        System.out.println("Hashset: " + class2);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(arrayList);
        System.out.println("Hashset of String objects: " + hashSet);
        hashSet.add("Test");
        hashSet.add("Alpha");
        System.out.println("Hashset of String objects: " + hashSet);
        arrayList.add("Test");
        System.out.println("ArrayList of String objects: " + arrayList);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(arrayList);
        System.out.println("TreeSet: " + treeSet);

        // Map object has a key and value pair. Similar to a "Dictionary"
        HashMap<String, String> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Jaret", "705-555-1234");
        phoneNumbers.put("Fred", "777-123-1234");

        HashMap<String, ArrayList<String>> makeAndModels = new HashMap<>();
        makeAndModels.put("Honda", new ArrayList<>());
        makeAndModels.get("Honda").add("Accord");
        makeAndModels.get("Honda").add("Civic");
        makeAndModels.get("Honda").add("Ridgeline");
        makeAndModels.get("Honda").add("CRV");
        makeAndModels.put("Ford", new ArrayList<>());
        makeAndModels.get("Ford").add("F150");
        makeAndModels.get("Ford").add("F250");
        makeAndModels.get("Ford").add("Focus");
    }
}
