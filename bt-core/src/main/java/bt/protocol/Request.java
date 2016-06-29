package bt.protocol;

public class Request implements Message {

    private int pieceIndex;
    private int offset;
    private int length;

    public Request(int pieceIndex, int offset, int length) throws InvalidMessageException {

        if (pieceIndex < 0 || offset < 0 || length <= 0) {
            throw new InvalidMessageException("Illegal arguments: piece index (" +
                    pieceIndex + "), offset (" + offset + "), length (" + length + ")");
        }

        this.pieceIndex = pieceIndex;
        this.offset = offset;
        this.length = length;
    }

    public int getPieceIndex() {
        return pieceIndex;
    }

    public int getOffset() {
        return offset;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName() + "] piece index {" + pieceIndex + "}, offset {" + offset +
                "}, length {" + length + "}";
    }
}
