//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    List<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(9);
    list.add(8);

    System.out.println("Forward");

    ListIterator<Integer> lrt = list.listIterator();

    while (lrt.hasNext()) {
        System.out.print(lrt.next() + " ");
    }

    System.out.println("\nBackward");

    while (lrt.hasPrevious()) {
        System.out.print(lrt.previous() + " ");
    }

    }

