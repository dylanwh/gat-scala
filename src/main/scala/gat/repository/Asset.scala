package gat.repository

import gat.workspace.Hash
import java.nio.file.Path

trait Asset {
  def hash: Hash
  def size: Long
  
  def attach(path: Path): Unit
  def detach(path: Path): Unit
  
  def isAttached(path: Path): Boolean
  def isStored: Boolean
}