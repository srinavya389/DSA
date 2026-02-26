class Test {

    final int ID;   // final instance variable

    Test() {
        ID = 10;    // initialized once in constructor
    }

    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.ID);
    }
}