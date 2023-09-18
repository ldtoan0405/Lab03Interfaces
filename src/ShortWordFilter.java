public class ShortWordFilter implements Filter<String> {
    @Override
    public boolean accept(String str) {
        return str.length() < 5;
    }
}
