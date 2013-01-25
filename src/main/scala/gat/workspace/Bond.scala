package gat.workspace;

import scala.collection.mutable.Set


class Bond(val hash: Hash) extends Serializable {
  private val labelSet : Set[Label] = Set()
  
  def addLabel(label: Label): Unit    = labelSet.add(label)
  def removeLabel(label: Label): Unit = labelSet.remove(label)
  def hasLabel(label: Label): Boolean = labelSet.contains(label)
  
  def labels() = labelSet.toIterable
  
  
}


