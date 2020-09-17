package Test;

public abstract class AbstractsTest implements InterfaceTest,InterfaceTest2 {

    private int r;
    protected int h;
    public int g;
    public abstract String singer();

    public abstract float bankinh();

    public int sum(int a, int b) {
        return a + b;
    }

    //    có thể implements nhiều interface.
    //    không thể khởi tạo đối tượng.
    //    có thể có phương thức, thuộc tính như class bình thường
    //    phương thức abstract không có phần thân.
    //    không thể final

}
