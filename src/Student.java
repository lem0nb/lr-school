public class Student {
    private String name;
    private String studentId;
    private int score;
    public Student() {
        name = "default";
        studentId = "default";
        score = 60;
    }
    public Student(String name,String studentId,int score) {
        this.name = name;
        this.studentId = studentId;
        if (score>=0 && score<=100) {
            this.score = score;
        } else {
            throw new IllegalArgumentException("分数需要在范围内！");
        }
    }
    public String getName() {
        return name;
    }
    public String getStudentId() {
        return studentId;
    }
    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setScore(int score) {
        if (score>=0 && score<=100) {
            this.score = score;
        } else {
            throw new IllegalArgumentException("分数需要在范围内！（0~100）");
        }
    }
    public void introduce() {
        System.out.println("我是"+name+"，学号"+studentId+"，成绩"+score);
    }
}
