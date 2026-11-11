package chapters.week05;

public class Student {

    private String name;          // 이름
    private int id;               // 학번
    private double totalPoints;   // 누적 점수 — 0.0에서 시작
    private int count;            // 점수 개수 — 0에서 시작

    public Student(String n, int i) {
        name = n;
        id = i;
    }

    public void addScore(int score) {
        totalPoints = totalPoints + score;   // 필드에 누적
        count = count + 1;
    }

    public double average() {
        return totalPoints / count;
    }

    public static void main(String[] args) {
        Student s = new Student("김자바", 20260001);
        s.addScore(90);
        s.addScore(80);                      // 앞서 더한 90은 필드에 유지
        System.out.println(s.name + "(" + s.id + ") 평균 = " + s.average());
    }
}
