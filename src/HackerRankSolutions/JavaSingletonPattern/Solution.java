package HackerRankSolutions.JavaSingletonPattern;



class Singleton{
    // public instance variable
    public String str;

    // private static instance of Singleton (only one instance)
    private static Singleton singleInstance = null;

    // private constructor to prevent instantiation
    private Singleton() {
        str = "";
    }

    // static method to get the single instance of Singleton
    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton(); // create the instance if not already created
        }
        return singleInstance; // return the single instance
    }
}