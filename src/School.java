public class School {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student("Lisa","1",90);
        Student std3 = new Student("Lucy","2",80);
        std1.introduce();
        std2.introduce();
        std3.introduce();
        GraduateStudent gstd1 = new GraduateStudent("Ben","3",95,"Black");
        gstd1.introduce();
        Student gstd1_ = gstd1;
        gstd1_.introduce();
    }
}
