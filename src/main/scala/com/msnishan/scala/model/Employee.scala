package com.msnishan.scala.model

/**
 * Created by ksaleh on 3/31/16.
 */
class Employee(val firstName: String, val lastName: String) {

  def canEqual(other: Any): Boolean = other.isInstanceOf[Employee]

  override def equals(other: Any): Boolean = other match {
    case that: Employee =>
      (that canEqual this) &&
        firstName == that.firstName &&
        lastName == that.lastName
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(firstName, lastName)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }

  override def toString: String = firstName + " " + lastName
}
