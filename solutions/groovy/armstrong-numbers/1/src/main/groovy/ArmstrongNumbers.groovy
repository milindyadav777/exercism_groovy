class ArmstrongNumber {

    static isArmstrongNumber(number) {
        if (number >= 0 && number <= 9) return true
        List<Integer> digits = []
        int num = number
        while (num != 0) {
            int remainder = num % 10
            digits.add(remainder)
            num /= 10
        }
        int sum_of_digits_power = digits.sum {it**digits.size()}
        return sum_of_digits_power == number
    }

}