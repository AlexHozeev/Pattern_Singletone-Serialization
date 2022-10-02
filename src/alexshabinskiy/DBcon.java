package alexshabinskiy;

final public class DBcon {

    private static DBcon dBcon;


    //paste all code here

    private DBcon() {
    }


    public static DBcon get() {
        if (dBcon == null) {
            dBcon = new DBcon();
        }
        return dBcon;
    }
}
