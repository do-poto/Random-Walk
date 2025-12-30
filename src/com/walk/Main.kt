//main function of the project
fun main(args: Array<String>){
    //create all class objects
    var myWalk = WalkSimualtion();
    var myCommunicator = FileCommunicator();
    
    //declaring vars for results and operations
    var inputArray : ArrayList<String> = arrayListOf<String>();
    var walkValueArray : ArrayList<Int> = arrayListOf<Int>();
    var walkPathArray : ArrayList<String> = arrayListOf<String>();
    var chanceUp : Double? = null;
    var numberOfSteps : Int? = null;
    var inputFile : String = "InputData.txt";
    var outputFile : String = "OutputFile.txt" 
    
    inputArray = myCommunicator.read(inputFile);
    for(input in inputArray){
        var inputsSplit = input.split(";")
        chanceUp = inputsSplit[0].toDouble();
        numberOfSteps = inputsSplit[1].toInt();
        var (walkValue, walkPath) = myWalk.walk(chanceUp!!, numberOfSteps!!);
        walkValueArray.add(walkValue);
        walkPathArray.add(walkPath);
    }
    myCommunicator.write(walkValueArray, walkPathArray, walkValueArray.size, outputFile);

}