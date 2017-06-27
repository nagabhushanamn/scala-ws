import java.util

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

//--------------------------------------------

//Expressions


println(1) // 1
println(1 + 1) // 2
println("Hello!") // Hello!
println("Hello," + " world!") // Hello, world!


//--------------------------------------------


// Values ( for immutable data )

val x1 = 1 + 1
//x = 3 // This does not compile.

//--------------------------------------------

//Variables ( for mutable data )

var x2 = 1 + 1
x2 = 3 // This compiles because "x" is declared with the "var" keyword.
println(x2 * x2) // 9

//--------------------------------------------

var x3: Int = 1 + 1 // Explicit Typing

//--------------------------------------------


// day-2

// Block Expression ( Expression with Multiple lines )

var v={
  val x = 1 + 1
  x + 1
};
println(v) // 3

//--------------------------------------------


//Functions


// functions are expressions that take parameters

val add = (x: Int, y: Int) => x + y
println(add(1, 2)) // 3

val getTheAnswer = () => 42
println(getTheAnswer()) // 42

//--------------------------------------------

//Methods


def add2(x: Int, y: Int): Int = x + y
println(add2(1, 2)) // 3


def name: String = System.getProperty("name")
println("Hello, " + name + "!")



def getSquareString(input: Double): String = {
  val square = input * input
  square.toString
}
println(getSquareString(12.12))

//--------------------------------------------


// var Vs var Vs def Vs lazy var
//===============================



// 'val'

val name1:String = "Scala"
//name1 = "Java" // error: reassignment to val


//How Scala ‘val’ is Evaluated?
/*
In Scala, ‘val’ is used to define constants. It evaluates only once.
*/
//
val number = { println("Constant number is initialized."); 99 }
println("Before Accessing 'number' constant:")
println(number + 1)
println(number + 1)
println(number + 1)


//--------------------------------------------


//Scala ‘var’ usage

//
var name2:String = "Scala"
name2 = "Java"

//How Scala ‘var’ is Evaluated?
/*
var is evaluated at the time of definition
It is evaluated only once
*/
//
val number2 = { println("Variable number is initialized."); 99 }
println("Before Accessing 'number' variable:")
println(number2 + 1)
println(number2 + 1)
println(number2 + 1)

//--------------------------------------------

//Scala ‘def’ usage

/*
  In Scala, def is used to define functions or methods
*/

def add3(num1:Int, num2:Int): Int = num1 + num2
add3(11,22)

//How Scala ‘def’ is Evaluated?

/*
  In Scala, def is evaluated lazily.
*/

def tax = {
  println("Function execution started.")
  1100
}
//
println(tax)
println(tax)
println(tax)

//--------------------------------------------

//How Scala ‘lazy val’ is Evaluated?

/*
  lazy val is evaluated lazily and only once
*/

lazy val number3 = { println("Constant number is initialized."); 99 }
println("Before Accessing 'number' constant:")
println(number3 + 1)
println(number3 + 1)
println(number3 + 1)


//--------------------------------------------

//Scala val,var,lazy val and def Constructs In-Brief

//
//“val” is used to define Immutable data. It’s evaluated only once at the time of definition.
//“var” is used to define Mutable data. It’s evaluated only once at the time of definition.
// Both val and var are evaluated Eagerly.
//“lazy val” is used to define Immutable data. It is evaluated only once when we access it for first time. That means it is evaluated Lazily.
//“def” is used to define Methods or Functions. It is evaluated only when we access it and evaluated every-time we access it. That means it is evaluated Lazily.


//--------------------------------------------


// class
//================


class User
val user1 = new User


//--------------------------------------------

// class with constructor args

class Point(var x: Int, var y: Int) {
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }
  override def toString: String =
    s"($x, $y)"
}
val point1 = new Point(2, 3)
point1.x  // 2
println(point1)  // prints (x, y)

//--------------------------------------------

// constructor with default parameters

class Person(name:String="Nil",age:Int=0)

val person1=new Person
val person2=new Person("Nag")
val person3=new Person("Nag",33)
val person4=new Person(age=33)

//--------------------------------------------

//Private Members and Getter/Setter Syntax

class Point_1 {

  private var a= 0
  private var b = 0
  private val bound = 100

  // get
  def x = a
  // set
  def x_= (newValue: Int): Unit = {
    if (newValue < bound) a = newValue else printWarning
  }

  def y = b
  def y_= (newValue: Int): Unit = {
    if (newValue < bound) b = newValue else printWarning
  }

  private def printWarning = println("WARNING: Out of bounds")
}


val point = new Point_1
point.x = 99
point.y = 101 // prints the warning

//------------------------------------------------------------------

class Point_2(val x: Int, val y: Int)
val point0 = new Point_2(1, 2)
//point0.x = 3  // <-- does not compile


//------------------------------------------------------------------


class Point_3(x: Int, y: Int)
val point3 = new Point_3(1, 2)
//point3.x  // <-- does not compile


//------------------------------------------------------------------

//Traits
//=========

