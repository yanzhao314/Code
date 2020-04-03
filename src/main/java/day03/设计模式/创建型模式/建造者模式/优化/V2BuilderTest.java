package day03.设计模式.创建型模式.建造者模式.优化;

public class V2BuilderTest {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式精讲PPT").
                        buildCourseVideo("Java设计模式精讲视频").build();
        System.out.println(course);
    }

}
