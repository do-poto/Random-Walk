//main function of the project
fun main(args: Array<String>){
    //create all class objects
    var myWalk = WalkSimualtion();      //used for making the walk
    var myCommunicator = FileCommunicator();        //used for writing and reading from files
    
    //array lists for storing values 
    var inputArray : ArrayList<String> = arrayListOf<String>();     //array of inputs for walk
    var walkValueArray : ArrayList<Int> = arrayListOf<Int>();       //array of walk values
    var walkPathArray : ArrayList<String> = arrayListOf<String>();      //array of walk paths
    //neeed vars
    var chanceUp : Double? = null;      //var for storing chance of walk going up
    var numberOfSteps : Int? = null;        //var for storing number of steps walk has to take
    var inputFile : String = "InputData.txt";       //input file
    var outputFile : String = "OutputFile.txt"      //output file
    
    //read all inputs from file
    inputArray = myCommunicator.read(inputFile);
    //read all inputs into vars
    for(input in inputArray){
        var inputsSplit = input.split(";")      //split inputs at ";"
        chanceUp = inputsSplit[0].toDouble();       //first part is the chance of going up
        numberOfSteps = inputsSplit[1].toInt();     //second is the number of steps to be taken
        //perform the walk
        var (walkValue, walkPath) = myWalk.walk(chanceUp!!, numberOfSteps!!);
        walkValueArray.add(walkValue);      //add walk value to the array 
        walkPathArray.add(walkPath);        //ad walk path to the array
    }
    //write the results to the output file
    myCommunicator.write(walkValueArray, walkPathArray, walkValueArray.size, outputFile);

}