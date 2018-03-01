package filesearcher
import java.io.File

class Matcher (filter: String, rootLocation: String) {
    val rooIOObject = FileConverter.convertToIOObject(new File(rootLocation))
    def execute () = {
        val matchedFiles = rooIOObject match {
            case file : FileObject if FilterChecker(filter) matches file.name => List(file)
            case directory : DirectoryObject => ???
            case _ => List()
        }
        matchedFiles map(iOObj => iOObj.name)
    }
}

object Matcher {
    def apply(filter: String, rootLocation: String ) = new Matcher(filter, rootLocation)
}