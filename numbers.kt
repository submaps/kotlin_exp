fun main(args: Array<String>) {
          val input = "4 8 0 3 4 2 0 3"
        val numbers = input.split(' ')
    println(numbers)
        val result = ArrayList<String>()
        for (item in numbers) {
            if (numbers.filter { it == item }.count() > 1 && !result.contains(item)) result.add(item)   
        }
        println(result)
    
    val sorted = input.split(' ').map(String::toInt).sorted()
    println(sorted)
    sorted.iterator().
}
