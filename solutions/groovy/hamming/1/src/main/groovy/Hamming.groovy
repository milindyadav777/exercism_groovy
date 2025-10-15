class Hamming {

    def distance(strand1, strand2) {
        if (strand1.size() != strand2.size())
            throw new ArithmeticException()
        int h_dist = 0
        for (int i=0; i < strand1.size(); i++) {
            if (strand1[i] != strand2[i])
                h_dist++
        }
        return h_dist
    }

}