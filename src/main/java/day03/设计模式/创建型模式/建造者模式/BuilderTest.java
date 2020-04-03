package day03.设计模式.创建型模式.建造者模式;

public class BuilderTest {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲笔记",
                "Java设计模式精讲问答");
        System.out.println(course);

    }
}

