public class EmptySLListException extends Exception {

    private String name;

    public EmptySLListException (String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String getMessage() {
        return name + " is empty, " + super.getMessage();
    }

}

