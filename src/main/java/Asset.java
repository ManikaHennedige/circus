public interface Asset {
    public default int getValue(Asset a) {
        return 0;
    }
}
