class Solution {
   fun solution(survey: Array<String>, choices: IntArray): String {
        var answer = StringBuilder()
        
        val choiceScore = mapOf<Int, Int>(
            1 to 3, 2 to 2, 3 to 1,
            4 to 0, 
            5 to 1, 6 to 2, 7 to 3
        )
        
        val characterScore = mutableMapOf<Char, Int>(
            'R' to 0, 'T' to 0,
            'C' to 0, 'F' to 0,
            'J' to 0, 'M' to 0,
            'A' to 0, 'N' to 0,
        )

        for ((index, s) in survey.withIndex()) {
            if (choices[index] == 4) {
                continue
            } else if (choices[index] < 4) {
                characterScore[s[0]] = (characterScore.getOrDefault(s[0], 0))+choiceScore.getOrDefault(choices[index], 0)
            } else {
                characterScore[s[1]] = (characterScore.getOrDefault(s[1], 0))+choiceScore.getOrDefault(choices[index], 0)
            }
        }
        
        if (characterScore.getOrDefault('R', 0) >= characterScore.getOrDefault('T', 0)) {
            answer.append("R")
        } else {
            answer.append("T")
        }

        if (characterScore.getOrDefault('C', 0) >= characterScore.getOrDefault('F', 0)) {
            answer.append("C")
        } else {
            answer.append("F")
        }

        if (characterScore.getOrDefault('J', 0) >= characterScore.getOrDefault('M', 0)) {
            answer.append("J")
        } else {
            answer.append("M")
        }

        if (characterScore.getOrDefault('A', 0) >= characterScore.getOrDefault('N', 0)) {
            answer.append("A")
        } else {
            answer.append("N")
        }

        return answer.toString()
    }
}