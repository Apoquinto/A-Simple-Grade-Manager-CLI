package View;

public interface ICLI {

    public String sucessMsg(String msg);

    public String warningMsg(String msg);

    public String errorMsg(String msg);

    public void update();

    public String read();

    public void clear();

    public void print(String msg);

}
