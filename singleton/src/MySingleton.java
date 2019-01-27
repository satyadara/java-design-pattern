public class MySingleton {
    private static MySingleton INSTANCE;
    private String someText;

    private MySingleton(){}

    public static MySingleton getINSTANCE(){
        if (INSTANCE == null) {
            INSTANCE = new MySingleton();
        }

        return INSTANCE;
    }

    public String getSomeText() {
        return someText;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }
}
