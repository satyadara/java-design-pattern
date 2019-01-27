public class MainSingleton {
    public static void main(String[] args) {

        MySingleton singleton1 = MySingleton.getINSTANCE();
        singleton1.setSomeText("This text from singleton1");

        MySingleton singleton2 = MySingleton.getINSTANCE();
        System.out.println("Print singleton2 text : " + singleton2.getSomeText());
    }
}
