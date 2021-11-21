fun demoFilter(){
    /*
        filter applies a condition on a collection. In our case, it is a list
        a new list is created after the operation
        the original list is untouched and the original data can be used again if needed
     */
    val participants: List<String> = listOf("Kherin", "Mervyn", "Chervine", "Alain")

    val shortNamedParticipants = participants.filter { it.length == 5 }

    println("original participants list: $participants")
    println("short named participants: $shortNamedParticipants")
}

fun demoMap(){
    /*
        .map create a collection from the result of the mapping transformation on another collection
        In another word, while looping in the collection (here a list), a transformation is applied on each element
        At the end a new list is created containing the newly transformed elements.
        The original list is untouched and the original data can be used again if needed
     */
    val participants: List<String> = listOf("Kherin", "Mervyn", "Chervine", "Alain")

    val participantsEmail = participants.map {
        "$it@mcb.mu"
    }

    println("participants name: $participants")
    println("participants email: $participantsEmail")
}

fun demoFilterAndMap(){
    // apply transformation on only short named participants
    val participants: List<String> = listOf("Kherin", "Mervyn", "Chervine", "Alain")

    val shortNamedParticipantsEmail = participants
                                .filter { it.length == 5 }
                                .map {"$it@mcb.mu"}

    println("participants name: $participants")
    println("participants email: $shortNamedParticipantsEmail")
}

fun demoCondition(userInput: Int){
    var maxValue = 16

    // syntax 1
    maxValue = if(userInput > maxValue) userInput else maxValue

    println("max value after syntax1: $maxValue")

    // syntax 2
    if(userInput > maxValue) {
        maxValue = userInput
    } else {
        maxValue
    }

    println("max value after syntax2: $maxValue")
}

fun demoWhen(participantRole: String){
    /*
        Instead of writing a lot of else if, we can directly test for a condition in a when.
        In the when, write the condition to test and underneath each test condition
        In the end, there is an else statement to catch any condition we might not have thought of
     */

    val commonSentence = when (participantRole) {
        "Engineer", "Software Engineer", "Slave" -> "You have no life"
        "Scrum master" -> "You cannot do this in Agile. You will die"
        "PO" -> "When will this be moved to done"
        "BA" -> "I write user story"
        "QA" -> "Sorry there is a bug"
        else -> "Who am I"
    }

    println("Common sentence of a $participantRole is $commonSentence")
}

fun demoNullSafety(participantName: String?){
    /*
        using '?.' just after a nullable variable
        this will decide what to do if the variable is null
        else variable is not null, it can be used
     */

    val participantNameLength = participantName?.length
    println("participantNameLength: $participantNameLength")

    /*
        The line that follows is something that SHOULD NOT BE DONE
        using !! means you are telling the compilor that the variable can never be null and considers that it is not null
        in this case, if a null values is provided, everything crashes.

        -> To uncomment line 98 and 99 during demo
     */
//    val participantNameLengthWrong = participantName!!.length
//    println("participantNameLength: $participantNameLengthWrong")
}

fun demoForLoop() {
    val participants: List<String> = listOf("Kherin", "Mervyn", "Chervine", "Alain")
    for(participant in participants){
        println("Hello, my name is $participant")
    }
}

fun demoWhileLoop(){
    var i = 1
    while (i<=5){
        println(i)
        i++
    }
}

fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments at Run/Debug configuration
//    println("Program arguments: ${args.joinToString()}")
//
//    // filter demo
//    demoFilter()
//
//    // map demo
//    demoMap()
//
//    // map and filter demo
//    demoFilterAndMap()
//
//    // condition syntax1
//    demoCondition(4)
//    demoCondition(17)

//    // when demo
//    demoWhen("Slave")

//    // null safety demo
//    demoNullSafety(null)
//    demoNullSafety("Mervyn")

    // loops
//    demoForLoop()
    demoWhileLoop()
}