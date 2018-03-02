package filesearcher
import java.io.File

class Matcher (filter: String, val rootLocation: String = new File(".").getCanonicalPath()) {
    val rooIOObject = FileConverter.convertToIOObject(new File(rootLocation))
    def execute () = {
        val matchedFiles = rooIOObject match {
            case file : FileObject if FilterChecker(filter) matches file.name => List(file)
            case directory : DirectoryObject => 
                FilterChecker(filter) findMatchedFiles directory.children()
            case _ => List()
        }
        matchedFiles map(iOObj => iOObj.name)
    }
}

object Matcher {
    def apply(filter: String ) = new Matcher(filter)
    def apply(filter: String, rootLocation: String ) = new Matcher(filter, rootLocation)
}