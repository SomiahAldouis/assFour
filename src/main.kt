fun main(){
    // Q1
    var arrayName = arrayOf(0,1,2,3,4,5,6,7,8,9)
    for(i in arrayName.indices){ println (arrayName[i])}

    //Q2
    var numberPhone= listOf(77,71,73,70)
    println(numberPhone[0])
    println(numberPhone[numberPhone.size-1])

    //Q3
    val decorations= listOf("rock","pagoda","plastic plant","alligator","flowerpot")
    println(decorations.filter { it.contains('p') })

    //Q4
    val list = listOf(8,4,7,1,2,3,0,5,6)
//    list = list.sorted()
    println("Sort into ascending: ${list.sorted()}")
//    list =list.sortedDescending()
    println("Sort into descending: ${list.sortedDescending()}")

    //Q5
    val bob = Person("Bob", 31)
    val people = listOf(Person("Adam",20), bob, bob)
    val people2 = listOf(Person("Adam",20),Person("Adam",20), bob)
    println(people == people2)
    bob.age= 32
    println(people == people2)
}

