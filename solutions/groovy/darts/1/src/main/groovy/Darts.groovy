class Darts {

    static int score(x, y) {
        float distance = (x*x + y*y)**(1/2)
        int point = 0
        if (distance <= 10)
            point = 1
        if (distance <= 5)
            point = 5
        if (distance <= 1)
            point = 10
        return point
    }
}