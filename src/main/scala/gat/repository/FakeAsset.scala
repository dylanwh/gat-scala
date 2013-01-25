package gat.repository

import java.nio.file.Path
import gat.workspace.Hash

class FakeAsset extends Asset {
  
  val hash = Hash("deadbeef")
  val size = 0L
  
  def attach(path: Path) = ()
  def detach(path: Path) = ()
  val isStored = true
  def isAttached(path: Path) = true

}