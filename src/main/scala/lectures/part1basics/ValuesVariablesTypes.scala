package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42 // TYPES ARE OPTIONAL
  println(x)
  // VALS ARE IMMUTABLE
  // COMPILER can infer types

  val aString: String = "Hello"; // Semicolons are allow but not necessary for one liners
  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4323
  val aLong: Long = 43234323213124L // Capital L at end
  val aFloat: Float = 2.0f // lower case f at end
  val aDouble: Double = 2.4

  // variables
  var aVariable: Int = 4 // var are mutable
  aVariable = 5 // side effects
}
