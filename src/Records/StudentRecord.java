package Records;

public record StudentRecord(String name,String email) {

    /*
    * records are final classes -
     */
    public static void printName() {
        System.out.println("Student1");
    }
}