/*

        -Interface to follow by other objects
        -contract b/w dependent & dependency objects

         Classes and objects can extend traits
         but traits cannot be instantiated and therefore have no parameters.

 */

/*
  e.g
    dependent e.g car
    dependency e.g wheel
 */


// code without "traits"

class MRFWheel{
 def rotate(): Unit ={
   println("MRF Wheel Rotating...")
 }
}

class Car{
  def move(wheel: MRFWheel): Unit ={
    wheel.rotate()
    println("Car Moving...")
  }
}

val car1=new Car
car1.move(new MRFWheel)

/*

  car tightly-coupled with MRFWheel ,
  in future if we want to use new wheel brand, need to refactor car implementation again

 */


//------------------------------------------------------------------

// code with 'traits'

trait Wheel{
  def rotate()
}

class NewMRFWheel extends  Wheel{
  def rotate()={
    println("MRF Wheel rotating...")
  }
}
class CEATWheel extends  Wheel{
  def rotate()={
    println("CEAT Wheel rotating...")
  }
}

class NewCar {
  def move(wheel: Wheel): Unit ={
    wheel.rotate()
    println("Car Rotating...")
  }
}

val car2=new NewCar();
car2.move(new NewMRFWheel)
car2.move(new CEATWheel)



//------------------------------------------------------------------


// OO Principle ( Inversion of Control )  - we must follow


/*
  e.g Shop

      PriceMatrix : getPrice(item)
      BillingImpl : getTotalPrice(cart)

 */

// code without 'IOC' principle


class PriceMatrixImpl_v1{
  def getPrice(item:String):Double={
    return  100.00
  }
}

class BillingImpl {
  def getTotalPrice(cart:List[String])={
    val priceMatrix=new PriceMatrixImpl_v1
    var total=0.0
    cart.foreach(item=>total+=priceMatrix.getPrice(item))
    total
  }
}

val billComp=new BillingImpl
val totalPrice=billComp.getTotalPrice(List("123","321"))
println(totalPrice)


/*

  design & performance issues on above BillingImpl code

  1. tight coupling b/w dependent & dependency components
      - in future we cant go new version of PriceMatrix
  2. on every 'getTotalPrice' call , new dependency instance created & destructed
  3. Unit-Testing Not Possible on Billing component

  Reasons for issues

  - dependent class itself creating its own dependency

  Solution:

   - Don't create/lookup for dependency in dependent's class ( IOC )


   How to implement IOC ?

    thru 'Dependency Injection"


 */


// New shop appln code



trait PriceMatrix{
  def getPrice(item:String):Double
}

class NewPriceMatrixImpl_v1 extends  PriceMatrix{
  def getPrice(item:String):Double={
    return  100.00
  }
}
class NewPriceMatrixImpl_v2 extends  PriceMatrix{
  def getPrice(item:String):Double={
    return  200.00
  }
}

class NewBillingImpl(priceMatrix: PriceMatrix) {
  def getTotalPrice(cart:List[String])={
    val priceMatrix=new PriceMatrixImpl_v1
    var total=0.0
    cart.foreach(item=>total+=priceMatrix.getPrice(item))
    total
  }
}

var billComp1=new NewBillingImpl(new NewPriceMatrixImpl_v1) // Dependency Injection
billComp1=new NewBillingImpl(new NewPriceMatrixImpl_v1)
val totalPrice1=billComp.getTotalPrice(List("123","321"))
println(totalPrice1)



//------------------------------------------------------------------


// Subtyping


trait Pet {
  val name: String
}
class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet
val dog = new Dog("Harry")
val cat = new Cat("Sally")

val animals = ArrayBuffer.empty[Pet]
animals.append(dog)
animals.append(cat)
animals.foreach(pet => println(pet.name))


//------------------------------------------------------------------


//Class Composition with Mixins  ( aka Multiple Inheritance )


abstract class A {
  val message: String
}
class B extends A {
  val message = "I'm an instance of class B"
}
trait C extends A {
  def loudMessage = message.toUpperCase()
}
class D extends B with C
val d = new D
d.message  // I'm an instance of class B
d.loudMessage  // I'M AN INSTANCE OF CLASS B


//------------------------------------------------------------------


//  Important code to understand about AbstractClass & Traits & class


abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next: T
}

class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0
  def hasNext = i < s.length
  def next = {
    val ch = s charAt i
    i += 1
    ch
  }
}

trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit): Unit = while (hasNext) f(next)
}

class Iter extends StringIterator("NAG") with RichIterator
val iter = new Iter
iter foreach println


//------------------------------------------------------------------

// Nested methods


def teach(sub:String)={
  println("teaching "+sub)
  val notes=sub+"-notes";

  def learn(): Unit ={
    println("learning "+sub+" with - "+notes)
  }

  learn()
}

teach("Scala");


//------------------------------------------------------------------


//Case Classes

/*
  Case classes are good for modeling immutable data
*/


case class Book(isbn: String)
val book1 = Book("978-0486282114")


