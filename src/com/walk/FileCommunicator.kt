import java.io.File
import java.io.InputStream

class FileCommunicator(){
    //reading function
    fun read(inputFile : String) : ArrayList<String> {
        //read all input from file
        val inputStream : InputStream = File(inputFile).inputStream();      //create file stream input reader
        var inputArray : ArrayList<String> = arrayListOf<String>();       //initialize linked list for storing input

        //add all lines as Strings to inputArray
        inputStream.bufferedReader().forEachLine{
            inputArray.add(it);
        }

        return inputArray;
    }

    //output file creating function
    fun create(walkValueArray : Array<Int>, walkPathArray : Array<String>, lenght : Int, outputFile : String){
        //vars declared
        var i = 0;
        var printingString : String = "";
        //for each element add it to the file
        while(i < lenght){
            printingString = walkValueArray[i].toString() + ";" + walkPathArray[i].toString() + "\n";       //create string to be written
            File(outputFile).appendText(printingString);        //write to file
            printingString = "";
            i++
        }
    }

}
