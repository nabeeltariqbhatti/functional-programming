package ch4;
class XCopy {
    public static void main(String [] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
    }
    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}