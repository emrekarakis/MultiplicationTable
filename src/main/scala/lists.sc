/*///1.case
val fruit = List("apples", "oranges", "pears")
val nums = List(1, 2, 3, 4)
val diag3 =
  List(
    List(1, 0, 0),
    List(0, 1, 0),
    List(0, 0, 1)
  )
val empty = List()
*/

///2.case
/*
val fruit: List[String] = List("apples", "oranges", "pears")
val nums: List[Int] = List(1, 2, 3, 4)
val diag3: List[List[Int]] =
  List(
    List(1, 0, 0),
    List(0, 1, 0),
    List(0, 0, 1)
  )
val empty: List[Nothing] = List()*/

val xs: List[String] = List()


val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
val numbers =1::(2::(3::(4::Nil)))
val diag3 = (1 :: (0 :: (0 :: Nil))) ::
  (0 :: (1 :: (0 :: Nil))) ::
  (0 :: (0 :: (1 :: Nil))) :: Nil
val empty = Nil

val nums = 1 :: 2 :: 3 :: 4 :: Nil



List(1, 2) ::: List(3, 4, 5)

List() ::: List(1, 2, 3)
List(1, 2, 3) ::: List(4)

//xs ::: ys ::: zs

//xs ::: (ys ::: zs)
def append[T](xs: List[T], ys: List[T]): List[T] =
  xs match {
    case List() => ys
    case x :: xs1 => x :: append(xs1, ys)
  }

///length of a list
List(1, 2, 3).length


val abcde = List('a', 'b', 'c', 'd', 'e')
abcde.last   //the last element of a list
abcde.init   //all element but except the last element of a list

List().init  ///UnsupportedOperationException

List().last  //NoSuchElementExcption

//reverse of a list
abcde.reverse

abcde

def rev[T](xs: List[T]): List[T] = xs match {
  case List() => xs
  case x :: xs1 => rev(xs1) ::: List(x)
}


xs.reverse.reverse equals xs
xs.reverse.init equals xs.tail.reverse
xs.reverse.tail equals xs.init.reverse
xs.reverse.head equals xs.last
xs.reverse.last equals xs.head
