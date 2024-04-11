package com.example.myapplication.functionsinkotlin

data class Point(val x: Int, val y:Int) {
}

//infix fun Point.add(point: Point): Point {
//    return Point(this.x + point.x, this.y + point.y)
//}

infix fun Point.add(point: Point): Point = Point(this.x + point.x, this.y + point.y)
operator fun Point.plus(point: Point): Point = Point(this.x + point.x, this.y + point.y)

fun main(){
    val pt1 = Point(1, 1)
    val pt2 = Point(2, 2)

    val newPt = pt1.add(pt2)
    val newPt2 = pt1 add pt2
    val newPt3 = pt1 + pt2

    println(newPt)
    println(newPt2)
    println(newPt3)
}