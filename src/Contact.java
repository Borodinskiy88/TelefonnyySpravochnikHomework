public class Contact {
    protected String name;
    protected String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format(name + " - " + number);
    }

    public String getNumber() {
        return number;
    }
}
