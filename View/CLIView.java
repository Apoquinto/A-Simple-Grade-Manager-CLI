package View;

import java.io.Console;

abstract class CLIView implements ICLI {

    private Console console;

    public CLIView() {
        this.console = System.console();
    }

    @Override
    // Update function, define the view life cicle.
    public void update() {
        print("This is a CLIView.");

        clear();
    }

    /**
     * Print a String in console.
     * 
     * @param msg
     */
    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    /**
     * Read a input in console.
     * 
     * @return String
     */
    @Override
    public String read() {
        print("\n" + makeGreen(">> "));
        return console.readLine();
    }

    /**
     * Clean message or operation.
     */
    @Override
    public void clear() {
        print("\n" + makeGreen(">> ") + "Reload...\n");
    }

    /**
     * Returns a msg: String in sucess format.
     * 
     * @param msg
     * @return String
     */
    @Override
    public String sucessMsg(String msg) {
        return makeGreen(msg);
    }

    /**
     * Returns a msg: String in warning format.
     * 
     * @param msg
     * @return String
     */
    @Override
    public String warningMsg(String msg) {
        return makeYellow(msg);
    }

    /**
     * Returns a msg: String in error format.
     * 
     * @param msg
     * @return String
     */
    @Override
    public String errorMsg(String msg) {
        return makeRed("Error! ") + makeYellow(msg);
    }

    /**
     * Returns a msg: String in green text.
     * 
     * @param msg
     * @return String
     */
    private String makeGreen(String msg) {
        return "\033[32m" + msg + "\u001B[0m";
    }

    /**
     * Returns a msg: String in yellow text.
     * 
     * @param msg
     * @return String
     */
    private String makeYellow(String msg) {
        return "\033[33m" + msg + "\u001B[0m";
    }

    /**
     * Returns a msg: String in red text.
     * 
     * @param msg
     * @return String
     */
    private String makeRed(String msg) {
        return "\033[31m" + msg + "\u001B[0m";
    }
}
