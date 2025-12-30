import kotlin.system.exitProcess
class WalkSimualtion{
    //initlialize walk simulation
    fun simulateWalk(chanceUp : Double, numberOfSteps : Int){
            //vars for walk simulation decalred
            var i : Int = 0; //iteratior for while loop
            var x : Int = 0; //initial value of x

            if(chanceUp <= 1){
                //calculate the down chance via 1 - p, where p is chance for up
                var chnaceDown : Double = 1 - chanceUp;  
            }else{
                //incompatible number
                println("Chance of up must be p<=1, given p value: $chanceUp");
                exitProcess(1);
            }

            //simulate number of steps
            while(i <= numberOfSteps){

                i++;
            }
    }
}