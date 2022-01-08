package kata;

public class PythagoreanTriple {
    public int pythagoreanTriple(int[] triple){
        return triple[2] * triple[2] == triple[0] * triple[0] + triple[1] * triple[1]
                ? 1 : 0;
    }
}
