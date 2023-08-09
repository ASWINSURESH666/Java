package QUESTION_2;

class Strings {
    int num;
    String name;

    void setData(int num, String name) {
        this.num = num;
        this.name = name;
    }

    void print() {
        for (int i = 0; i < num; i++) {
            System.out.println(name);
        }
    }
}
