package kotlin_programs

fun main(){
  //  task()
  /*  val a = task2(10,20)
    println(a)*/

   // println(task3())
    print( task4(10,20))

}

/*
 four types of functions
1.function with no parameter and return type
2.function with parameter and no return type
3.function with no parameter and  return type
4.function with parameter and return type        */

// 1. function with no parameter and no return type

/*
fun task(){
    val a = 10
    val b = 20
    val result = a+b
    println(result)
}*/

// 2. function with parameter and no return type

/*fun task2( a:Int, b:Int){
   var c = a+b
}*/

// function with  no parameter and return

/*fun task3():Int{
    val a = 10
    val b = 20
    val c = a+b
    return c
}*/

// function with parameter and return type

fun task4(a:Int,b:Int):Int{
    val c = a+b
    return c

}
