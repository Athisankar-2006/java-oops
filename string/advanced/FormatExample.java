public class FormatExample {
    public static void main(String[] args) {
        String name="Athi sankar";
        int age=19;
        double marks=86.90;

        String result=String.format("Name: %s | Age: %d | marks: %.2f",name,age,marks);
        System.out.println(result);
    }
    
}
