package Q4;

class BumperCarsTicket extends Ticket {
    public BumperCarsTicket(int sNo) {
        super(sNo);
    }

    @Override
    public int getsNo() {
        return super.getsNo();
    }

    @Override
    public String toString() {
        return String.format("S.No: %d for bumper cars", super.getsNo());
    }
}