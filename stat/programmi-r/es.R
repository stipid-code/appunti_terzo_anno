fizzBuzz <- function(n) {
    if((n%%15)==0)
        "FizzBuzz"
    else if ((n%%5) == 0)
        "Buzz"
    else if ((n%%3) == 0)
        "Fizz"
    else
        paste(n)
}
