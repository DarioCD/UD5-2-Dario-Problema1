public class Main {
    public static void main(String[] args) {
        SuperList list = new SuperList();
        list.addElement(111);
        list.addElement(222);
        list.addElement(333);
        list.addElement(444);
        list.removeElement(3);
        System.out.println("------------------");
        list.showElements();
        System.out.println("------------------");
        list.showReversedElements();
    }
}