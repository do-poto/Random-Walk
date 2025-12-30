import kotlin.system.exitProcess

class WalkSimualtion(){
        //vars for walk simulation decalred
        var chanceDown : Double? = null;        //var for storing chance if going down
        var randomInt : Int? = null;        //var for generating random int
        var randomDouble : Double? = null;      //var for storing a random double
        var i : Int = 0;    //iteratior for while loop
        var x : Int = 0;    //initial value of x
        var walkRecord : String = "";       //record of the walk  

        fun walk(chanceUp : Double, numberOfSteps : Int) : Pair<Int, String> {
            //check for correct input
            if(chanceUp <= 1){
                //calculate the down chance via 1 - p, where p is chance for up
                chanceDown = 1 - chanceUp;
            }else{
                //incompatible number
                println("Chance of up must be p<=1, given p value: $chanceUp");
                exitProcess(1);
            }

            //simulate number of steps
            while(i < numberOfSteps){
                randomInt = (0..100).random();    //generate random int in range
                randomDouble = (randomInt!!.toDouble())/100;       //change int to double

                //decide the direction of walk
                if(randomDouble!! > chanceDown!!){
                    //walking up
                    walkRecord += "U";      //append walkRecord with data of going up
                    x += 1;     //increment value of x by +1
                }else{
                    //walking down
                    walkRecord += "D";      //append walkRecord with data of going down
                    x += -1;        //increment value of x by -1
                }
                i++;

                return Pair(x, walkRecord);
            }
        }
}
