public class Printer {

    private int amountOfPaper;
    private int amountOfToner;

    public Printer(int paper, int toner) {
        this.amountOfPaper = paper;
        this.amountOfToner = toner;
    }

    public int paperCount() {
        return this.amountOfPaper;
    }

    public int tonerCount() {
        return this.amountOfToner;
    }

    // should remove amount of paper passed in as pages and copies - and returns nothing
    // should also reduce the volume of toner per page printed
    public void print(int pages, int copies) {

        // pages and copies should be multiplied together for overall amount of paper that will be used
        int totalPages = pages * copies;

        // then if the totalPages <= paper & toner in printer THEN
        if (totalPages <= this.amountOfPaper && totalPages <= this.amountOfToner) {

            //    reduce amount of paper in printer by totalPages and amount of toner by 1 for each page
            this.amountOfPaper = this.amountOfPaper - totalPages;
            this.amountOfToner = this.amountOfToner - totalPages;
        }
    }
}
