public enum Enumstuff {
    Rock (0, "Rock"),
    Paper (1, "Paper"),
    Scissors (2, "Scissors");

    public final int compareNumber;
    public final String moveName;
    Enumstuff(int compareNumber, String moveName) {
        this.compareNumber = compareNumber;
        this.moveName = moveName;
    }


}
