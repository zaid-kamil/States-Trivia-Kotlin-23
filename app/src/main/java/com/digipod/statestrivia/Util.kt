package com.digipod.statestrivia

class Util {
    companion object {
    fun generate(): MutableList<State> {
        return mutableListOf(
            State(
                "Uttar Pradesh",
                desc = "with a total area of 243,290 square kilometres (93,935 sq mi), is India's fourth-largest state in terms of land area and is roughly of same size as United Kingdom",
                trivia = "The first recorded human settlement in Uttar Pradesh took place around 70 or 80 thousand years ago. They lived as hunter-gatherers and spread all across the state."
            ),
            State("Maharashtra"),
            State("Bihar"),
            State("West Bengal"),
            State("Madhya Pradesh"),
            State("Tamil Nadu"),
            State("Rajasthan"),
            State("Karnataka"),
            State("Gujarat"),
            State("Andhra Pradesh"),
            State("Odisha"),
                State("Telangana"),
                State("Kerala"),
                State("Jharkhand"),
                State("Assam"),
                State("Punjab"),
                State("Chhattisgarh"),
                State("Haryana"),
                State("Uttarakhand"),
                State("Jammu and Kashmir"),
                State("Himachal Pradesh"),
                State("Tripura"),
                State("Meghalaya"),
                State("Manipur"),
                State("Nagaland"),
                State("Arunachal Pradesh"),
                State("Mizoram"),
            )
        }
    }
}

