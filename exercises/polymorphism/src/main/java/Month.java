public enum Month {
    JANUARY(30), FEBRUARY(28) {
        @Override
        public int getDaysInMonth() {
            return IS_LEAP_YEAR ? 29 : 28;
        }
    }, MARCH(31), APRIL(30);

    static final boolean IS_LEAP_YEAR = true;
    private int daysInMonth;
    Month(int daysInMonth) {
        this.daysInMonth = daysInMonth;
    }

    public int getDaysInMonth() {
        return daysInMonth;
    }

    public static void main(String[] args) {
        Month m = FEBRUARY;
        System.out.printf("%s has %d days%n", m, m.getDaysInMonth());

        System.out.println(m.name());
    }
}
