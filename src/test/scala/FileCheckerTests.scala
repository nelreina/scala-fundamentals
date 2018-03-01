package filesearcher;

import org.scalatest.FlatSpec;
import java.io.File

class FileCheckerTests extends FlatSpec {
    
    
    "FileChecker passed a list where one file matches the filter" should 
    "return a list with that file" in {
        val matchingFile = FileObject (new File("match"))
        val listOfFiles = List(FileObject (new File("random")), matchingFile)
        val matchedFiles = FilterChecker("match") findMatchedFiles listOfFiles
        assert(matchedFiles == List(matchingFile))
    }


    "FileChecker passed a list with a directory that matches the filter" should 
    "should not return the directory" in {
        val listOfObjects = List(FileObject (new File("random")), DirectoryObject( new File("match")))
        val matchedFiles = FilterChecker("match") findMatchedFiles listOfObjects
        assert(matchedFiles.length == 0 )
    }

}