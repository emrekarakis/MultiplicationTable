

/*var increase = (x: Int) => x + 1

increase = (x: Int) => {
  println("We")
  println("are") println("here!") x+1
}

increase = (x: Int) => x + 9999*/
//def sum(a: Int, b: Int, c: Int) = a + b + c
//a(1, 2, 3)
//val a = sum _

val someNumbers = List(-11, -10, -5, 0, 5, 10)
var sum =0
someNumbers.foreach(sum += _)
sum
def echo(args: String*) =
  for (arg <- args) println(arg)
echo()
echo("one")
echo("hello", "world!")
 def speed(distance: Float, time: Float): Float =
  distance / time
 speed(100, 10)
def printTime(out: java.io.PrintStream = Console.out) =
  out.println("time = "+ System.currentTimeMillis())

def printTime2(out: java.io.PrintStream = Console.out,
               divisor: Int = 1) =
  out.println("time = "+ System.currentTimeMillis()/divisor)

printTime2(out = Console.err)
printTime2(divisor = 1000)
/*
def approximate(guess: Double): Double =
  if (isGoodEnough(guess)) guess
  else approximate(improve(guess))
def approximateLoop(initialGuess: Double): Double = {
  var guess = initialGuess
  while (!isGoodEnough(guess))
    guess = improve(guess)
  guess
}


def isEven(x: Int): Boolean =
  if (x == 0) true else isOdd(x - 1)
def isOdd(x: Int): Boolean =
  if (x == 0) false else isEven(x - 1)


val funValue = nestedFun _
def nestedFun(x: Int) {
  if (x != 0) { println(x); funValue(x - 1) }
}


def filesMatching(query: String, method) =
  for (file <- filesHere; if file.getName.method(query))
    yield file

def filesRegex(query: String) =
  for (file <- filesHere; if file.getName.matches(query))
    yield file*/

//println{ "Hello World!"}



def describe(x: Any) = x match {
  case 5 => "five"
  case true => "truth"
  case "hello" => "hi!"
  case Nil => "the empty list"
  case _ => "something else"
}