case class Message(sender: String, recipient: String, body: String)
val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")
println(message1.sender)  // prints guillaume@quebec.ca
//message1.sender = "travis@washington.us" // this line does not compile


// we can compare objects with "=="
val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
val messagesAreTheSame = message2 == message3  // true

// deep copying
val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")
message5.sender  // travis@washington.us
message5.recipient // claire@bourgogne.fr
message5.body  // "Me zo o komz gant ma amezeg"


//------------------------------------------------------------------

// Pattern Matching
//===================

val x: Int = Random.nextInt(10)
x match {
  case 0 => "zero"
  case 1 => "one"
  case 2 => "two"
  case _ => "many"
}

//------------------------------------------------------------------

def matchTest(x: Int): String = x match {
  case 1 => "one"
  case 2 => "two"
  case _ => "many"
}
matchTest(3)  // many
matchTest(1)  // one

//------------------------------------------------------------------

abstract class Notification
case class Email(sender: String, title: String, body: String) extends Notification
case class SMS(caller: String, message: String) extends Notification
case class VoiceRecording(contactName: String, link: String) extends Notification


def showNotification(notification: Notification): String = {
  notification match {
    case Email(email, title, _) =>
      s"You got an email from $email with title: $title"
    case SMS(number, message) =>
      s"You got an SMS from $number! Message: $message"
    case VoiceRecording(name, link) =>
      s"you received a Voice Recording from $name! Click the link to hear it: $link"
  }
}
val someSms = SMS("12345", "Are you there?")

//------------------------------------------------------------------

abstract class Device
case class Phone(model: String) extends Device{
  def screenOff = "Turning screen off"
}
case class Computer(model: String) extends Device {
  def screenSaverOn = "Turning screen saver on..."
}
def goIdle(device: Device) = device match {
  case p: Phone => p.screenOff
  case c: Computer => c.screenSaverOn
}


//------------------------------------------------------------------

sealed abstract class Furniture
case class Couch() extends Furniture
case class Chair() extends Furniture
def findPlaceToSit(piece: Furniture): String = piece match {
  case a: Couch => "Lie on the couch"
  case b: Chair => "Sit on the chair"
}

//------------------------------------------------------------------

// Singleton Objects
//===================


// a. stand-alone singleton objects : to hold static variables & methods

object Blah {
  def sum(l: List[Int]): Int = l.sum
}

println(Blah.sum(List(1,2,3)))


//------------------------------------------------------------------

// b.Companions

/*

Most singleton objects do not stand alone,
but instead are associated with a class of the same name in same file.

*/

class MyString(val str:String){
  private var extraData:String=""
  override def toString=str+" "+extraData
}

object MyString{
  def apply(base:String,extras:String)={
    val s=new MyString(base)
    s.extraData=extras
    s
  }
  def apply(base:String)=new MyString(base)
}

println(MyString("Hello","World"))
println(MyString("Hello"))


//------------------------------------------------------------------

// Regular Expressions

import scala.util.matching.Regex
val numberPattern: Regex = "[0-9]".r
numberPattern.findFirstMatchIn("awesomepassword") match {
  case Some(_) => println("Password OK")
  case None => println("Password must contain a number")
}



//------------------------------------------------------------------

//Extractor Objects
//-------------------

object CustomerID {
  def apply(name: String) = s"$name--${Random.nextLong}"
  def unapply(customerID: String): Option[String] = {
    val name = customerID.split("--").head
    if (name.nonEmpty) Some(name) else None
  }
}
val customer1ID = CustomerID("Sukyoung")  // Sukyoung--23098234908
customer1ID match {
  case CustomerID(name) => println(name)  // prints Sukyoung
  case _ => println("Could not extract a CustomerID")
}


//------------------------------------------------------------------

//Generic Classes
//================

class Fruit
class Apple extends Fruit
class Banana extends Fruit
val stack = new util.Stack[Fruit]
val apple = new Apple
val banana = new Banana
stack.push(apple)
stack.push(banana)


//Covariant in Scala

class Animal[+T](val animal:T)

class NewDog
class Puppy extends NewDog

class AnimalCarer(val dog:Animal[NewDog])

val puppy = new Puppy
val dog1 = new NewDog

val puppyAnimal:Animal[Puppy] = new Animal[Puppy](puppy)
val dogAnimal:Animal[NewDog] = new Animal[NewDog](dog1)

val dogCarer = new AnimalCarer(dogAnimal)
val puppyCarer = new AnimalCarer(puppyAnimal)

println("Done.")



//Contravariant in Scala

abstract class Type [-T]{
  def typeName : Unit
}

class SuperType extends Type[AnyVal]{
  override def typeName: Unit = {
    println("SuperType")
  }
}
class SubType extends Type[Int]{
  override def typeName: Unit = {
    println("SubType")
  }
}

class TypeCarer{
  def display(t: Type[Int]){
    t.typeName
  }
}
val superType = new SuperType
val subType = new SubType

val typeCarer = new TypeCarer

typeCarer.display(subType)
typeCarer.display(superType)





