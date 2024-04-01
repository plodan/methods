public class Printer {

    private String queue = "";

    private int pagesIsQueue = 0;
    private int pagesPrinted = 0;
    private int allPagesPrinted =0;



    public void append(String text) {
        queue = queue + "\n" + "Документ без имени" + " - " + text;
        pagesIsQueue = pagesIsQueue + 1;

    }

    public void append(String text, String name) {
        queue = queue + "\n" + name + " - " + text;
        pagesIsQueue = pagesIsQueue + 1;


    }

    public  void append(String text, int pageCount) {
        queue = queue + "\n" + "Документ без имени" + " - " + text;
        pagesIsQueue = pagesIsQueue + pageCount;

    }

    public void append(String text, String name, int pageCount) {
        queue = queue + "\n" + name + " - " + text;
        pagesIsQueue = pagesIsQueue + pageCount;

    }

    public void clear (){
        queue = "";
        pagesIsQueue = 0;

    }

    public void print(){
        System.out.println(queue);
        allPagesPrinted = allPagesPrinted + pagesIsQueue;
        clear();

    }
    public int getPagesCount() {
        return pagesIsQueue;
    }
    public int getAllPagesPrinted (){
        return allPagesPrinted;
    }


}
