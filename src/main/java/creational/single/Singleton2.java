package creational.single;

/**
 * 饱汉单例
 */
public class Singleton2 {
    private Singleton2(){};
    private  static Singleton2 single = null;

//    public static Singleton2 getInstance(){
//        if(single == null){
//            single = new Singleton2();
//        }
//        return single;
//    }

    public static Singleton2 getInstance(){
        if(single == null){
            synchronized (Singleton2.class){
                if(single == null){
                    single = new Singleton2();
                }
            }
        }
        return single;

    }
}
