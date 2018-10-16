public class Context{}
public class BladeInputParams{
    val HPC: Boolean = true;
    val coliderData: IntArray = intArrayOf(1, 2, 3);
}
enum class SuperComputerModes {
    HPC
}
enum class DeadLineDates {
    NOT_SOON
}
 public class BladeRunner {
 constructor (context: Context, inputParams: BladeInputParams){
  	   val inputParams = inputParams;
  	   if (inputParams.HPC){
           val superComputerMode = SuperComputerModes.HPC;
           val coliderData = inputParams.coliderData;
           val deadlineDate = DeadLineDates.NOT_SOON;
           runSuperAI();
       }
  }
     fun runSuperAI(){
          println("super AI started") 
 }
}
 
fun main(){
    val bladeRunner = BladeRunner(Context(), BladeInputParams());
}
