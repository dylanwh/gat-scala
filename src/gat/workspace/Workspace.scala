package gat.workspace

import com.google.common.io.Files
import java.nio.file.Path
import java.nio.file.FileSystems
import com.google.common.hash.Hashing
import scala.collection.JavaConverters._

trait Workspace {
  def newHash(path: Path): Hash
  
  def newLabel(path: Path): Label
  def newLabel(path: String): Label
  
  def resolveLabel(label: Label): Path
}

object Workspace {

  private class DefaultWorkspace(val baseDirectory: Path) extends Workspace {    
    val digestMethod  = Hashing.md5
    
    require(baseDirectory.isAbsolute)


    def newHash(path: Path) = Hash(Files.hash(path.toFile, digestMethod).asBytes)
 
    def newLabel(path: String): Label = newLabel(baseDirectory.resolve(FileSystems.getDefault.getPath(path)))
    
    
    def newLabel(path: Path): Label = {
      val absPath = path.toAbsolutePath.normalize
      require(absPath.startsWith(baseDirectory), "path exists outside of workspace")
      return new Label(baseDirectory.relativize(absPath))
    }

    def resolveLabel(label: Label) = label.toPath(baseDirectory)
    
 
  }
  
  def apply(baseDirectory: Path): Workspace = new DefaultWorkspace(baseDirectory)

}