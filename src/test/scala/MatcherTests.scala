package filesearcher;

import org.scalatest.FlatSpec;

import java.io.File

class MatcherTests extends FlatSpec {
    
    
    "Matcher that is passed a file matching the filter" should 
    "return a list with that file name" in {
        val matcher = Matcher("fake", "fakePath")
        val result = matcher.execute();
        assert(result == List("fakePath"))
    }

    "Matcher using a directory containing one file matching the filter" should
    "return a list with that file name" in {
        val matcher = Matcher("txt", new File(".\\data\\").getCanonicalPath())
        val result = matcher.execute()
        assert(result == List("readme.txt"))
    }

    "Matcher that is not passed the file Location" should
    "use currenct location" in {
        val matcher = Matcher("txt")
        assert(matcher.rootLocation == new File(".").getCanonicalPath())
    }

}