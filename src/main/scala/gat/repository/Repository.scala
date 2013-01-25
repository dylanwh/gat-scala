package gat.repository

import java.nio.file.Path
import gat.workspace.Hash

trait Repository {
  type A <: Asset
  
  def create: Unit = ()
  
  def open: Unit = ()
  
  def close: Unit = ()
  
  def store(path: Path): A
  
  def fetch(hash: Hash): Option[A]
  
  def delete(hash: Hash): Unit
  
  def contains(hash: Hash): Boolean = fetch(hash).isDefined
  
  def assets: Iterable[A]
}
