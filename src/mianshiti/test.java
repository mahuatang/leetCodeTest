package mianshiti;

class Singleton {
    private static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;

    }
}

/**
 * 班级
 * 学号
 * 姓名
 * 分数
 * 科目
 *
 *
 * 每个班级每个科目的最高分的学生信息
 *
 *
 *
 * select * from t group
 */


public class test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);

    }
}
